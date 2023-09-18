package com.user.Repo;

import com.user.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepo {

    @Autowired
    private List<User> arrList;

    public List<User> getArrList() {
        return arrList;
    }

    public void setArrList(List<User> arrList) {
        this.arrList = arrList;
    }
}
