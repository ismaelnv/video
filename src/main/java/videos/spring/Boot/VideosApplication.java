package videos.spring.Boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/www/onePice")
@SpringBootApplication
public class VideosApplication {

    @Autowired
	ServiceCategorias categorias;

	@Autowired
	serviceVideos videos;


	public static void main(String[] args) {
		SpringApplication.run(VideosApplication.class, args);
	}

	@PostMapping("/categorias")
	public String crearCategoria(Categoria categoria){

		return categorias.crearCategorias(categoria);
		
	}

	@GetMapping("/categorias")
	public List<Categoria> getcategoria(){

		return categorias.getcategoria();
	}

	@GetMapping("/categoria{id}")
	public Categoria buscarPorId(@PathVariable Integer id){

		return categorias.buscarPorId(id);
	}

	@PutMapping("/categoria")
	public String setCategoria(@RequestBody Categoria categoria){

		return categorias.setCategoria(categoria);
	}

	//

    @PostMapping("/videos")
	public String crearVideos(Video video){

		return videos.crearVideos(video);
	}

	@GetMapping("/videos")
	public List<Video> getVideos(){

		return videos.getVideos();
	}

	@GetMapping("/videos/{id}")
	public Video obtenerPorId(@PathVariable Integer id){

		return videos.buscarPorId(id);
	}

	@PutMapping("/videos")
	public String setVideos(@RequestBody Video video){

		return videos.setVideos(video);
	}


	
 
}
