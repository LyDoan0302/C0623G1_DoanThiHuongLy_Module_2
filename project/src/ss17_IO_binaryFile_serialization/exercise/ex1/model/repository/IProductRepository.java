package ss17_IO_binaryFile_serialization.exercise.ex1.model.repository;

import ss17_IO_binaryFile_serialization.exercise.ex1.model.model.ProductSs17;

import java.util.List;

public interface IProductRepository {
    void creatProduct(ProductSs17 prd);
    List<ProductSs17> displayProduct();
    List<ProductSs17> searchProduct(String name);
}
