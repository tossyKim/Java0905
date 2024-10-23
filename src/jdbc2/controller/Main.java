package jdbc2.controller;
import jdbc.JDBCConnector;
import jdbc2.entity.Customer;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import jdbc2.view.CustomerView;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection con = JDBCConnector.getConnection();

        String sql = "select * from 고객";
        PreparedStatement pstmt = null;
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        Customer customer = null;

        try {
            ResultSet result = pstmt.excuteQuery();
            pstmt = con.prepareStatement(sql);
            customer = new Customer;

            customer.setCustomerName(result.getString("고객이름"));
            customer.setAge(result.getInt("나이"));
            customer.setLevel(result.getString("등급"));
            customer.setJob(result.getString("직업"));
            customer.setreward(result.getInt("적립금"));
            customerList.add(customer);
            pstmt.close();
            con.close();
        } catch (SQLException e) {

        }


        CustomerView view = new CustomerView();
        view.printHead();
        for (Customer : customerList){
            view.printCustomer(custom);
        }
        view.printFooter();
    }
}





