package proffy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proffy.model.Conexao;

@Repository
public interface ConexaoRepository extends JpaRepository<Conexao, Long> {

}
