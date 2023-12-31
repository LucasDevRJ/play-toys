package play.toys.api.brinquedo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public record DadosDoBrinquedo(
        Long id,

        @NotBlank
        String nome,
        @Positive
        BigDecimal preco,
        @NotBlank
        String descricao,
        @NotBlank
        String modelo,
        @NotBlank
        String marca,
        @NotBlank
        String categoria,
        @NotBlank
        String cor,
        @NotBlank
        String faixaEtaria) {

        public DadosDoBrinquedo(Brinquedo brinquedo) {
                this(brinquedo.getId(), brinquedo.getNome(), brinquedo.getPreco(), brinquedo.getDescricao(), brinquedo.getModelo(),
                        brinquedo.getCategoria(), brinquedo.getCategoria(), brinquedo.getCor(),
                        brinquedo.getFaixaEtaria());
        }
}
