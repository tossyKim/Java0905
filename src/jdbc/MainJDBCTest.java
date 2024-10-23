package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainJDBCTest {
    public static void main(String[] args) {
        Connection con = JDBCConnector.getConnection();
        String sql = "Select * from 주문,제품 where 주문.주문제품=제품.제품번호";
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            ResultSet result = pstmt.executeQuery();
            while(result.next()) {
                String customerId = result.getString("주문고객");
                String ProductId = result.getString("주문제품");
                String ProductName = result.getString("제품명");
                int count = result.getInt("수량");
                System.out.printf("- 주문고객명 %s \t- 주문제품ID %s \t- 수량 %d \t- 제품명 %s\n",customerId,ProductId,count,ProductName);
            }
        } catch (SQLException e) {
            System.out.println("문장객체 생성에 문제가 발생했습니다.");
        }

        try {
            pstmt.close();
            con.close();
        }catch (SQLException e){
            System.out.println("연결종료에 문제가 발생했습니다.");
        }
    }
}

