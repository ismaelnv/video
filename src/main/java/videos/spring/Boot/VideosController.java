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
@RequestMapping("/www/onepice")
public class VideosController {

    @Autowired
	VideosService videos;


    @PostMapping("/videos")
	public String crearVideos(@RequestBody  Video video){

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

	@PutMapping("/videos/{id}")
	public String setVideos(@PathVariable("id") Integer id,@RequestBody Video video ){

		return videos.setVideos(id,video);
	}

	@DeleteMapping("/videos/{id}")
	public String eliminarVideos(@PathVariable("id") Integer id){

		return videos.eliminarVideos(id);
	}

	@PutMapping("/vistas/{id}")
	public String updateViews(@PathVariable("id") Integer id){

		return videos.updateViews(id);

	}
	@PutMapping("/visto/{id}")
	public String seenVideos(@PathVariable("id") Integer id){

		return videos.seenVideos(id);


	}


    
}
