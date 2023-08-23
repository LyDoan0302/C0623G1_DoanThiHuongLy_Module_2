package ss17_IO_binaryFile_serialization.exercise.ex1.view;

import ss17_IO_binaryFile_serialization.exercise.ex1.controller.ProductController;
import ss17_IO_binaryFile_serialization.exercise.ex1.model.model.ProductSs17;

import java.util.List;
import java.util.Scanner;

public class MainView {
    Scanner scanner = new Scanner(System.in);
    private final ProductController productController = new ProductController();

    public void showMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Them moi san pham");
        System.out.println("2. Hien thi san pham");
        System.out.println("3. Tiem kiem san pham");
        System.out.println("0. Thoat chuong trinh");
    }
    public void render() {
        showMenu();
        int option = 0;
        do{
            System.out.println("Moi chon chuc nang muon thao tac:");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Nhap ten san pham:");
                    String name = scanner.nextLine();
                    Float price = 0.0f;
                    do {
                        System.out.println("Nhap gia san pham:");
                        price = Float.parseFloat(scanner.nextLine());
                        if(price < 0) {
                            System.out.println("Gia san pham khong duoc nho hon 0.");
                        }
                        if(price > 1000000000) {
                            System.out.println("Gia san pham khong duoc lon hon 1ty.");
                        }
                    } while (price < 0 || price > 1000000000);
                    System.out.println("Nhap ten nha san xuat:");
                    String producer = scanner.nextLine();
                    this.productController.creatProduct(inputProduct(name, price, producer));
                    break;
                case 2:
                    List<ProductSs17> list = this.productController.displayProduct();
                    for(ProductSs17 prd: list) {
                        System.out.println(prd);
                    }
                    break;
                case 3:
                        System.out.println("Nhap ten san pham can tim kiem:");
                        String searchName = scanner.nextLine();
                        List<ProductSs17> searchList = this.productController.searchProduct(searchName);
                        if (searchList.size() == 0) {
                            System.out.println("Khong co san pham duoc tim thay.");
                        } else {
                            for(ProductSs17 prd: searchList) {
                                System.out.println(prd);
                            }
                        }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Xin loi, lua chon cua ban khong ton tai.");
                    break;
            }
            render();
            break;

        } while(option < 0 || option > 3);

    }

    public ProductSs17 inputProduct(String name, float price, String producer) {
        ProductSs17 prd = new ProductSs17();
        prd.setProductName(name);
        prd.setPrice(price);
        prd.setProducer(producer);
        return prd;
    }
}
