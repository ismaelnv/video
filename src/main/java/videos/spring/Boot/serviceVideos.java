package videos.spring.Boot;

import java.util.ArrayList;
import java.util.List;

public class serviceVideos {

    private List<Video> videos = new ArrayList<>();

    public String crearVideos(Video video){

        videos.add(video);
        return "Added correctly";
    }

    public List<Video> getVideos(){

      return videos;
    }

    public Video buscarPorId(Integer id){

        for (Video video : videos) {

            if(video.getId() == id){

                return video;
            }  
        }
        return null;
    }

    public String setVideos(Video video){

        videos.set(video.getId(),video);
        return "Was updated correctly";
    }

    
}
