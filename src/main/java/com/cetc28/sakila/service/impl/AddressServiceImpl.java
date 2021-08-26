package com.cetc28.sakila.service.impl;

import com.cetc28.sakila.entity.Address;
import com.cetc28.sakila.mapper.AddressMapper;
import com.cetc28.sakila.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
