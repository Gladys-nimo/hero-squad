package models;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown()  {
    }

    @Test
    public void newSquad_instantiatesCorrectly() {
        Squad newSquad = Squad.setUpNewSquad();
        assertTrue(newSquad instanceof Squad);

    }
//    @Test
//    public void newSquadName_getName_String() {
//        Squad newSquad = Squad.setUpNewSquad();
//        assertEquals("",newSquad.getName());
//    }
    @Test
    public void newSquad_getSquadName_String() {
        Squad newSquad = Squad.setUpNewSquad();
        assertEquals("Avengers",newSquad.getSquadName());
    }
  @Test
    public void newSquad_getSize_Int()  {
        Squad newSquad = Squad.setUpNewSquad();
        assertEquals(5,newSquad.getSize());
    }
    @Test
    public void newSquad_getPower_String() {
        Squad newSquad = Squad.setUpNewSquad();
        assertEquals("Infinity Stone",newSquad.getCause());
    }
@Test
    public void newSquad_getInstances_true() {
        Squad newSquad = Squad.setUpNewSquad();
        Squad another = Squad.setUpNewSquad();
        assertTrue(Squad.getInstances().contains(newSquad));
        assertTrue(Squad.getInstances().contains(another));
    }
    @Test
    public void newSquad_getSquadMembers_Array() {
        Squad newSquad = Squad.setUpNewSquad();
        Hero newHero1 = Hero.setUpNewHero1();
        newSquad.setSquadMembers(newHero1);
        assertEquals("","",newSquad.getSquadMembers().get(0).getName());
    }

    @Test
    public void newSquad_allTestSquadMembers_Array() {
        Hero newHero = Hero.setUpNewHero();
        Squad newSquad = Squad.setUpNewSquad();
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(newHero);
        newSquad.getSquadMembers().add(newHero);
        assertEquals("Gladys",newSquad.getSquadMembers().get(0).getName());
    }
//    @Test
//    public void addMember_addsMemberToSquad_Hero(){
//        Hero newHero = Hero.setUpNewHero();
//        Squad newSquad = Squad.findSquadById(0);
//        newSquad.clearAllSquadMembers();
//        newSquad.getSquadMembers().add(newHero);
//        newSquad.getSquadMembers().add(newHero);
//        assertEquals(1,newSquad.getSquadMembers().get(0).getId());
//
//    }

    @Test
    public void setNewMember_hero(){
        Hero.clearAllHeroes();
        Hero newHero = Hero.setUpNewHero();
        Squad testSquad = Squad.setUpNewSquad();
        testSquad.setSquadMembers(newHero);
        assertEquals(1,testSquad.getSquadMembers().get(0).getId());
    }
//    public Squad setUpNewSquad(){
//        return new Squad("",5,"");
//    }

}