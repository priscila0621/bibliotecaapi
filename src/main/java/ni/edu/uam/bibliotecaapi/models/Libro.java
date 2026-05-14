package ni.edu.uam.bibliotecaapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

/**
 * Entidad que representa un libro en el sistema.
 * Cada libro pertenece a un autor.
 */
@Entity
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
     * Cantidad de páginas.
     */
    private int paginas;

    /**
     * Autor asociado al libro.
     */
    @ManyToOne
    @JoinColumn(name = "autor_id")
    @JsonIgnoreProperties("libros")
    private Autor autor;

    // Constructor vacío requerido por JPA/Jackson
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(Long id, String titulo, int paginas, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}