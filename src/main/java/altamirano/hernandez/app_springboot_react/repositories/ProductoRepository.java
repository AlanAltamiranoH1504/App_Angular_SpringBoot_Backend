package altamirano.hernandez.app_springboot_react.repositories;

import altamirano.hernandez.app_springboot_react.entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {
}
