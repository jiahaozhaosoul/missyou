package com.tian.missyou.sample.hero;


import com.tian.missyou.sample.ISkill;
import org.springframework.stereotype.Component;

//卡米尔
@Component
public class Camille implements ISkill {

    public void q() {
        System.out.println("Camille Q");
    }

    public void w() {
        System.out.println("Camille W");
    }

    public void e() {
        System.out.println("Camille E");
    }

    public void r() {
        System.out.println("Camille R");
    }
    
}
