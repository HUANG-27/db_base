package com.cetc28.sakila.service.impl;

import com.cetc28.sakila.entity.Customer;
import com.cetc28.sakila.mapper.CustomerMapper;
import com.cetc28.sakila.service.ICustomerService;
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
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
