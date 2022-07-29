package ConsultaCep.consultar.Controller;

import ConsultaCep.consultar.Modal.Cidade;
import ConsultaCep.consultar.Modal.Endereco;
import ConsultaCep.consultar.Repository.CidadeRepository;
import ConsultaCep.consultar.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/apis")
public class EnderecoController {
    @Autowired
    EnderecoRepository enderecoRepository;
    List<Endereco> end;

    @GetMapping("/listar-ceps")
    public ResponseEntity<Object> listarAll() {
        end = enderecoRepository.findAll();
        return new ResponseEntity<>(end, HttpStatus.OK);
    }

    @GetMapping("/ConsultarCEP")
    public ResponseEntity<Object> consultarCep(@RequestParam(required = false, name = "filtro") String filter) {
        if (enderecoRepository.findAllWithFilter(filter) != null) {
            end = enderecoRepository.findAllWithFilter(filter);
            return new ResponseEntity<>(end, HttpStatus.OK);
        } else return new ResponseEntity<>("CEP NÃO ENCONTRADO", HttpStatus.NOT_FOUND);
    }

}
