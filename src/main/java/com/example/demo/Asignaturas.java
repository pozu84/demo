package com.example.demo;

import jakarta.persistence.*;

@Entity //para distinguir que es una tabla de nuestra BBDD
public class Asignaturas {

    /*ATRIBUTOS*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer creditos;
    private Integer price;

    /*CONSTRUCTORES, vacio y con los atributos*/
    public Asignaturas() {
    }

    public Asignaturas(Long id, String name, Integer creditos, Integer price) {
        this.id = id;
        this.name = name;
        this.creditos = creditos;
        this.price = price;
    }

    /*GETTER Y SETTERS, para poder acceder a los atributos privados*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer value) {
        this.creditos = value;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    /*ToString*/

    @Override
    public String toString() {
        return "Asignaturas{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + creditos +
                ", price=" + price +
                '}';
    }
}
