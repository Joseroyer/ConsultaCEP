package consultar.cep.project.Repository;

import consultar.cep.project.Model.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BairroRepository extends JpaRepository<Bairro, Long> {
}