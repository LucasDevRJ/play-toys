package play.toys.api.brinquedo;

import java.math.BigDecimal;

public record DadosDoBrinquedo(String nome, BigDecimal preco, String descricao, String modelo, Marca marca, Categoria categoria, Cor cor, FaixaEtaria faixaEtaria) {
}
