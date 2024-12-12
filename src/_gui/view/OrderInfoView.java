package _gui.view;
import _gui.entity.OrderEntity;
import _gui.repository.OrderRepository;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class OrderInfoView extends JPanel {

    JPanel panN = new JPanel(new GridLayout(2, 1));
    JPanel panC = new JPanel(new BorderLayout(5,20));
    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();
    JPanel addPanel = new JPanel(new GridLayout(3,1));
    JTextField tfSearch = new JTextField(20);
    DefaultTableModel tableModel;
    JTable table;
    String[] header = {"주문번호","주문고객","주문제품","수량","배송지","주문일자"};

    public OrderInfoView() {
        setLayout(new BorderLayout());
        panN.add(pan1);
        panN.add(pan2);
        add(panN,"North");
        add(panC, "Center");
        addPan1();
        addPan2();
        addTable();
        addOrderInfo();
        initList("");
    }
    public void addPan1(){
        JLabel lblTitle = new JLabel("검색 프로그램");
        pan1.add(lblTitle);
    }
    public void addPan2(){
        JLabel lblSearch = new JLabel("검색어 : ");
        JButton btnSearch = new JButton("검색");
        btnSearch.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String searchWord = tfSearch.getText();
                initList(searchWord);
            }
        });
        pan2.add(lblSearch);
        pan2.add(tfSearch);
        pan2.add(btnSearch);
    }
    public void addTable(){
        tableModel = new DefaultTableModel(header,15){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(tableModel);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(180);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(200);
        columnModel.getColumn(5).setPreferredWidth(100);

        JScrollPane scrollPane = new JScrollPane(table);
        panC.add(scrollPane, "Center");
    }

    public void initList(String searchWord){
        OrderRepository orderRepository = new OrderRepository();
        ArrayList<OrderEntity> orderList = orderRepository.getOrderList(searchWord);
        tableModel.setRowCount(orderList.size());
        int i = 0;
        for(OrderEntity  orderEntity : orderList){
            tableModel.setValueAt(orderEntity.getOrderNum(), i, 0);
            tableModel.setValueAt(orderEntity.getCustomerName(), i, 1);
            tableModel.setValueAt(orderEntity.getProductName(), i, 2);
            tableModel.setValueAt(orderEntity.getAmount(), i, 3);
            tableModel.setValueAt(orderEntity.getDestination(), i, 4);
            tableModel.setValueAt(orderEntity.getOrderDate(), i, 5);
            i++;
        }
    }
    public void addOrderInfo(){
        JButton btnadd = new JButton("주문추가");
        JLabel title = new JLabel("주문 정보 입력",JLabel.CENTER);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        panC.add(addPanel,"South");
        addPanel.add(title);
        addPanel.add(p1);
        addPanel.add(p2);
        String[] lblstrs = {"주문번호:","고객아이디:","제품번호:","수량:","배송지:", "주문일자:"};
        JLabel[] lbls = new JLabel[lblstrs.length];
        JTextField[] texts = new JTextField[lblstrs.length];

        for(int i = 0; i < lblstrs.length; i++){
            lbls[i] = new JLabel(lblstrs[i]);
            texts[i] = new JTextField(20);
            if(i<3){
                p1.add(lbls[i]);
                p1.add(texts[i]);
            }
            else{
                p2.add(lbls[i]);
                p2.add(texts[i]);
            }
        }
//        addPanel.add(btnadd);
    }
}
