package play.toys.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import play.toys.api.brinquedo.Brinquedo;
import play.toys.api.brinquedo.BrinquedoRepository;
import play.toys.api.brinquedo.DadosDoBrinquedo;


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
    public Page<DadosDoBrinquedo> listarBrinquedos(Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosDoBrinquedo::new);
    }
}
