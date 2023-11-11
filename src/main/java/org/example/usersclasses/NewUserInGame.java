package org.example.usersclasses;
import org.example.logics.GameMenu;
import java.util.ArrayList;
import java.util.Scanner;

public class NewUserInGame  {
private static ArrayList<User> users = new ArrayList<>();

    public NewUserInGame() {

        newUser();
    }
    //добавление нового пользователя
    public static void newUser(){
        System.out.println("Введите имя пользователя");
        Scanner scanner = new Scanner(System.in);
        String userName=scanner.nextLine();
        User user = new User(userName);
        users.add(user);
        System.out.println("Пользователь добавлен");
        new GameMenu();}
    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        NewUserInGame.users = users;
    }
}
