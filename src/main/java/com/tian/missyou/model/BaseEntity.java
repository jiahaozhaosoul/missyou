package com.tian.missyou.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Description: 类表述
 * @Author: zjh
 * @Date: 2021/3/1
 **/
@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

    @JsonIgnore
    private Date createTime;
    @JsonIgnore
    private Date updateTime;
    @JsonIgnore
    private Date deleteTime;

}
