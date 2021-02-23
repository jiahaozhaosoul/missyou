package com.tian.missyou.sample.hero;


import com.tian.missyou.sample.ISkill;
import org.springframework.stereotype.Component;

//皎月
//@Component
public class Diana implements ISkill {

    public void q() {
        System.out.println("Diana Q");
    }

    public void w() {
        System.out.println("Diana W");
    }

    public void e() {
        System.out.println("Diana E");
    }

    public void r() {
        System.out.println("Diana R");
    }

}
