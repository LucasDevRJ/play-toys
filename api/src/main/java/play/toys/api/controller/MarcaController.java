package play.toys.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import play.toys.api.brinquedo.Marca;

@RestController
@RequestMapping("marcas")
public class MarcaController {

    @PostMapping
    public void cadastrarMarca(@RequestBody Marca marca) {
        System.out.println(marca.getNome());
    }
}
