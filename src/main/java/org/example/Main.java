package org.example;

public class Main {
    public static void main(String[] args) {
        Country myObj = new Country();
       // Country myObj = new Country();
        myObj.setCity("queensland");
        myObj.setName("australia");
        myObj.setNum(2200);
        System.out.println(myObj.getName());
       System.out.println(myObj.getCity());
       System.out.println(myObj.getNum());
    }
}