import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout; 
import java.awt.Component;

public class i200_Project {

    public static void main(String[] args) {

        JFrame frame = new JFrame("VOCEX - Individual vocal exercise program"); // copied from http://stackoverflow.com/questions/22506331/simple-dropdown-menu-in-java
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocation(430, 100);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.add(panel);

        JLabel lbl1 = new JLabel("Select your sex"); //valime sugu
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT);


        panel.add(lbl1);

        String[] choices1 = { "Man", "Woman"};

        final JComboBox<String> cb1 = new JComboBox<String>(choices1);

        cb1.setMaximumSize(cb1.getPreferredSize());
        cb1.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(cb1);

        //JButton btn1 = new JButton("OK");
        //btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        //panel.add(btn1);

        JLabel lbl2 = new JLabel("Select your voice type"); // valime hääletüüpi
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT);


        panel.add(lbl2);

        String[] choices2 = { "Soprano", "Bass"};

        final JComboBox<String> cb2 = new JComboBox<String>(choices2);

        cb2.setMaximumSize(cb2.getPreferredSize());
        cb2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(cb2);

        JLabel lbl3 = new JLabel("Select exercise type"); // valime hääletüüpi
        lbl3.setAlignmentX(Component.CENTER_ALIGNMENT);


        panel.add(lbl3);

        String[] choices3 = { "Warm up", "Breathing", "High notes"};

        final JComboBox<String> cb3 = new JComboBox<String>(choices3);

        cb3.setMaximumSize(cb3.getPreferredSize());
        cb3.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(cb3);

        JButton btn = new JButton("OK");
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(btn);

        frame.setVisible(true);

    }
}