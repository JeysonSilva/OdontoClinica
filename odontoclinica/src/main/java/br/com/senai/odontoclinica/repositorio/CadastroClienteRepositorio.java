package br.com.senai.odontoclinica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import br.com.senai.odontoclinica.orm.CadastroCliente;

@Repository
public interface CadastroClienteRepositorio extends JpaRepository<CadastroCliente, Long>{
}
