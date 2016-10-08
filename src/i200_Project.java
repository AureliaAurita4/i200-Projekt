import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout; 
import java.awt.Component;

public class i200_Project {

    public static void main(String[] args) {

        JFrame frame = new JFrame("VOCEX - Individual vocal exercise program");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocation(430, 100);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.add(panel);

        JLabel lbl = new JLabel("Select your sex");
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        //lbl.setVisible(true); // Not needed

        panel.add(lbl);

        String[] choices = { "Man", "Woman"};

        final JComboBox<String> cb = new JComboBox<String>(choices);

        cb.setMaximumSize(cb.getPreferredSize());
        cb.setAlignmentX(Component.CENTER_ALIGNMENT);
        //cb.setVisible(true); // Not needed
        panel.add(cb);

        JButton btn = new JButton("OK");
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(btn);

        frame.setVisible(true);

    }
}