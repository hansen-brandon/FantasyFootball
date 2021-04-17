package com.company;
/*
Created a simple GUI using Java Swing. The GUI can look better than it is, but I decided to keep the application somewhat simple by just having a single button
that randomized a fantasy team every single time the button is clicked. I ended up using HTML tags to format text on the GUI.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends GenerateTeam implements ActionListener {
    private JLabel label;
    private JFrame window;
    private JPanel panel;
    private JButton button;

    public GUI() {
        window = new JFrame(); //New Window
        mainButton();
        windowAndPanel();

    }


    @Override
    public void actionPerformed(ActionEvent e) { //Printing out the team in actionPerformed method. Used HTML tags to format.
        label.setText("<html>" + "Your randomly generated team is: " + "<br>" + "<br>" + "QB: " + randomQB() + "<br>" + "RB1: " + randomRB() + "<br>"
                + "RB2: " + randomRB() + "<br>" + "WR1: " + randomWR() + "<br>" + "WR2: " + randomWR() + "<br>" + "TE: " +
                randomTE() + "<br>" + "FLEX: " + randomFlex() + "<br>" + "K: " + randomK() + "<br>" + "DEF: " + randomDEF() + "<br>" + "</html>");


    }

    public void mainButton() {
        button = new JButton("Click me to randomize!"); //Main randomize Button.
        button.setForeground(Color.black);
        button.setBackground(Color.white);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.addActionListener(this);

    }

    public void windowAndPanel() {
        label = new JLabel("What will your team be?");
        label.setHorizontalAlignment(SwingConstants.CENTER);


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(1, 0));
        panel.setBackground(Color.yellow);
        panel.setForeground(Color.gray);


        panel.add(button);
        panel.add(label);


        window.add(panel, BorderLayout.CENTER);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Randomize");
        window.setPreferredSize(new Dimension(600, 300));
        window.pack();
        window.setVisible(true);

    }

}
