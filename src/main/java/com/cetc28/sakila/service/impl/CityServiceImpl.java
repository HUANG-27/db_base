package com.cetc28.sakila.service.impl;

import com.cetc28.sakila.entity.City;
import com.cetc28.sakila.mapper.CityMapper;
import com.cetc28.sakila.service.ICityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cetc28
 * @since 2021-08-26
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

}
