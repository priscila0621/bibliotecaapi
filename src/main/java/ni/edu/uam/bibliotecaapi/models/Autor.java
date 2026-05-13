package ni.edu.uam.bibliotecaapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * Entidad que representa un autor en el sistema.
 * Un autor puede tener múltiples libros.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Autor {

    /**
     * Identificador único del autor.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre completo del autor.
     */
    private String nombre;

    /**
     * Nacionalidad del autor.
     */
    private String nacionalidad;

    /**
     * Lista de libros asociados al autor.
     * Relación OneToMany con la entidad Libro.
     */
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Libro> libros;
}
