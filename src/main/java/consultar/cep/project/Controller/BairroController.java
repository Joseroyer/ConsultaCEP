package consultar.cep.project.Controller;

import consultar.cep.project.Model.Bairro;
import consultar.cep.project.Repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BairroController {

    @Autowired
    BairroRepository baiRepository;
    List<Bairro> bai;

}
