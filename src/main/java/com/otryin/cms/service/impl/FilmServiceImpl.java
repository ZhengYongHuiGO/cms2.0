package com.otryin.cms.service.impl;

import com.otryin.cms.common.Page;
import com.otryin.cms.dao.FilmDao;
import com.otryin.cms.entity.Film;
import com.otryin.cms.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/22.
 */
@Service("filmService")
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmDao filmDao;
    @Override
    public Page<Film> getPageFilm(int page, int pageSize) {
        int offset=(page-1)*pageSize;
        List<Film> films=filmDao.getFilmPage(offset,pageSize);
        int totalNum=filmDao.getFilmNum();
        return new Page<>(offset,pageSize,totalNum,films);
    }

    @Override
    public int saveFilm(Film film) {
        return 0;
    }
}
