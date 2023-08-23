package ss17_IO_binaryFile_serialization.exercise.ex1.model.service;

import ss17_IO_binaryFile_serialization.exercise.ex1.model.model.ProductSs17;

import java.util.List;

public interface IProductService {
    void creatProduct(ProductSs17 prd);
    List<ProductSs17> displayProduct();
    List<ProductSs17> searchProduct(String name);
}
