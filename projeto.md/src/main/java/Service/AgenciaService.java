package Service;

import Modelo.AgenciaModelo;
import Repository.AgenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgenciaService {

    @Autowired
    AgenciaRepository agenciaRepository;


    public List<AgenciaModelo> listarAgencia(){
        return agenciaRepository.findAll();
    }
}
