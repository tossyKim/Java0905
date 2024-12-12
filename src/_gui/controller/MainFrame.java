package _gui.controller;
import _gui.view.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    public static final int FRAME_WIDTH = 950;
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

        int frameX = (int)(a - FRAME_WIDTH)/2;
        int frameY = (int)(b - FRAME_HEIGHT)/2;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(frameX,frameY);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
