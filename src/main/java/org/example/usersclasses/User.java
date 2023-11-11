package org.example.usersclasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SplittableRandom;

public class User {
private static int id=0;
private final String userName;
private int userRating;
private ArrayList<String> word = new ArrayList<>();



    public User(String userName) {
        this.id = this.id+1;
        this.userName = userName;
        userRating = 0;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }
    public ArrayList<String> getWord() {
        return word;
    }

    public void setWord(ArrayList<String> word) {
        this.word = word;
    }
    public void addWord(String word){
        this.word.add(word);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userRating=" + userRating +
                ", word=" + word +
                '}';
    }
}
