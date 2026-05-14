package ni.edu.uam.bibliotecaapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

/**
 * Entidad que representa un autor en el sistema.
 * Un autor puede tener múltiples libros.
 */
@Entity
public class Autor {

    /**
     * Identificador único del autor.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre del autor.
     */
    private String nombre;

    /**
     * Nacionalidad del autor.
     */
    private String nacionalidad;

    /**
     * Lista de libros asociados al autor.
     */
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("autor")
    private List<Libro> libros;

    // Constructor vacío requerido por JPA/Jackson
    public Autor() {
    }

    // Constructor con parámetros
    public Autor(Long id, String nombre, String nacionalidad, List<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.libros = libros;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}