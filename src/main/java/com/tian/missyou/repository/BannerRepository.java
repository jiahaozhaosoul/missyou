package com.tian.missyou.repository;

import com.tian.missyou.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 接口表述
 * @Author: zjh
 * @Date: 2021/2/24
 **/
public interface BannerRepository extends JpaRepository<Banner, Long> {

    Banner findOneByName(String name);

}
