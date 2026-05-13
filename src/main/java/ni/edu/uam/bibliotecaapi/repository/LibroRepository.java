package ni.edu.uam.bibliotecaapi.repository;

import ni.edu.uam.bibliotecaapi.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}