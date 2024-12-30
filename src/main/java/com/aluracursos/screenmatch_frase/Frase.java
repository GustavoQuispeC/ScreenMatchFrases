package com.aluracursos.screenmatch_frase;

import jakarta.persistence.*;


//creando la tabla frases en la base de datos
@Entity
@Table(name = "frases")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String frase;
    private String personaje;
    private String titulo;
    private String poster;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
}

