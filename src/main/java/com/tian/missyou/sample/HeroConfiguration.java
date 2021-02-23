package com.tian.missyou.sample;

import com.tian.missyou.sample.hero.Irelia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class HeroConfiguration {


    @Bean
    public ISkill irelia(){
        return new Irelia();
    }

}
