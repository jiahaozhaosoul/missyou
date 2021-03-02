package com.tian.missyou.model1;

import javax.persistence.*;
import java.util.List;

/**
 * @Description: 类表述
 * @Author: zjh
 * @Date: 2021/3/1
 **/
@Entity
public class Spu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String subtitle;
    @ManyToMany(mappedBy = "spuList")
    private List<Theme> themeList;

}
