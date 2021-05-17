package com.tian.missyou.service.impl;

import com.tian.missyou.model.Spu;
import com.tian.missyou.repository.SpuRepository;
import com.tian.missyou.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 类表述
 * @Author: zjh
 * @Date: 2021/3/2
 **/
@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    private SpuRepository spuRepository;

    @Override
    public Spu getSpu(Long id) {
        return spuRepository.findOneById(id);
    }

    @Override
    public List<Spu> getSpuPageList() {
        return spuRepository.findAll();
    }


}
