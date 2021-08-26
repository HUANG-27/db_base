package com.cetc28.sakila.service.impl;

import com.cetc28.sakila.entity.Category;
import com.cetc28.sakila.mapper.CategoryMapper;
import com.cetc28.sakila.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
