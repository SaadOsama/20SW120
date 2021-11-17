import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Receipt_system{
    JFrame frame;
    JPanel panel;
    JLabel label1, label2, label3,label4,label5,label6, label7;
    JButton button, button2;

    Receipt_system()
    {
        frame= new JFrame("My Project ");
        frame.setSize(600,450);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.pink);

        panel= new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(0,0,600,80);
        panel.setOpaque(true);


        label1= new JLabel("ELECTRONIC FEES RECEIPT");
        label1.setFont(new Font("ARIAL", Font.BOLD, 40));
        label1.setForeground(Color.white);
        label1.setBounds(100,75,100,200);

        label3 = new JLabel("INTRODUCTION");
        label3.setFont(new Font("ARIAL", Font.BOLD, 33));
        label3.setForeground(Color.DARK_GRAY);
        label3.setBounds(180,10,250,200);

        label4 = new JLabel("PROJECT BY: ");
        label4.setFont(new Font("ARIAL", Font.BOLD, 20));
        label4.setForeground(Color.DARK_GRAY);
        label4.setBounds(195,65,250,200);

        label5 = new JLabel("USAMA AKHUND (20SW120) ");
        label5.setFont(new Font("ARIAL", Font.BOLD, 20));
        label5.setForeground(Color.DARK_GRAY);
        label5.setBounds(195,100,350,200);

        label7 = new JLabel("Click here to open the receipt:  ");
        label7.setFont(new Font("ARIAL", Font.BOLD, 30));
        label7.setForeground(Color.DARK_GRAY);
        label7.setBounds(100,200,500,200);

        button = new JButton("Click here");
        button.setFocusable(false);
        button.setBounds(170, 330, 130,40);
        button.setBackground(Color.darkGray);
        button.setForeground(Color.white);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                    new E_fee_receipt();
                    frame.dispose();
                }
            }
        });



        button2 = new JButton("Cancel");
        button2.setBackground(Color.darkGray);
        button2.setBounds(320,330,130,40);
        button2.setFocusable(false);
        button2.setForeground(Color.white);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button2) {
                    frame.dispose();
                }
            }
        });




        JLabel label2 = new JLabel();
        label2.setIcon(new ImageIcon("C:\\Users\\village computer mpk\\IdeaProjects\\2nd java program\\p4.jpg"));
        label2.setBounds(0,30,230,450);


        frame.add(panel);
        frame.add(label2);
        panel.add(label1);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label7);
        frame.add(button);
        frame.add(button2);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Receipt_system();

    }

}