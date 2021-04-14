package com.wolox_proyect.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name= "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private Integer idUser;

    @Column(name= "name")
    private String nombre;

    @Column(name= "username")
    private String userName;

    @Column(name = "email")
    private String email;


    /** Getters and Setters**/

    public Integer getIdProdcut() {
        return idUser;
    }

    public void setIdProdcut(Integer idProdcut) {
        this.idUser = idProdcut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
