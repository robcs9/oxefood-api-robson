package br.com.ifpe.oxefood.api.empresa;

import br.com.ifpe.oxefood.modelo.acesso.Usuario;
import br.com.ifpe.oxefood.modelo.empresa.Empresa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaRequest {

    //private String chave;

    private String site;

    private String cnpj;

    private String inscricaoEstadual;

    private String nomeEmpresarial;

    private String nomeFantasia;

    private String fone;

    private String foneAlternativo;

    public Empresa buildEmpresa() {

	Empresa empresa = Empresa.builder()
		//.chave(chave)
		//.usuario(buildUsuario())
		.site(site)
		.cnpj(cnpj)
		.inscricaoEstadual(inscricaoEstadual)
		.nomeEmpresarial(nomeEmpresarial)
		.nomeFantasia(nomeFantasia)
		.fone(fone)
		.foneAlternativo(foneAlternativo)
		.build();

	return empresa;
    }
    
    /* public Usuario buildUsuario() {
	
	return Usuario.builder()
		.username(email)
		.password(password)
		.build();
    } */

}
