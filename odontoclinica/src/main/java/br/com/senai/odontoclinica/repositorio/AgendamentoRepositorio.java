package br.com.senai.odontoclinica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.senai.odontoclinica.orm.Agendamento;

@RepositoryRestResource(collectionResourceRel = "agendamento", path = "agendamento")
public interface AgendamentoRepositorio extends JpaRepository<Agendamento, Integer> {

}
