package ConsultaCep.consultar.Repository;

import ConsultaCep.consultar.Modal.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BairroRepository extends JpaRepository<Bairro, Long> {
}