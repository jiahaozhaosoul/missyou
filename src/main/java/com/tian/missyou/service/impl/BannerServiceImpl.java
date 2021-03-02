package com.tian.missyou.service.impl;

import com.tian.missyou.model.Banner;
import com.tian.missyou.repository.BannerRepository;
import com.tian.missyou.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 类表述
 * @Author: zjh
 * @Date: 2021/2/24
 **/
@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerRepository bannerRepository;

    @Override
    public Banner getByName(String name) {
        return bannerRepository.findOneByName(name);
    }
}
