package videos.spring.Boot;

import java.util.Comparator;

public class ComparadorVideos implements Comparator<Video>  {

    @Override
    public int compare(Video arg0, Video arg1) {
        
        if(arg0.getViews() > arg1.getViews()){

            return -1;

        }else if(arg0.getViews() == arg1.getViews()){

            return 0;

        }else{

            return 1;
        }
    }
    
}
