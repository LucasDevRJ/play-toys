package play.toys.api.brinquedo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "brinquedos")
@Entity(name = "Brinquedo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Brinquedo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private BigDecimal preco;
    private String descricao;
    private String modelo;
    @OneToOne
    private Marca marca;
    @OneToOne
    private Categoria categoria;
    @OneToMany
    private Cor cor;
    @OneToOne
    private FaixaEtaria faixaEtaria;
}
