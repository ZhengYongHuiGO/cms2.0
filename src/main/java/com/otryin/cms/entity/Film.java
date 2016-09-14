package com.otryin.cms.entity;

import java.io.Serializable;
import java.util.Date;


public class Film implements Serializable {
    private int id;
    private String filmname;
    private String actors;
    private String director;
    private String type;
    private String contents;
    private String posterUrl;
    private String logoUrl;


    private String filmnameEnglish;
    private Date releaseDate;
    private String otherTranslationName;
    private String languageDialogue;
    private String filmColor;
    private String productionLocation;
    private String filmCast;
    private String originalSoundtrack;
    private String productionCompany;
    private String issueCompany;
    private String formOfProduction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getFilmnameEnglish() {
        return filmnameEnglish;
    }

    public void setFilmnameEnglish(String filmnameEnglish) {
        this.filmnameEnglish = filmnameEnglish;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getOtherTranslationName() {
        return otherTranslationName;
    }

    public void setOtherTranslationName(String otherTranslationName) {
        this.otherTranslationName = otherTranslationName;
    }

    public String getLanguageDialogue() {
        return languageDialogue;
    }

    public void setLanguageDialogue(String languageDialogue) {
        this.languageDialogue = languageDialogue;
    }

    public String getFilmColor() {
        return filmColor;
    }

    public void setFilmColor(String filmColor) {
        this.filmColor = filmColor;
    }

    public String getProductionLocation() {
        return productionLocation;
    }

    public void setProductionLocation(String productionLocation) {
        this.productionLocation = productionLocation;
    }

    public String getFilmCast() {
        return filmCast;
    }

    public void setFilmCast(String filmCast) {
        this.filmCast = filmCast;
    }

    public String getOriginalSoundtrack() {
        return originalSoundtrack;
    }

    public void setOriginalSoundtrack(String originalSoundtrack) {
        this.originalSoundtrack = originalSoundtrack;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public String getIssueCompany() {
        return issueCompany;
    }

    public void setIssueCompany(String issueCompany) {
        this.issueCompany = issueCompany;
    }

    public String getFormOfProduction() {
        return formOfProduction;
    }

    public void setFormOfProduction(String formOfProduction) {
        this.formOfProduction = formOfProduction;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", filmname='" + filmname + '\'' +
                '}';
    }
}
