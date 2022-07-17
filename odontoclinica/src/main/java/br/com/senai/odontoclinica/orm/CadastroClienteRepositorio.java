package br.com.senai.odontoclinica.orm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cadastrocliente" , path = "cadastrocliente")
public interface CadastroClienteRepositorio extends JpaRepository<CadastroCliente, Integer>{
}
