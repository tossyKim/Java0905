package _gui.controller;
import _gui.view.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    public static final int FRAME_WIDTH = 600;
    public static final int FRAME_HEIGHT = 500;
    public static int FRAME_X = 300;
    public static int FRAME_Y = 200;

    public MainFrame() {
        super("검색프로그램");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        double a = dimension.getWidth();
        double b = dimension.getHeight();

        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView);

        int aa = (int)(a - FRAME_WIDTH)/2;
        int bb = (int)(b - FRAME_HEIGHT)/2;
        setLocation(aa,bb);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
