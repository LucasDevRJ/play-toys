package play.toys.api.brinquedo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public record DadosDoBrinquedo(
        @NotBlank
        String nome,
        @Positive
        @NotNull
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
}
