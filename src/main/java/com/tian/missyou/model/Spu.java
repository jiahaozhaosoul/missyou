package com.tian.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Description: 类表述
 * @Author: zjh
 * @Date: 2021/3/2
 **/
@Entity
@Getter
@Setter
@Table(name = "spu")
public class Spu extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String subtitle;
    private Long categoryId;
    private Long rootCategoryId;
    private Boolean online;
    private String price;
    private Long sketchSpecId;
    private Long defaultSkuId;
    private String img;
    private String discountPrice;
    private String description;
    private String tags;
    private Boolean isTest;
//    private Object spuThemeImg;
    private String forThemeImg;

}
