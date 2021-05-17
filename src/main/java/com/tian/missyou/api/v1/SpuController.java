package com.tian.missyou.api.v1;

import com.tian.missyou.exception.http.NotFundException;
import com.tian.missyou.model.Spu;
import com.tian.missyou.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @Description: 类表述
 * @Author: zjh
 * @Date: 2021/3/2
 **/
@RestController
@RequestMapping("/spu")
public class SpuController {

    @Autowired
    private SpuService spuService;

    @GetMapping("/id/{id}/detail")
    public Spu getSpu(@PathVariable Long id) {
        Spu spu = spuService.getSpu(id);
        if (spu == null) {
            throw new NotFundException(30003);
        }
        return spu;
    }

    @GetMapping("/get/latest/spu/list")
    public List<Spu> getLatestSpuList() {
        List<Spu> spuList = spuService.getSpuPageList();
        if (CollectionUtils.isEmpty(spuList)) {
            throw new NotFundException(30003);
        }
        return spuList;
    }

}
