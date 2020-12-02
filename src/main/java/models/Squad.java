package models;


import java.util.ArrayList;
import java.util.List;

public class Squad {

    private int SquadId;
    private  String Name;
    private int Size;
    private String cause;
    private ArrayList<Hero> squadMembers = new ArrayList<>();
    private static List<Squad> instances = new ArrayList<>();

    public Squad (String name, int size, String cause){
        Name = name;
        Size = size;
        this.cause = cause;
        this.squadMembers = new ArrayList<>();
        instances.add(this);
        this.SquadId = instances.size();
    }
    public int getSquadId(){

        return SquadId;
    }

//    public String getName() {
//        return this.Name;
//    }

    public static Squad findSquadById(int id) {

        return instances.get(id-1);
    }
    public String getSquadName(){
        return this.Name;
    }
    public int getSize() {
        return this.Size;
    }

    public String getCause() {

        return this.cause;
    }
    public static List<Squad> getInstances(){

        return instances;
    }
    public void setSquadMembers(Hero newMember){

        squadMembers.add(newMember);
    }
    public ArrayList<Hero> getSquadMembers(){

        return squadMembers;
    }
    public static void clearAllSquads(){
        instances.clear();
    }
    public void clearAllSquadMembers(){
        getSquadMembers().clear();
    }

    public static Squad setUpNewSquad(){
        return new Squad("Avengers",5,"Infinity Stone");
    }
    public static Squad setUpNewSquad1(){
        return new Squad("GameBoy",5,"PUBG");
    }

}
