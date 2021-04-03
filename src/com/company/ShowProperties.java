package com.company;

import java.util.Date;

public class ShowProperties {
    public static void showProperties(){
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }

    public static String helloDate(String userName){
        String result = "Hello, " + userName + ", today is " + new Date();
        return result;
    }

    public static int sumNumber(int firstNum, int secondNum){
        return firstNum + secondNum;
    }

    public static String testModule(){
        return "successfully";
    }

}
