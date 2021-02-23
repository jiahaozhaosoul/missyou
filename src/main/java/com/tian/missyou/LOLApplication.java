package com.tian.missyou;


import com.tian.missyou.sample.EnableLOLConfiguration;
import com.tian.missyou.sample.HeroConfiguration;
import com.tian.missyou.sample.ISkill;
import com.tian.missyou.sample.LOLConfigurationSelector;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

//@Import(LOLConfigurationSelector.class)
@EnableLOLConfiguration
public class LOLApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(LOLApplication.class)
                        .web(WebApplicationType.NONE)
                        .run(args);
        ISkill iSkill = (ISkill) context.getBean("irelia");
        iSkill.r();
    }

}
