package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest{
    @After
    public void tearDown() {

    }

  @Test
  public void HeroInstantiateContent_true() throws Exception{
      Hero hero = new Hero("Day: Intro");
      assertEquals("Day: Intro",hero.getContent());
  }
//  public Hero setUpNewHero(){
//        return new Hero("Intro");
//  }
//
//    @Test
//    public void hero_getName_String() {
//        Hero hero = new Hero();
//        assertEquals("Dominic",hero.getName());
//    }


//   @Test
//   public void HeroName_true(){
//      Hero hero = new Hero ("Dc Dominic");
//      assertEquals("Dc Dominic",hero.getName());
//   }
}