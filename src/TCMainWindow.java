/**
 *  @author LaraOh
 *  @version 25.09.2024
 */

import java.awt.*;
import javax.swing.*;

public class TCMainWindow extends JFrame{
    JPanel panButton = new JPanel(); //Panel
    JButton btnConv = new JButton("Convert"); //Button

    //Constructor
    public TCMainWindow(){
        super("Temperature Converter"); //Window title
        setResizable(false); //Window not resizeable
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panButton.add(btnConv); //add button to panel
        setLayout(new BorderLayout());
        add(panButton, BorderLayout.SOUTH); // put panel at bottom of Frame

        pack(); //Fit window size to content
        setVisible(true); //show Frame
    }

}
