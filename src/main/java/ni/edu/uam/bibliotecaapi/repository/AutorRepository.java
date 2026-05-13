package ni.edu.uam.bibliotecaapi.repository;

import ni.edu.uam.bibliotecaapi.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio JPA para la entidad Autor.
 * Permite realizar operaciones CRUD sobre autores.
 */
public interface AutorRepository extends JpaRepository<Autor, Long> {
}