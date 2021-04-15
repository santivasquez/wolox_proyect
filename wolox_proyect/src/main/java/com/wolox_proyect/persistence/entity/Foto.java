package com.wolox_proyect.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name= "album_photos")
public class Foto {

    @Id
    @Column(name = "id")
    private Integer idFoto;

    @Column(name = "album_id")
    private Integer albumId;

    @Column(name = "tittle")
    private String titulo;

    private String url;

    @Column(name = "thumbnail_url")
    private String thumbnail;


    /** Getters and Setters**/


    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
