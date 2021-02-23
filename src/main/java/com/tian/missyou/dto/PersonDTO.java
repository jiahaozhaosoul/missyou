package com.tian.missyou.dto;

import com.tian.missyou.validators.PasswordEqual;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;

/**
 * @Description: 类表述
 * @Author: zjh
 * @Date: 2021/2/23
 **/
@Getter
@Setter
@PasswordEqual(message = "MINXXXXXX11")
public class PersonDTO {

    @Length(max = 4, message = "nameXXXXXERROR")
    private String name;

    private Integer age;

    private String password1;

    private String password2;

}
