package ar.com.ada.api.aleflixapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ar.com.ada.api.aleflixapi.entities.Serie;
import ar.com.ada.api.aleflixapi.repos.SerieRepository;

@Service
public class SerieService {

    @Autowired
    SerieRepository serviceRepository;

    public void grabar(Serie serie) {
        serviceRepository.save(serie);
    }

    public List<Serie> listarSeries() {
        return ((JpaRepository<Serie, Integer>) serviceRepository).findAll();
    }

}