package ss12_collection_Framwork.exercise.MVC.model.service.impl;

import ss12_collection_Framwork.exercise.MVC.model.model.Product;
import ss12_collection_Framwork.exercise.MVC.model.repository.IProductRepository;
import ss12_collection_Framwork.exercise.MVC.model.repository.impl.ProductRepositoryImpl;
import ss12_collection_Framwork.exercise.MVC.model.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final ProductRepositoryImpl productRepository = new ProductRepositoryImpl();


    @Override
    public void creatProduct(Product product) {
        if(product.getId() > 0) {
            return;
        }
        this.productRepository.creatProduct(product);
    }

    @Override
    public void updateInformation(Product product) {
        if(product.getId() <= 0) {
            return;
        }
        this.productRepository.updateInformation(product);
    }

    @Override
    public void deleteProduct(int id) {
        if(id <= 0) {
            return;
        }
        this.productRepository.deleteProduct(id);
    }

    @Override
    public List<Product> getProduct() {
        return this.productRepository.getProduct();
    }

    @Override
    public List<Product> searchProductByName(String name) {
        return this.productRepository.searchProductByName(name);
    }

    @Override
    public List<Product> sortProductByPrice(String direction) {
        return this.productRepository.sortProductByPrice(direction);
    }
}
