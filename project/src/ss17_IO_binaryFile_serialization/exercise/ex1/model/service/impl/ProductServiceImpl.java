package ss17_IO_binaryFile_serialization.exercise.ex1.model.service.impl;

import ss17_IO_binaryFile_serialization.exercise.ex1.model.model.ProductSs17;
import ss17_IO_binaryFile_serialization.exercise.ex1.model.repository.IProductRepository;
import ss17_IO_binaryFile_serialization.exercise.ex1.model.repository.impl.ProductRepositoryImpl;
import ss17_IO_binaryFile_serialization.exercise.ex1.model.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final IProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public void creatProduct(ProductSs17 prd) {
        if(prd.getId() > 0) {
            return;
        }
        this.productRepository.creatProduct(prd);
    }

    @Override
    public List<ProductSs17> displayProduct() {
        return this.productRepository.displayProduct();
    }


    @Override
    public List<ProductSs17> searchProduct(String name) {
        return this.productRepository.searchProduct(name);
    }
}
