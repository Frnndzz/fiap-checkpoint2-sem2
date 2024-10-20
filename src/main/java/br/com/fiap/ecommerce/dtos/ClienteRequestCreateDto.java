package br.com.fiap.ecommerce.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Cliente;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequestCreateDto {

    private String nome;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String uf;
    private static final ModelMapper modelMapper = new ModelMapper();

	public Cliente toModel() {
		return modelMapper.map(this, Cliente.class);
	}

}
