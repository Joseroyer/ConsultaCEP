package ConsultaCep.consultar.Repository;

import ConsultaCep.consultar.Modal.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {

    @Query(value = "select * from endereco e inner join cidade c on e.cid_id=c.cid_id inner join bairro b on e.bai_id=b.bai_id where end_cep like %:filtro% ", nativeQuery = true)
    List<Endereco> findAllWithFilter(@Param("filtro") String filtro);

//    @Query(value = "select  * from endereco where end_cep = '%:filtro:%' ", nativeQuery = true)
//    List<Endereco> findAllWithFilter(@Param("filtro") String filtro);


}