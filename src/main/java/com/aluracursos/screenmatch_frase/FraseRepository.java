package com.aluracursos.screenmatch_frase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {
   @Query(value = "SELECT * FROM frases ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
   Frase obtenerFraseAleatoria();
}
