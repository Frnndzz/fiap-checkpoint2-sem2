package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoResponseDto {
    private Long id;
	private String nome;
	private BigDecimal valor;
}
