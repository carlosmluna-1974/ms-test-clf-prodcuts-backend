package mx.com.nach.prueba.clf.persistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.nach.prueba.clf.persistencia.entity.ProdcutEntity;


/**
 * Interface Repository que implementa los metodos JPA de la entidad Prodcutos
 * @author Carlos Luna Fernandez
 * @version 1.0.0 
 */
@Repository
public interface ProductRepository extends JpaRepository<ProdcutEntity, Long> {

}
