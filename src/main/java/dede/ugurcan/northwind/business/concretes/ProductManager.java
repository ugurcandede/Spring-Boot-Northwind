package dede.ugurcan.northwind.business.concretes;

import dede.ugurcan.northwind.business.abstracts.ProductService;
import dede.ugurcan.northwind.dataAccess.abstracts.ProductDao;
import dede.ugurcan.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
