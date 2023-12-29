package play.toys.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import play.toys.api.brinquedo.Categoria;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

    @PostMapping
    public void cadastrarCategoria(@RequestBody Categoria categoria) {
        System.out.println(categoria.getNome());
    }
}
