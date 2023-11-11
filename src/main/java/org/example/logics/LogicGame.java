package org.example.logics;

import org.example.logicInterface.LogicGameInterface;
import org.example.usersclasses.WordCombinations;

import java.util.ArrayList;
import java.util.Scanner;

public class LogicGame implements LogicGameInterface {
    private String userName;
    LogicGame(String username){
        this.userName=username;
        palindromeCheck();
    }

    public void outInformation(){
        System.out.println("Введите словосочетание или слово полиндром");
    }
    // ввод фразы
    public String inputPalindrome(){
        Scanner scanner = new Scanner(System.in);
        String palindrome = scanner.nextLine();
        return palindrome;
    }
// тут проверяется, является ли фраза палиндромом, если да, то добавляется пользователю как новая фраза + рейинг
    public void palindromeCheck(){
        outInformation();
        String palindrome= inputPalindrome();
        String wordPalindrome= palindrome;
        palindrome=palindrome.replaceAll(" ","");
        int rating = palindrome.length();
        String newWordPalindrome = new StringBuilder(palindrome).reverse().toString();
        if(palindrome.equals(newWordPalindrome) && palindrome.length()!=1){
            WordCombinations wordCombinations = new WordCombinations(wordPalindrome,this.userName,rating);
        }
        else {
            System.out.println("Данное словосочетание не является полиндромом \nПопробуйте ввести снова или введите 1 для выхода");
        }
        if(!palindrome.equals("1")){
            palindromeCheck();
        }
    }
}
