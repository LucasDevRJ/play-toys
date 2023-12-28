package play.toys.api.brinquedo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

    @PostMapping
    public void cadastrarCategoria(@RequestBody DadosDaCategoria dados) {
        System.out.println(dados);
    }
}
