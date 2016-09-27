package com.otryin.cms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/7/21.
 */

public class FilmBanner implements Serializable {
    private int id;
    private int filmId;
    private String imageUrl;
    private Date publishDate;

    private Film film;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
