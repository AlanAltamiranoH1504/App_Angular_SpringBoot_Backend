package altamirano.hernandez.app_springboot_react.repositories;

import altamirano.hernandez.app_springboot_react.entities.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Configuramos para uso rapido con cliente
@RepositoryRestResource(path = "productos")
public interface ProductoRepository extends CrudRepository<Producto, Integer> {
}
