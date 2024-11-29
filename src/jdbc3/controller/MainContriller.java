package jdbc3.controller;
import jdbc.JDBCConnector;
import jdbc3.entitiy.Product;
import jdbc3.repository.ProductRepository;
import jdbc3.service.ProductService;
import jdbc3.service.ProductServiceImpl;
import jdbc3.view.MenuView;
import jdbc3.view.ProductView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainContriller {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        int menu = MenuView.printMenu(s1);

        switch (menu) {
            case 1:
                productService.search(s1,s2);
                break;
            case 2:
                System.out.println("수정 메소드가 들어올 예정");
                break;
            case 3:
                System.out.println("삭제 메소드가 들어올 예정");
                break;
        }

        
        

        s1.close();
        s2.close();
    }



    

    
}
