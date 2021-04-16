package com.wolox_proyect.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name= "albums")
public class AlbumEntity {

    @Id
    @Column(name = "id")
    private Integer idAlbum;

    @Column(name = "user_id")
    private Integer idUser;

    @Column(name = "tittle")
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private Usuario usuario;

    /** Getters and Setters**/

    public Integer getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
