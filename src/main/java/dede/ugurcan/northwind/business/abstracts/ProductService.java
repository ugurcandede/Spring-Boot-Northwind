package dede.ugurcan.northwind.business.abstracts;

import dede.ugurcan.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
