package models;

//import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private String power;
//    private String power;
//    private String weakness;
//    private static ArrayList<Hero> instances = new ArrayList<>();
    public Hero (String name, Integer age, String power){
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getPower() {
        return power;

    }





}
