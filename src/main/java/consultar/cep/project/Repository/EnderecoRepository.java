package consultar.cep.project.Repository;

import consultar.cep.project.Model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {
    @Query(value = "select * from endereco e inner join cidade c on e.cid_id=c.cid_id inner join bairro b on e.bai_id=b.bai_id where end_cep like %:filtro% ", nativeQuery = true)
    List<endereco> findAllWithFilter(@Param("filtro") String filtro);
}