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
    private String marca;
    private String categoria;
    private String cor;
    private String faixaEtaria;

    public Brinquedo(DadosDoBrinquedo dados) {
        this.nome = dados.nome();
        this.preco = dados.preco();
        this.descricao = dados.descricao();
        this.modelo = dados.modelo();
        this.marca = dados.marca();
        this.categoria = dados.categoria();
        this.cor = dados.cor();
        this.faixaEtaria = dados.faixaEtaria();
    }
}
