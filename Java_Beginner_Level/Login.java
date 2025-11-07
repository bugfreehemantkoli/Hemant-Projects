import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Login extends JFrame {
    JLabel l1, l2, l3;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3;

    Login(String title) {
        super(title);
    }

    void setComponents() {
        Font f = new Font("Calibri", Font.BOLD, 25);

        l1 = new JLabel("Username");
        l1.setFont(f);

        l2 = new JLabel("Password");
        l2.setFont(f);

        l3 = new JLabel();

        t1 = new JTextField();
        t2 = new JPasswordField();

        b1 = new JButton("Sign In");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Clear");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);

        b3 = new JButton("Add");

        setLayout(null);

        l1.setBounds(100, 100, 160, 50);
        l2.setBounds(100, 200, 160, 50);
        t1.setBounds(300, 100, 200, 40);
        t2.setBounds(300, 200, 200, 40);
        b1.setBounds(100, 300, 120, 40);
        b2.setBounds(250, 300, 120, 40);
        b3.setBounds(400, 300, 120, 40);
        l3.setBounds(100, 380, 300, 30);

        add(l1); add(l2); add(l3);
        add(t1); add(t2);
        add(b1); add(b2); add(b3);

        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
        l1.addMouseListener(new MouseL());
    }

    // Mouse Listener Class
    class MouseL implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            l1.setForeground(Color.RED);
        }
        public void mouseEntered(MouseEvent e) {
            l1.setForeground(Color.GREEN);
        }
        public void mouseExited(MouseEvent e) {
            l1.setForeground(Color.BLACK);
        }
        public void mousePressed(MouseEvent e) {
            l1.setText("");
        }
        public void mouseReleased(MouseEvent e) {
            l1.setText("Username");
        }
    }

    // Login Button Action
    class Log implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String user = t1.getText();
            String pass = new String(t2.getPassword());

            if (user.equals("admin") && pass.equals("password")) {
                l3.setText("Login Successful");
            } else {
                l3.setText("Login Failed");
            }
        }
    }

    // Clear Button Action
    class Clear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t1.setText("");
            t2.setText("");
            l3.setText("");
        }
    }

    // Add Button Action
    class Add implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(new String(t2.getPassword()));
                int sum = a + b;
                l3.setText("Sum: " + sum);
            } catch (Exception ex) {
                l3.setText("Enter Numbers Only!");
            }
        }
    }

    public static void main(String[] args) {
        Login log = new Login("Login Form");
        log.setComponents();
        log.setSize(600, 500);
        log.setVisible(true);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
