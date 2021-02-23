package com.tian.missyou.sample.hero;


import com.tian.missyou.sample.ISkill;
import org.springframework.stereotype.Component;

//刀妹
//@Component
public class Irelia implements ISkill {

    public Irelia() {
        System.out.println("Select Arilia");
    }

    public void q() {
        System.out.println("Arilia Q");
    }

    public void w() {
        System.out.println("Arilia W");
    }

    public void e() {
        System.out.println("Arilia E");
    }

    public void r() {
        System.out.println("Arilia R");
    }
    
}
