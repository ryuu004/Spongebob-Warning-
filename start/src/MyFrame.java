import javax.swing.*;
import java.awt.*;
import java.awt.Font.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JLabel label;
    JButton button;
    MyFrame(){
        ImageIcon imageIcon = new ImageIcon("img.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);  // transform it back

        label = new JLabel();
        label.setIcon(imageIcon);
        label.setVisible(false);
        label.setBounds(0, 0, 500, 500);


        button = new JButton();
        button.setBounds(100, 125, 300, 150);
        button.setFocusable(false);
        button.setText("ALERT");
        button.setFont(new Font("Arial",Font.BOLD , 30 ));
        button.addActionListener(this);
        button.setForeground(Color.white);
        button.setBackground(new Color(0xf00c27));
        button.setBorder(BorderFactory.createEmptyBorder());

        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            label.setVisible(true);
            button.setVisible(false);
            System.out.println("poo");
        }
    }
}
