package com.tian.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Description: 类表述
 * @Author: zjh
 * @Date: 2021/3/1
 **/
@Entity
@Getter
@Setter
@Table(name = "banner_item")
public class BannerItem extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String img;
    private String keyword;
    private short type;
    private long bannerId;
    private String name;

}
