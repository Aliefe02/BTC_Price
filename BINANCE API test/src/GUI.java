import javax.swing.*;
import java.awt.*;

public class GUI {

    private String symbol,price;

    JFrame frame;
    JPanel panel;
    JLabel label;

    GUI(){

        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();

        frame.setSize(200,100);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        panel.setBounds(0,0,200,100);
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);

        label.setForeground(Color.WHITE);
        label.setBounds(30,20,180,20);


        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);


    }

    public void setStats(String symbol,String price){
        this.price = price;
        this.symbol = symbol;
        this.label.setText(this.symbol + " : "+this.price.substring(0,9));
    }

}
