package com.MyHostelProject.MyHostel.controller;

import com.MyHostelProject.MyHostel.model.UserModel;
import com.MyHostelProject.MyHostel.services.MemberService;
import com.MyHostelProject.MyHostel.services.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class Member {

    @Autowired
    public MemberService memberService;

    @GetMapping("/members")
    public List<UserModel> getMembers(){
        return memberService.findAllMembers();

    }

    @GetMapping("/members/{id}")
    public UserModel getMemberById(@PathVariable int id){

        return memberService.findMemberById(id);
    }

    @PostMapping("/member")
    public void addNewMember(@Valid @RequestBody UserModel userModel){

        memberService.createNewMember(userModel);
    }

    @PutMapping("/members/update/{id}")
    public String updateMember(@PathVariable int id, UserModel userModel){
         return memberService.updateMemberById(id, userModel);
    }

    @DeleteMapping("members/delete/{id}")
    public String deleteMember(@PathVariable int id){

        return memberService.deleteById(id);

    }

}
