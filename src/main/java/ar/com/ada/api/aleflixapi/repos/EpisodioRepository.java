package ar.com.ada.api.aleflixapi.repos;
import ar.com.ada.api.aleflixapi.entities.Episodio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodioRepository extends JpaRepository<Episodio,Integer>{

}