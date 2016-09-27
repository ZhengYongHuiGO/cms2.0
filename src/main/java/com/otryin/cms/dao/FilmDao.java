package com.otryin.cms.dao;

import com.otryin.cms.entity.Film;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/9/22.
 */
public interface FilmDao {
    List<Film> getFilmPage(@Param("offset") int offset,@Param("limit") int limit);
    int getFilmNum();
    int saveFilm(Film film);
}
