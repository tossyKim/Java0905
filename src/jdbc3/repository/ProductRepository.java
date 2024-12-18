package jdbc3.repository;

import jdbc.JDBCConnector;
import jdbc3.entitiy.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductRepository {

    public static ArrayList<Product> getList(String type, String searchword) {

        ArrayList<Product> arrayList = new ArrayList<>();
        Connection con = JDBCConnector.getConnection();
        String sql = "select * from 제품 where " + type + " like ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + searchword + "%");

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setProNum(rs.getString("제품번호"));
                product.setProName(rs.getString("제품명"));
                product.setProStock(rs.getInt("재고량"));
                product.setProPrice(rs.getInt("단가"));
                product.setProduceName(rs.getString("제조업체"));
                arrayList.add(product);
            }
            rs.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return arrayList;
    }

}
