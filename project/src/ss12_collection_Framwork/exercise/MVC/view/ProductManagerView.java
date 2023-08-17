package ss12_collection_Framwork.exercise.MVC.view;

import ss12_collection_Framwork.exercise.MVC.controller.ProductController;
import ss12_collection_Framwork.exercise.MVC.model.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductManagerView {
    private final ProductController productController = new ProductController();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("=====MENU=====");
        System.out.println("1. Display products");
        System.out.println("2. Search product by name.");
        System.out.println("3. Creat product.");
        System.out.println("4. Delete product.");
        System.out.println("5. Edit product's information.");
        System.out.println("6. Sort products by price.");
        System.out.println("0. Exit");
    }

    public void render() {
        int option = 0;

        do {
            showMenu();
            System.out.println("Input the number of option:");
            option = Integer.parseInt(scanner.nextLine());

        } while (option < 0 || option > 6);

        switch (option) {
            case 1:
                List<Product> products = this.productController.getProduct();
                for(Product p: products) {
                    System.out.println(
                            "@id: " + p.getId() + " ,name: " + p.getName() + " ,price: " + p.getPrice()
                    );
                }

                break;
            case 2:
                System.out.println("Input name of product to search: ");
                String name = scanner.nextLine();
                System.out.println(this.productController.searchProductByName(name));
                break;
            case 3:
                this.productController.creatProduct(inputProductInformation());
                break;
            case 4:
                System.out.println("Input the id of product to delete:");
                int id = Integer.parseInt(scanner.nextLine());
                this.productController.deleteProduct(id);
                break;
            case 5:
                this.productController.updateInformation(updateProductInformation());
                break;
            case 6:

                System.out.println("input the method you want to sort (ASC or DESC):");
                String choice = scanner.nextLine();
                System.out.println(this.productController.sortProductByPrice(choice));
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("option is invalid");
                break;
        }
        render();

    }

    private Product inputProductInformation() {
        Product product = new Product();

        System.out.println("Input the name of product:");
        product.setName(scanner.nextLine());

        System.out.println("Input price of product:");
        product.setPrice(Integer.parseInt(scanner.nextLine()));

        return product;
    }

    private Product updateProductInformation() {
        Product product = new Product();

        System.out.println("Input the id of product to update:");
        product.setId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Input the name of product to update:");
        product.setName(scanner.nextLine());

        System.out.println("Input price of product to update:");
        product.setPrice(Integer.parseInt(scanner.nextLine()));

        return product;
    }

}



