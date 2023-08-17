package ss12_collection_Framwork.exercise.MVC.model.repository;

import ss12_collection_Framwork.exercise.MVC.model.model.Product;
import ss12_collection_Framwork.exercise.MVC.model.repository.impl.ProductRepositoryImpl;

import java.util.List;

public interface IProductRepository  {

    void creatProduct(Product product);
    void updateInformation(Product product);
    void deleteProduct(int id);
    List<Product> getProduct();
    List<Product> searchProductByName(String name);
    List<Product> sortProductByPrice(String direction);

}
