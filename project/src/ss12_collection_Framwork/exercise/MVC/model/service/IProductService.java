package ss12_collection_Framwork.exercise.MVC.model.service;

import ss12_collection_Framwork.exercise.MVC.model.model.Product;

import java.util.List;

public interface IProductService {
    void creatProduct(Product product);
    void updateInformation(Product product);
    void deleteProduct(int id);
    List<Product> getProduct();
    List<Product> searchProductByName(String name);
    List<Product> sortProductByPrice(String direction);

}
