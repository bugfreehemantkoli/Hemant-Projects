import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

class DigitalClock extends JFrame {
    JLabel l1, l2;
    SimpleDateFormat d1, d2;

    DigitalClock(String s1) {
        super(s1);
        setComponents();
    }

    void setComponents() {
        l1 = new JLabel();
        l2 = new JLabel();

        l1.setFont(new Font("Arial", Font.BOLD, 50));
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setForeground(Color.RED.brighter());
        l1.setBackground(Color.BLACK);
        l1.setOpaque(true);

        l2.setFont(new Font("Arial", Font.BOLD, 40));
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setForeground(Color.WHITE);
        l2.setBackground(Color.DARK_GRAY);
        l2.setOpaque(true);

        setLayout(new GridLayout(2, 1));
        add(l1);
        add(l2);

        setSize(800, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        d1 = new SimpleDateFormat("hh:mm:ss a");
        d2 = new SimpleDateFormat("EEEE, dd MMM yyyy");

        Timer t = new Timer(1000, e -> {
            String time = d1.format(Calendar.getInstance().getTime());
            String day = d2.format(Calendar.getInstance().getTime());
            l1.setText(time);
            l2.setText(day);
        });
        t.start();
    }

    public static void main(String[] args) {
        new DigitalClock("Digital Clock");
    }
}
