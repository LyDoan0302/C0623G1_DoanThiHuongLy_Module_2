package ss17_IO_binaryFile_serialization.exercise.ex1.model.repository.impl;

import ss17_IO_binaryFile_serialization.exercise.ex1.model.model.ProductSs17;
import ss17_IO_binaryFile_serialization.exercise.ex1.model.repository.IProductRepository;
import ss17_IO_binaryFile_serialization.exercise.ex1.ultilities.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
    public static final String PRODUCT_PATH_NAME = "/Users/mac/Documents/GitHub_ver2/C0623G1_DoanThiHuongLy_Module_2/project/src/ss17_IO_binaryFile_serialization/exercise/ex1/productSs17.csv";
    private final ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    public static final String COMMA = ",";
//    private final List<ProductSs17> productSs17s = new ArrayList<>();
//    {
//        ProductSs17 prd1 = new ProductSs17(1,"banh gao", 20000, "Orion");
//        ProductSs17 prd2 = new ProductSs17(2,"banh cay", 25000, "Oshi");
//        ProductSs17 prd3 = new ProductSs17(3,"banh bong lan", 10000, "Orion");
//        ProductSs17 prd4 = new ProductSs17(4,"banh sua", 29000, "Toppo");
//        ProductSs17 prd5 = new ProductSs17(5,"banh phong tom", 13000, "Orion");
//        ProductSs17 prd6 = new ProductSs17(6,"banh sua chua", 30000, "Aeo");
//        productSs17s.add(prd1);
//        productSs17s.add(prd2);
//        productSs17s.add(prd3);
//        productSs17s.add(prd4);
//        productSs17s.add(prd5);
//        productSs17s.add(prd6);
//    }

    @Override
    public void creatProduct(ProductSs17 prd) {
        List<ProductSs17> productSs17List = this.getProductSs17s();
        prd.setId(productSs17List.get(productSs17List.size()-1).getId() + 1);
        productSs17List.add(prd);
        readAndWriteFile.writeFile(PRODUCT_PATH_NAME, this.convertToString(productSs17List));
    }

    @Override
    public List<ProductSs17> displayProduct() {
        List<ProductSs17> productSs17List = this.getProductSs17s();
        return productSs17List;
    }

    @Override
    public List<ProductSs17> searchProduct(String name) {
        List<ProductSs17> productSs17List = this.getProductSs17s();
        List<ProductSs17> searchList = new ArrayList<>();
        for(ProductSs17 p: productSs17List) {
            if(p.getProductName().contains(name)) {
                searchList.add(p);
            }
        }
        return searchList;
    }
    public List<String> convertToString(List<ProductSs17> productList) {
        List<String> productString = new ArrayList<>();
        for(ProductSs17 pr: productList) {
            productString.add(pr.getId() + COMMA + pr.getProductName() + COMMA + pr.getPrice() + COMMA + pr.getProducer());
        }
        return productString;
    }
    public List<ProductSs17> convertToProductSs17(List<String> productString) {
        List<ProductSs17> productSs17List = new ArrayList<>();
        for(String product: productString) {
            String[] strings = product.split(COMMA);
            productSs17List.add(new ProductSs17(Integer.parseInt(strings[0]), strings[1], Float.parseFloat(strings[2]), strings[3]));
        }
        return productSs17List;
    }
    public List<ProductSs17> getProductSs17s() {
        List<String> productSs17String = readAndWriteFile.readFile(PRODUCT_PATH_NAME);
        return this.convertToProductSs17(productSs17String);
    }

}
