import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent.*;
import java.util.Date;

public class E_fee_receipt extends JFrame {


        JPanel pnl;
        JLabel lbl;
        JLabel l1;
        JLabel l2;
        JLabel l3;
        JLabel l4;
        JLabel l5;
        JTextField t1;
        JTextField t2;
        JComboBox j1;
        JTextField t4;
        JTextField t5;
        JButton gen_receipt;
        JButton reset;
        JButton print;
        JTextArea a1;





    E_fee_receipt()
        {
            setTitle("Electronic Fees receipt");
            setSize(800,380);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);

            pnl = new JPanel();
            pnl.setBounds(0,0,800,380);
            pnl.setBorder(new LineBorder(Color.BLACK,3));
            pnl.setBackground(Color.cyan);
            pnl.setLayout(null);

            lbl= new JLabel("Electronic Fees Receipt");
            lbl.setBounds(210,10,450,35);
            lbl.setFont(new Font("Arial", Font.ITALIC, 40));
            lbl.setBackground(Color.black);

            l1 = new JLabel("Enter Student name");
            l1.setBounds(10,80,200,40);
            l1.setFont(new Font("Arial", Font.PLAIN,20));
            l1.setBackground(Color.GRAY);

            l1 = new JLabel("Enter Student name : ");
            l1.setBounds(10,80,200,40);
            l1.setFont(new Font("Arial", Font.PLAIN,20));
            l1.setBackground(Color.GRAY);

            l2 = new JLabel("Enter Father name : ");
            l2.setBounds(10,120,200,40);
            l2.setFont(new Font("Arial", Font.PLAIN,20));
            l2.setBackground(Color.GRAY);

            l3 = new JLabel("Batch Timing : ");
            l3.setBounds(10,160,200,40);
            l3.setFont(new Font("Arial", Font.PLAIN,20));
            l3.setBackground(Color.GRAY);

            l4 = new JLabel("Enter phone no : ");
            l4.setBounds(10,200,200,40);
            l4.setFont(new Font("Arial", Font.PLAIN,20));
            l4.setBackground(Color.GRAY);

            l5 = new JLabel("Enter Fee Amount  : ");
            l5.setBounds(10,240,200,40);
            l5.setFont(new Font("Arial", Font.PLAIN,20));
            l5.setBackground(Color.GRAY);


            t1 = new JTextField(50);
            t1.setBounds(215,85,200,30);

            t2 = new JTextField(50);
            t2.setBounds(215,125,200,30);

            String[] choices = {"Morning", "Evening"};

            j1 = new JComboBox(choices);
            j1.setBounds(215,165,200,30);

            t4 = new JTextField(50);
            t4.setBounds(215,205,200,30);

            t5 = new JTextField(50);
            t5.setBounds(215,245,200,30);

            gen_receipt =   new JButton("Generate Receipt");
            gen_receipt.setFont(new Font("Arial",Font.BOLD,20));
            gen_receipt.setBackground(Color.blue);
            gen_receipt.setForeground(Color.white);
            gen_receipt.setBounds(10,290, 200,30);
            gen_receipt.setOpaque(true);

            print =   new JButton("Print");
            print.setFont(new Font("Arial",Font.BOLD,20));
            print.setBackground(Color.blue);
            print.setForeground(Color.white);
            print.setBounds(215,290, 100,30);
            print.setOpaque(true);

            reset =   new JButton("Reset");
            reset.setFont(new Font("Arial",Font.BOLD,20));
            reset.setBackground(Color.blue);
            reset.setForeground(Color.white);
            reset.setBounds(320,290, 100,30);
            reset.setOpaque(true);

            a1 = new JTextArea(5,30);
            a1.setBounds(450,60,300,270);
            a1.setEditable(false);



         gen_receipt.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if(e.getSource()==gen_receipt)
                 {

                     a1.setText("**************************************\n         Mehran University \n");
                     a1.setText(a1.getText()+"                  Jamshoro\n");
                     a1.setText(a1.getText()+"              E fee receipt\n**************************************\n");

                    Date obj = new Date();
                     String date = obj.toString();
                     a1.setText(a1.getText()+"\n"+date+"\n\n");
                     a1.setText(a1.getText()+"Student name : "+t1.getText()+"\n");
                     a1.setText(a1.getText()+"Father name : " +t2.getText()+"\n");
                     a1.setText(a1.getText()+"Batch timing : "+j1.getSelectedItem()+"\n");
                     a1.setText(a1.getText()+"Mobile number : "+t4.getText()+"\n");
                     a1.setText(a1.getText()+"Fees amount : "+t5.getText()+"\n");
                     a1.setText(a1.getText()+"");
                     a1.setText(a1.getText()+"\n                                         signature");
                     a1.setText(a1.getText()+"\n                                           and stamp");

                     boolean s = true;
                     for (int i = 0; i < t4.getText().length(); i++) {

                         if (t4.getText().charAt(i) >= '0' && t4.getText().charAt(i) <= '9')
                             s = true;
                         else
                             s = false;
                     }

                     if (s == false) {
                         JOptionPane.showMessageDialog(null, "enter only digits");
                     }

                 }

             }
         });


         print.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     a1.print();
                 }
                 catch (Exception e1)
                 {
                     System.out.println("Exception are-"+e1);
                 }
             }
         });


         reset.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if(e.getSource()== reset)
                 {
                     t1.setText("");
                     t2.setText("");

                     t4.setText("");
                     t5.setText("");
                 }
             }
         });



            this.add(pnl);
            pnl.add(lbl);
            pnl.add(l1);
            pnl.add(l2);
            pnl.add(l3);
            pnl.add(l4);
            pnl.add(l5);
            pnl.add(t1);
            pnl.add(t2);
            pnl.add(j1);
            pnl.add(t4);
            pnl.add(t5);
            pnl.add(gen_receipt);
            pnl.add(print);
            pnl.add(reset);
            pnl.add(a1);


            setVisible(true);
        }
}
