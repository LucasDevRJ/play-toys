package play.toys.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import play.toys.api.brinquedo.Cor;

@RestController
@RequestMapping("cores")
public class CorController {

    @PostMapping
    public void cadastrarCor(@RequestBody Cor cor) {
        System.out.println(cor.getNome());
    }
}
