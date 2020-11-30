package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void newHero_instantiatesCorrectly_true() {
        Hero newHero = new Hero("hero",24, "","");
        assertEquals(true, newHero instanceof Hero);
    }

    @Test
    public void newHero_getName_String() {
        Hero newHero =new Hero("hero",24, "","");
        assertEquals("hero", newHero.getName());
    }

    @Test
    public void newHero_getAge_Int() {
        Hero newHero =new Hero("hero",24,"","");
        assertEquals(24, newHero.getAge());
    }

    @Test
    public void newHero_getPower_String() {
        Hero newHero =new Hero("",24,"","");
        assertEquals("",newHero.getPower());
    }

    @Test
    public void newHero_getWeakness_String() {
        Hero newHero =new Hero("", 24, "","");
        assertEquals("",newHero.getWeakness());
    }
}