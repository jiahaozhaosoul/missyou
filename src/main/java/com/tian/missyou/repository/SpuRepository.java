package com.tian.missyou.repository;

import com.tian.missyou.model.Spu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 接口表述
 * @Author: zjh
 * @Date: 2021/3/2
 **/
public interface SpuRepository extends JpaRepository<Spu, Long> {

    Spu findOneById(Long id);

}
