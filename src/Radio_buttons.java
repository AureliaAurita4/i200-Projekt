import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by svetlana on 8.10.16.
 */
public class Radio_buttons {
    public static void main(String[] args) {

        String manString = "Man";
        String wmString = "Woman";

        JRadioButton manButton = new JRadioButton(manString);
        manButton.setMnemonic(KeyEvent.VK_B);
        manButton.setActionCommand(manString);
        manButton.setSelected(true);

        JRadioButton wmButton = new JRadioButton(wmString);
        wmButton.setMnemonic(KeyEvent.VK_C);
        wmButton.setActionCommand(wmString);


        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(manButton);
        group.add(wmButton);


        //Register a listener for the radio buttons.
        manButton.addActionListener(this);
        wmButton.addActionListener(this);


        public void actionPerformed(ActionEvent e) {
            picture.setIcon(new ImageIcon("images/"
                    + e.getActionCommand()
                    + ".gif"));
        }

    //Put the radio buttons in a column in a panel.
    JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.add(manButton);
        radioPanel.add(wmButton);


    add(radioPanel, BorderLayout.LINE_START);
    add(picture, BorderLayout.CENTER);
    setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
}

    /** Listens to the radio buttons. */
    public void actionPerformed(ActionEvent e) {
        picture.setIcon(createImageIcon("images/"
                + e.getActionCommand()
                + ".gif"));
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = RadioButtonDemo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("RadioButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new RadioButtonDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
    }
}
