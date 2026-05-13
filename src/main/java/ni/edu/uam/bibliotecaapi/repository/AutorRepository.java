package ni.edu.uam.bibliotecaapi.repository;

import ni.edu.uam.bibliotecaapi.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}