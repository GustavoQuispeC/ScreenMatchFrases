package com.aluracursos.screenmatch_frase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;
    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),frase.getPersonaje(), frase.getFrase(), frase.getPoster());
    }
}
