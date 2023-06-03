package com.MyHostelProject.MyHostel.services;

import com.MyHostelProject.MyHostel.model.Hostel;
import com.MyHostelProject.MyHostel.model.Rating;
import com.MyHostelProject.MyHostel.model.UserModel;
import com.MyHostelProject.MyHostel.utils.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberServiceImpl implements MemberService {

   private static Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
    @Autowired
    public UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    //@Cacheable(cacheNames = "user", key = "#users.Id")
    public List<UserModel> findAllMembers(){

        logger.info("Retrieving all users details from DataBase");
        List<UserModel> users = new ArrayList<>();
        users = userRepository.findAll();


        logger.info("Retrieved "+users.size()+" users successfully from DataBase");
        return users;
    }

    @Cacheable(cacheNames = "user", key = "#id")
    public UserModel findMemberById(int id){

        logger.info("Inside find user by id service");
        UserModel user = userRepository.findById(id).get();
        logger.info("found user with id= {} and payload= {}", user.getId(), user);
        Rating[] ratingOfUSer = restTemplate.getForObject("http://RATING-SERVICE/rating/users/"+user.getId(), Rating[].class);
        logger.info("called Rating Service successfully and retrieved the ratings, payload={}", ratingOfUSer);

        List<Rating> ratingList = Arrays.stream(ratingOfUSer).collect(Collectors.toList());
        List<Rating> completeRating = ratingList.stream()
                        .map(rating ->{
                            ResponseEntity<Hostel> forEntity = restTemplate.getForEntity("http://HOSTEL-SERVICE/hostel/"+rating.getHostelId(), Hostel.class);
                            Hostel hostel = forEntity.getBody();

                            rating.setHostel(hostel);

                            return rating;})
                                .collect(Collectors.toList());
        user.setRatingList(completeRating);

            return user;

    }
    public String createNewMember(UserModel userModel) {
        userRepository.save(userModel);
        return "User Created successfully.";
    }


    //@CachePut(cacheNames = "user", key = "#id")
    public String updateMemberById(int id, UserModel userModel){
        userRepository.save(userModel);
        return "member details updated successfully!!";
    }

    @CacheEvict(cacheNames = "user", key = "#id")
    public String deleteById(int id){
        userRepository.deleteById(id);
        return "member deleted successfully!!";
    }
}
