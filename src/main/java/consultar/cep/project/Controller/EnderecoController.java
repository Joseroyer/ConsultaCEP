package consultar.cep.project.Controller;


import consultar.cep.project.Model.Endereco;
import consultar.cep.project.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EnderecoController {

    @Autowired
    EnderecoRepository eRepository;
    List<Endereco> end;

    @RequestMapping("/teste")
    public String home(){
        return "Hello World!";
    }
    @GetMapping("/listar")
    public ResponseEntity<Object> listar_all(){
        end = eRepository.findAll();
        return new ResponseEntity<>(end, HttpStatus.OK);
    }
    @GetMapping("/listar-todos")
    public List<Endereco> getEndereco(){return this.eRepository.findAll();}
}
