package com.MyHostelProject.MyHostel.services;

import com.MyHostelProject.MyHostel.model.UserModel;

import java.util.List;

public interface MemberService {

    public String createNewMember(UserModel userModel);
    public List<UserModel> findAllMembers();
    public UserModel findMemberById(int id);
    public String updateMemberById(int id, UserModel userModel);
    public String deleteById(int id);
}
