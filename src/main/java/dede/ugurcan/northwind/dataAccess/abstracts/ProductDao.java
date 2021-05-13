package dede.ugurcan.northwind.dataAccess.abstracts;

import dede.ugurcan.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
