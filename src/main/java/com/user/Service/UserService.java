package com.user.Service;

import com.user.Entity.User;
import com.user.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    @Autowired
    UserRepo userRepo;


    public String addUser(User user) {
        userRepo.getArrList().add(user);
        return "Added";
    }


    public List<User> deleteUser(Integer id) {
            for (int i = 0; i < userRepo.getArrList().size(); i++) {
                if (id.equals(userRepo.getArrList().get(i).getResId())){
                    userRepo.getArrList().remove(userRepo.getArrList().get(i));
                    break;
                }
            }
        return userRepo.getArrList();

    }

    public String addAllUser(List<User> mylist) {
        userRepo.getArrList().addAll(mylist);
        return mylist.size()+" Were Added !!";
    }

    public List<User> getAllUser() {
        return userRepo.getArrList();
    }

    public List<User> getUser(Integer id) {
        List<User> result=new ArrayList<>();
        for (User rest:userRepo.getArrList()) {
            if (id.equals(rest.getResId())){
                result.add(rest);
            }
        }
        return result;
    }

    public String updateUser(Integer id,String uName) {
        for (User rest:userRepo.getArrList()) {
            if (id.equals(rest.getResId())){
                rest.setResName(uName);
                return "Updated Successfully !!";
            }
        }
        return "Invalid ";
    }
}
