package videos.spring.Boot;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Video {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("idiom")
    private String idiom;

    @JsonProperty("quality")
    private String quality;

    @JsonProperty("views")
    private Integer views ;

    @JsonProperty("seen")
    private String seen;

    public Video(Integer id,String name,String idiom,String quality,Integer views,String seen){

        this.id = id;
        this.name = name;
        this.idiom = idiom;
        this.quality = quality;
        this.views = views;
        this.seen = seen;
        
    }

    public Integer getId(){

        return id;
    }

    public String getName(){

        return name;
    }

    public String getIdiom(){

        return idiom;
    }

    public String getQuality(){

        return quality;
    }

    public Integer getViews(){

        return views;
    }

    public String getSeen(){

        return seen;
    }

    public void setId(Integer id){

        this.id = id;
    }

    public void SetName(String name){

        this.name = name;
    }

    public void setIdiom(String idiom){

        this.idiom = idiom;
    }

    public void setQuality(String quality){

        this.quality = quality;
    }

    public void setViews(  Integer views){

        this.views = views;

    }
     
    public void  setSeen(String seen){

        this.seen =  seen;
    }

   

    

}
