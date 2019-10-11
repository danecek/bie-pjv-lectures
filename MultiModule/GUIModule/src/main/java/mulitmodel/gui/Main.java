package mulitmodel.gui;

import biepjv.hello.Hello;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

    public Main() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(new JLabel(Hello.HELLO, null, JLabel.CENTER));
        this.setBounds(500, 500, 500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
