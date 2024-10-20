package br.com.fiap.ecommerce.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
    private Long idCliente;
    
    @Column(nullable = false)
    private LocalDate dataPedido;
    
    @Column(nullable = false, length = 20)
    private String status;
    
    @Column(nullable = false, length = 20)
    private String formaPagamento;
    
    @Column(precision = 16, scale = 2, nullable = false)
    private BigDecimal valorTotal;
}
