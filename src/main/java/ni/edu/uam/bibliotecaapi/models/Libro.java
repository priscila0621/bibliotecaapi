package ni.edu.uam.bibliotecaapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private int paginas;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    @JsonIgnoreProperties("libros")
    private Autor autor;
}
