package ni.edu.uam.bibliotecaapi.repository;

import ni.edu.uam.bibliotecaapi.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio JPA para la entidad Libro.
 * Permite realizar operaciones CRUD sobre libros.
 */
public interface LibroRepository extends JpaRepository<Libro, Long> {
}