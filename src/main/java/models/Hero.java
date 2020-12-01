package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static ArrayList<Hero> instances = new ArrayList<>();
    public Hero (String name, Integer age, String power, String weakness){
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
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
    public String getWeakness() {
        return weakness;
    }
    public static ArrayList<Hero> getAllInstances() {return instances;}
    public static void clearAllHeroes(){instances.clear();}
    public int getId(){return id;}
    public static Hero findById(int id) {return instances.get(id-1);}

    public static Hero setUpNewHero(){
        return new Hero("Gladys",23,"flying","fire");
    }
    public static Hero setUpNewHero1(){
        return new Hero("Jane",30,"Night Vision","Light");
    }
    public static Hero setUpNewHero2(){
        return new Hero("Anita",30,"Night Vision","Light");
    }




}
