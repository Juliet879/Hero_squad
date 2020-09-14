package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest{


  @Test
  public void HeroInstantiateContent_true(){
      Hero hero = new Hero("Intro");
      assertEquals("Intro",hero.getContent);
  }
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