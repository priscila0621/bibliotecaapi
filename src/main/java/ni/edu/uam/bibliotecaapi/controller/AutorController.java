package ni.edu.uam.bibliotecaapi.controller;

import ni.edu.uam.bibliotecaapi.models.Autor;
import ni.edu.uam.bibliotecaapi.repository.AutorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar autores.
 * Permite realizar operaciones CRUD sobre la entidad Autor.
 */
@RestController
@RequestMapping("/autores")
public class AutorController {

    // Repositorio para acceder a los datos de autores
    private final AutorRepository autorRepository;

    /**
     * Constructor del controlador.
     * @param autorRepository repositorio de autores
     */
    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    /**
     * Obtiene la lista de todos los autores.
     * Endpoint: GET /autores
     *
     * @return lista de autores
     */
    @GetMapping
    public List<Autor> listar() {
        return autorRepository.findAll();
    }

    /**
     * Guarda un nuevo autor en la base de datos.
     * Endpoint: POST /autores
     *
     * @param autor objeto autor recibido en el body
     * @return autor guardado
     */
    @PostMapping
    public Autor guardar(@RequestBody Autor autor) {
        return autorRepository.save(autor);
    }

    /**
     * Actualiza un autor existente.
     * Endpoint: PUT /autores/{id}
     *
     * @param id identificador del autor
     * @param autor datos actualizados
     * @return autor actualizado
     */
    @PutMapping("/{id}")
    public Autor actualizar(@PathVariable Long id, @RequestBody Autor autor) {
        autor.setId(id);
        return autorRepository.save(autor);
    }

    /**
     * Elimina un autor por su ID.
     * Endpoint: DELETE /autores/{id}
     *
     * @param id identificador del autor
     */
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        autorRepository.deleteById(id);
    }
}