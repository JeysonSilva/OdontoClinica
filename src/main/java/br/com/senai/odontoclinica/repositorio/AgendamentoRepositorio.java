package br.com.senai.odontoclinica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.odontoclinica.orm.Agendamento;

@Repository
public interface AgendamentoRepositorio extends JpaRepository<Agendamento, Long> {

}
