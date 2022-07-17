package br.com.senai.odontoclinica.orm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "agendamento", path = "agendamento")
public interface AgendamentoRepositorio extends JpaRepository<Agendamento, Integer> {

}
