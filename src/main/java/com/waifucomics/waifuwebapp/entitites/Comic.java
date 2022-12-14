package com.waifucomics.waifuwebapp.entitites;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String comicName;
    @NotNull
    private int nbPage;
    private String artistName;

    public Comic() {}

    public Comic(String comicName, int nbPage, String artistName) {
        this.comicName = comicName;
        this.nbPage = nbPage;
        this.artistName = artistName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "id=" + id +
                ", comicName='" + comicName + '\'' +
                ", nbPage=" + nbPage +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}
