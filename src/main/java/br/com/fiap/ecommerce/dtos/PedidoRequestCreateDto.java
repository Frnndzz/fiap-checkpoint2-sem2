package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Pedido;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoRequestCreateDto {
	private Long idCliente;
    private LocalDate dataPedido;
    private String status;
    private String formaPagamento;
    private BigDecimal valorTotal;
    private static final ModelMapper modelMapper = new ModelMapper();
	
	public Pedido toModel() {
		return modelMapper.map(this, Pedido.class);
	}
    
}
