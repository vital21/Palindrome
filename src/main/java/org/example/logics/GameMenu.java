package org.example.logics;

import org.example.logicInterface.GameMenuInterface;
import org.example.usersclasses.NewUserInGame;
import org.example.usersclasses.User;
import java.util.*;

public class GameMenu implements GameMenuInterface{
public String username;
    public GameMenu(){
        menuFunction();
    }
    //вывод меню игрухи
    public void outFunctionMenu(){
        System.out.println("Привет вы находитесь в игре палиндром \n 1 - Запуск игры \n 2 - Добавить участника \n 3 - просмотреть рейтинг игроков");
    }
    //Выбор и ввод пункта меню
    public int inFunctionMenu(){
        try {
            Scanner scanner = new Scanner(System.in);
            int numberMenu;
            numberMenu=scanner.nextInt();
            return numberMenu;
        }catch ( InputMismatchException e){
            System.out.println("Выберите пункт меню");
        }
        return inFunctionMenu();
    }
    // Вывод пунктов меню и запуск функционала
    public void menuFunction(){
        outFunctionMenu();
       int numberMenu = inFunctionMenu();
       switch (numberMenu){
           case 1: player() ;
                new LogicGame(this.username);//запуск игры
                menuFunction();
                break;
           case 2: new NewUserInGame();// добавление пользователя
                menuFunction();
                break;
           case 3: new LogicRating();// вывод рейтинга игроков
                menuFunction();
                break;
       }
       }
    // для старта игры необходимо ввести имя пользователяЮ который будет играть
    public String userNameForGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя игрока");
        String username = scanner.nextLine();
        return username;
    }
    // проверка на то, создан ли был пользователь с таким именем
    public void player(){
        ArrayList<User> userList = NewUserInGame.getUsers();
        String userNameForGame= userNameForGame();
        for(User user : userList){
            if (user.getUserName().equals(userNameForGame)){
                this.username=userNameForGame;
                return;
            }
        }
            System.out.println("Пользователя с таким имменем нет, введите снова");
            menuFunction();
    }


}
