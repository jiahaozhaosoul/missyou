package com.tian.missyou.service;

import com.tian.missyou.model.Spu;

import java.util.List;

/**
 * @Description: 接口表述
 * @Author: zjh
 * @Date: 2021/3/2
 **/
public interface SpuService {

    Spu getSpu(Long id);

    List<Spu> getSpuPageList();

}
