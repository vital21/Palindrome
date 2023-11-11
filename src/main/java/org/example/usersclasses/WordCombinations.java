package org.example.usersclasses;

import org.example.logics.LogicRating;

import java.util.ArrayList;
import java.util.HashMap;

public class WordCombinations {

    // проверка палиндрома на дубликат , в случае если такого не было, то добавляется рейтинг
    public WordCombinations(String palindrome, String userName,int rating){
        ArrayList<User> users = NewUserInGame.getUsers();
        for(User user : users){
            if(user.getUserName().equals(userName)){

                ArrayList<String> wordRepeat =user.getWord();
                if(wordRepeat.contains(palindrome)){
                    System.out.println("Такой палиндром уже был написан");
                }
                else {
                    user.addWord(palindrome);
                    LogicRating.RatingUsersAdd(userName,rating);
                }
            }
        }
    }

}
