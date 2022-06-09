package consultar.cep.project.Repository;

import consultar.cep.project.Model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}