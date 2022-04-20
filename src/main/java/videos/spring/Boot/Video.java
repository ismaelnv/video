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

    public Video(Integer id,String name,String idiom,String quality){

        this.id = id;
        this.name = name;
        this.idiom = idiom;
        this.quality = quality;


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
    
}
