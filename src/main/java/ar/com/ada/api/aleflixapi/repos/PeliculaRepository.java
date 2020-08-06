package ar.com.ada.api.aleflixapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.com.ada.api.aleflixapi.entities.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula,Integer>{

}