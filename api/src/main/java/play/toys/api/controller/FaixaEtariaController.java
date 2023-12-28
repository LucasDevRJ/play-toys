package play.toys.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import play.toys.api.brinquedo.FaixaEtaria;

@RestController
@RequestMapping("faixasetárias")
public class FaixaEtariaController {

    @PostMapping
    public void cadastrarFaixaEtaria(@RequestBody FaixaEtaria faixaEtaria) {
        System.out.println(faixaEtaria.getNome());
    }
}
