package videos.spring.Boot;

import java.util.ArrayList;
import java.util.List;

public class ServiceCategorias {

    private List<Categoria> categorias = new ArrayList<>();
    
    public String crearCategorias(Categoria categoria){

        categorias.add(categoria);
        return "Added correctly";

    }

    public List<Categoria> getcategoria(){

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

    public String setCategoria(Categoria categoria){

        categorias.set(categoria.getId(), categoria);
        return "Was updated correctly";
    }
}
