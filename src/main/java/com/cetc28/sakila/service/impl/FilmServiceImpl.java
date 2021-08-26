package com.cetc28.sakila.service.impl;

import com.cetc28.sakila.entity.Film;
import com.cetc28.sakila.mapper.FilmMapper;
import com.cetc28.sakila.service.IFilmService;
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
public class FilmServiceImpl extends ServiceImpl<FilmMapper, Film> implements IFilmService {

}
