package ni.edu.uam.bibliotecaapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

/**
 * Entidad que representa un libro en el sistema.
 * Cada libro pertenece a un autor.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {

    /**
     * Identificador único del libro.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Título del libro.
     */
    private String titulo;

    /**
     * Cantidad de páginas del libro.
     */
    private int paginas;

    /**
     * Autor asociado al libro.
     * Relación ManyToOne con la entidad Autor.
     */
    @ManyToOne
    @JoinColumn(name = "autor_id")
    @JsonIgnoreProperties("libros")
    private Autor autor;
}