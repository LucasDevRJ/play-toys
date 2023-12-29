package play.toys.api.brinquedo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

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
    private List<Cor> cor;
    @OneToOne
    private FaixaEtaria faixaEtaria;

    public Brinquedo(DadosDoBrinquedo dados) {
        this.nome = dados.nome();
        this.preco = dados.preco();
        this.descricao = dados.descricao();
        this.modelo = dados.modelo();
        this.marca = dados.marca();
        this.categoria = dados.categoria();
        this.cor = (List<Cor>) dados.cor();
        this.faixaEtaria = dados.faixaEtaria();
    }
}
