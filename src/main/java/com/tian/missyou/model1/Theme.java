package com.tian.missyou.model1;

import com.tian.missyou.model.Spu;

import javax.persistence.*;
import java.util.List;

/**
 * @Description: 类表述
 * @Author: zjh
 * @Date: 2021/3/1
 **/
@Entity
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String name;
    @ManyToMany
    @JoinTable(name = "theme_spu", joinColumns = @JoinColumn(name = "theme_id"),
    inverseJoinColumns = @JoinColumn(name = "spu_id"))
    private List<Spu> spuList;

}
