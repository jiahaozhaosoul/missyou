package com.tian.missyou.api.v1;

import com.tian.missyou.dto.PersonDTO;
import com.tian.missyou.exception.http.ForbiddenException;
import com.tian.missyou.exception.http.NotFundException;
import com.tian.missyou.sample.ISkill;
import com.tian.missyou.sample.hero.Irelia;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Slf4j
@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {

    private ISkill camille;

    public BannerController(ISkill camille) {
        this.camille = camille;
    }

    @PostMapping("/test/{id}")
    public PersonDTO test(@PathVariable @Max(value = 2, message = "id to long") Integer id,
                          @RequestParam @Length(min = 8, message = "name is to short") String name,
                          @Valid @RequestBody PersonDTO personDTO) {
        log.info(String.valueOf(123));
        return personDTO;
    }

}
