package ni.edu.uam.bibliotecaapi.controller;

import ni.edu.uam.bibliotecaapi.models.Libro;
import ni.edu.uam.bibliotecaapi.repository.LibroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar libros.
 * Permite realizar operaciones CRUD sobre la entidad Libro.
 */
@RestController
@RequestMapping("/libros")
public class LibroController {

    // Repositorio para acceder a los datos de libros
    private final LibroRepository libroRepository;

    /**
     * Constructor del controlador.
     * @param libroRepository repositorio de libros
     */
    public LibroController(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    /**
     * Obtiene la lista de todos los libros.
     * Endpoint: GET /libros
     *
     * @return lista de libros
     */
    @GetMapping
    public List<Libro> listar() {
        return libroRepository.findAll();
    }

    /**
     * Guarda un nuevo libro en la base de datos.
     * Endpoint: POST /libros
     *
     * @param libro objeto libro recibido en el body
     * @return libro guardado
     */
    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
        return libroRepository.save(libro);
    }

    /**
     * Actualiza un libro existente.
     * Endpoint: PUT /libros/{id}
     *
     * @param id identificador del libro
     * @param libro datos actualizados
     * @return libro actualizado
     */
    @PutMapping("/{id}")
    public Libro actualizar(@PathVariable Long id, @RequestBody Libro libro) {
        libro.setId(id);
        return libroRepository.save(libro);
    }

    /**
     * Elimina un libro por su ID.
     * Endpoint: DELETE /libros/{id}
     *
     * @param id identificador del libro
     */
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        libroRepository.deleteById(id);
    }
}