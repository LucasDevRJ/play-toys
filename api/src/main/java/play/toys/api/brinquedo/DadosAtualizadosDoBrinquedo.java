package play.toys.api.brinquedo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record DadosAtualizadosDoBrinquedo(
        @NotNull
        Long id,

        String nome,
        @Positive
        BigDecimal preco,
        String descricao,
        String modelo,
        String marca,
        String categoria,
        String cor,
        String faixaEtaria,
        Boolean ativo) {

        public DadosAtualizadosDoBrinquedo(Brinquedo brinquedo) {
                this(brinquedo.getId(), brinquedo.getNome(), brinquedo.getPreco(), brinquedo.getDescricao(), brinquedo.getModelo(),
                        brinquedo.getCategoria(), brinquedo.getCategoria(), brinquedo.getCor(),
                        brinquedo.getFaixaEtaria(), brinquedo.getAtivo());
        }
}
