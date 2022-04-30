package videos.spring.Boot;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Categoria {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    public Categoria(Integer id,String name){

        this.id = id;
        this.name = name;
        
    }
    
    public Integer getId(){

        return id;
    }

    public String getName(){

        return name;
    }

    public void setId(Integer id){

        this.id =  id;
    }

    public void setName(String name){

        this.name = name;

    }
}
   
