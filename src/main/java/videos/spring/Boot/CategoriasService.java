package videos.spring.Boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CategoriasService {

    private List<Categoria> categorias = new ArrayList<>();

    public String crearCategorias(Categoria categoria){

        categorias.add(categoria);
        return "Added correctly";

    }

    public List<Categoria> getCateorias(){

        return categorias;
    }
    
    public Categoria buscarPorId(Integer id){
        
       for (Categoria categoria : categorias) {

        if(categoria.getId() == id){
            
            return categoria;
        }
           
       }
       return null;
    }

    public String setCategorias( Integer id,Categoria categoria){

        for (int i = 0; i < categorias.size(); i++) {

            if(id == categorias.get(i).getId()){

                categorias.set(i, categoria);

            }
            
        }
        return "Was updated correctly";

    }

    public String eliminarCategoria(Integer id){

        for (int i = 0; i < categorias.size() ; i++) {
            
            if(categorias.get(i).getId() == id){

                categorias.remove(i);

            }
            
        }
        return "Is deleted correctly";


    }
}
