package org.example.logics;

import org.example.usersclasses.NewUserInGame;
import org.example.usersclasses.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LogicRating {
    LogicRating(){
        RatingOut();
    }
   public static void RatingUsersAdd(String userName, int ratingNum){
        ArrayList<User> users= NewUserInGame.getUsers();
        for (User user:users) {
            if(user.getUserName().equals(userName)){
                user.setUserRating(user.getUserRating()+ratingNum);
            }
        }
    }

    public static void RatingOut(){
        ArrayList<User> users= NewUserInGame.getUsers();
        Collections.sort(users, Comparator.comparingInt(User::getUserRating).reversed());
        int num=0;
        for (User user:users) {
            if(num!=5) {
                System.out.println(user.toString()+"\n");
            }
            num++;
        }
    }
}
