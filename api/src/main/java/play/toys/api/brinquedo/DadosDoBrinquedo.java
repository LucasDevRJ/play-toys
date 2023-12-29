package play.toys.api.brinquedo;

import java.math.BigDecimal;

public record DadosDoBrinquedo(String nome, BigDecimal preco, String descricao, String modelo, String marca, String categoria, String cor, String faixaEtaria) {
}
