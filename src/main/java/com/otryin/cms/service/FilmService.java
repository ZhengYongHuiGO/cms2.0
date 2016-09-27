package com.otryin.cms.service;

import com.otryin.cms.common.Page;
import com.otryin.cms.entity.Film;

/**
 * Created by Administrator on 2016/9/22.
 */
public interface FilmService {
    public Page<Film> getPageFilm(int page,int pageSize);
    public int saveFilm(Film film);
}
