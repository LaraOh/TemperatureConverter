/**
 *  @author LaraOh
 *  @version 25.09.2024
 */



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TCMainWindow extends JFrame {
    JFrame frame;
    JPanel buttonPanel;
    JPanel inputPanel;
    JButton btnCtoF;
    JButton btnFtoC;
    JTextField celsius;
    JTextField fahrenheit;
    JLabel c;
    JLabel f;
    Font serifPlain = new Font("Serif", Font.PLAIN, 20);
    Font serifBold = new Font("Serif", Font.BOLD, 20);

    //Constructor
    public TCMainWindow(){
        super("Temperature Converter"); //Window title
        setResizable(false); //Window not resizeable
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create C to F button and add to Panel
        btnCtoF = new JButton("Convert C to F");
        btnCtoF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String sC = celsius.getText();
                double c = Double.parseDouble(sC);
                double f = (c * 9/5) + 32;
                fahrenheit.setText(String.valueOf(f));
            }
        });

        btnFtoC = new JButton("Convert F to C");
        btnFtoC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String sF = fahrenheit.getText();
                double f = Double.parseDouble(sF);
                double c = (f - 32) * 5/9;
                celsius.setText(String.valueOf(c));
            }
        });

        buttonPanel= new JPanel();
        //add buttons to panel
        buttonPanel.add(btnCtoF);
        buttonPanel.add(btnFtoC);
        add(buttonPanel, BorderLayout.SOUTH); // put panel at bottom of Frame

        inputPanel = new JPanel(new SpringLayout());

        // Celsius
        c = new JLabel("Celsius");
        c.setFont(serifBold);
        inputPanel.add(c);

        celsius = new JTextField(16);
        celsius.setFont(serifPlain);
        inputPanel.add(celsius);

        // Fahrenheit
        f = new JLabel("Fahrenheit");
        f.setFont(serifBold);
        inputPanel.add(f);

        fahrenheit =new JTextField(16);
        fahrenheit.setFont(serifPlain);
        inputPanel.add(fahrenheit);

        // Layout
        SpringUtilities.makeCompactGrid(inputPanel, 2, 2, 6,6,6,6);

        frame = new JFrame();
        frame.setContentPane(inputPanel);

        add(inputPanel, BorderLayout.CENTER);

        pack(); //Fit window size to content
        setVisible(true); //show Frame
    }

}
