package ss17_IO_binaryFile_serialization.exercise.ex1.controller;

import ss17_IO_binaryFile_serialization.exercise.ex1.model.model.ProductSs17;
import ss17_IO_binaryFile_serialization.exercise.ex1.model.service.IProductService;
import ss17_IO_binaryFile_serialization.exercise.ex1.model.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductServiceImpl();
    public void creatProduct(ProductSs17 prd) {
        this.productService.creatProduct(prd);
    }
    public List<ProductSs17> displayProduct() {
        return this.productService.displayProduct();
    }
    public List<ProductSs17> searchProduct(String name) {
        return this.productService.searchProduct(name);
    }
}

