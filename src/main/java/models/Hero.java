package models;

import javax.swing.text.html.HTMLWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hero {
    private String content;
    private String name;
    private int age;
    private String power;
    private String weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private int id;

    public Hero(String content,String name, Integer age, String power, String weakness) {
        this.content = content;
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }

    public String getContent(){
        return this.content;
    }
//    public int getAge(){
//        return age;
//    }
//    public String getPower(){
//        return power;
//    }
//    public String getWeakness(){
//        return weakness;
////    }
//    public static Hero setUpNewHero(){
//        return new Hero("Dominic",35,"Disappearing","Ice");
//    }
    public static ArrayList<Hero> getAll(){
        return instances;
    }
}