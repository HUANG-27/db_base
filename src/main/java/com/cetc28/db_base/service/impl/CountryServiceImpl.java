package com.cetc28.db_base.service.impl;

import com.cetc28.db_base.entity.Country;
import com.cetc28.db_base.mapper.CountryMapper;
import com.cetc28.db_base.service.ICountryService;
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
public class CountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements ICountryService {

}
