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

    public void atualizarInformacoes(DadosAtualizadosDoBrinquedo dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        } else if (dados.preco() != null) {
            this.preco = dados.preco();
        } else if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        } else if (dados.modelo() != null) {
            this.modelo = dados.modelo();
        } else if (dados.categoria() != null) {
            this.categoria = dados.categoria();
        } else if (dados.cor() != null) {
            this.cor = dados.cor();
        } else if (dados.faixaEtaria() != null) {
            this.faixaEtaria = dados.faixaEtaria();
        }
    }
}
