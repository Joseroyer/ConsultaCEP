package consultar.cep.project.Controller;

import consultar.cep.project.Model.Cidade;
import consultar.cep.project.Repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CidadeController {
    @Autowired
    CidadeRepository cidRepository;
    List<Cidade> cid;
}
