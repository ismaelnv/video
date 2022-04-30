package videos.spring.Boot;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/www/animes")
public class CategoriaController {

    @Autowired
    private CategoriasService categorias;

    @PostMapping("/categorias")
	public String crearCategoria(@RequestBody Categoria categoria){

		return categorias.crearCategorias(categoria);
		
	}

	@GetMapping("/categorias")
	public List<Categoria> getcategoria(){

		return categorias.getCateorias();
	}

	@GetMapping("/categoria{id}")
	public Categoria buscarPorId(@PathVariable Integer id){

		return categorias.buscarPorId(id);
	}

	@PutMapping("/categoria/{id}")
	public String setCategoria( @PathVariable("id") Integer id, @RequestBody Categoria categoria){

		return categorias.setCategorias(id, categoria);
	}

	@DeleteMapping("/categorias/{id}")
	public String eliminarCategorias(@PathVariable("id") Integer id){
	
		return categorias.eliminarCategoria(id);

	}
    
}
