package play.toys.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import play.toys.api.brinquedo.Brinquedo;
import play.toys.api.brinquedo.BrinquedoRepository;
import play.toys.api.brinquedo.DadosDoBrinquedo;

import java.util.List;

@RestController
@RequestMapping("brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarBrinquedo(@RequestBody @Valid DadosDoBrinquedo dados) {
        repository.save(new Brinquedo(dados));
    }

    @GetMapping
    public List<DadosDoBrinquedo> listarBrinquedos() {
        return repository.findAll().stream().map(DadosDoBrinquedo::new).toList();
    }
}
