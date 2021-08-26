package com.cetc28.sakila.service.impl;

import com.cetc28.sakila.entity.Actor;
import com.cetc28.sakila.mapper.ActorMapper;
import com.cetc28.sakila.service.IActorService;
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
public class ActorServiceImpl extends ServiceImpl<ActorMapper, Actor> implements IActorService {

}
