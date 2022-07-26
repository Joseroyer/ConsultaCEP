package ConsultaCep.consultar.Repository;

import ConsultaCep.consultar.Modal.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}