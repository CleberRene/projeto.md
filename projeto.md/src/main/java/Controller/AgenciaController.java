package Controller;

import Modelo.AgenciaModelo;
import Repository.AgenciaRepository;
import Service.AgenciaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgenciaController {

    @GetMapping("/agencia")
    public String agencia(){
        return "teste para agência";

        }

//    Criar nova agência;
//    @PostMapping("/nova")
//    public String novaAgencia(@RequestBody AgenciaModelo agencia){
//
//    }



    @GetMapping("/listar")
    public List<AgenciaService> listarAgencia(){
        return listarAgencia();
    }
}
