package play.toys.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import play.toys.api.brinquedo.DadosDoBrinquedo;

@RestController
@RequestMapping("brinquedos")
public class BrinquedoController {

    @PostMapping
    public void cadastrarBrinquedo(@RequestBody DadosDoBrinquedo dados) {
        System.out.println(dados);
    }
}
