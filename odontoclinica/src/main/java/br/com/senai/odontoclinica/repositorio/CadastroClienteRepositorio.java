package br.com.senai.odontoclinica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.senai.odontoclinica.orm.CadastroCliente;

@RepositoryRestResource(collectionResourceRel = "cadastrocliente" , path = "cadastrocliente")
public interface CadastroClienteRepositorio extends JpaRepository<CadastroCliente, Integer>{
}
