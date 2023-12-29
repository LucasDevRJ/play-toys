package play.toys.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import play.toys.api.brinquedo.Brinquedo;
import play.toys.api.brinquedo.BrinquedoRepository;
import play.toys.api.brinquedo.DadosDoBrinquedo;

@RestController
@RequestMapping("brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository repository;

    @PostMapping
    public void cadastrarBrinquedo(@RequestBody DadosDoBrinquedo dados) {
        repository.save(new Brinquedo(dados));
    }
}
