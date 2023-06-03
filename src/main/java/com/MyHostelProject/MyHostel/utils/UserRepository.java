package com.MyHostelProject.MyHostel.utils;

import com.MyHostelProject.MyHostel.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
