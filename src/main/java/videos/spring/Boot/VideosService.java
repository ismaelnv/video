package videos.spring.Boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VideosService {

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

    public String setVideos(Integer id , Video video){

        for (int i = 0; i < videos.size() ; i++) {

            if( id == videos.get(i).getId()){

                videos.set(i,video);
            }
              
        } 
             
        return "Was updated correctly";
    } 
    
    public String eliminarVideos( Integer id){
        
        for (int i = 0; i < videos.size() ; i++) {
        
            if(id == videos.get(i).getId()){

                videos.remove(i);

            }
            
        }
        return "Is deleted correctly";

    }

    public String updateViews(Integer id){

        for (Video video : videos) {
            
            if(video.getId() == id){

                video.setViews(video.getViews()+1);
                videos.set(video.getId(), video);
            }
        }
        return "Was updated correctly";
    }

   /* public List<Video> popularVideos(){
        for (Video video : videos) {
            
        }

        
    }*/

    public String seenVideos(Integer id ){

        for (Video video : videos) {

            if(video.getId() == id){

                video.setSeen(video.getSeen()+"visto");
                videos.set(video.getId(),video);
            }
            
        }
        return "Was updated correctly";

    }     



    








    


}