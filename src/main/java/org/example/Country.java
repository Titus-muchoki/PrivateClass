package org.example;

public class Country {
    private String name;
    private String city;
    int num;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNum() {
        return num;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setCity(String newCity){
        this.city = newCity;
    }
    public void setNum(int newNum){
        this.num = newNum;
    }
}
