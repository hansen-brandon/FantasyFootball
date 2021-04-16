package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends GenerateTeam implements ActionListener {
    private JLabel label;
    private JFrame window;
    private JPanel panel;
    private JButton button;

    public GUI() {


        window = new JFrame(); //New Window

        JButton button = new JButton("Randomize"); //Main randomize Button.
        button.addActionListener(this);

        label = new JLabel("Click me to get your random fantasy team");


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);


        window.add(panel, BorderLayout.CENTER);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Randomize");
        window.pack();
        window.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) { //Printing out the team in actionPerformed method. Used HTML tags to format.
        label.setText("<html>" + "Your randomly generated team is: " + "<br>" + "<br>" + "QB: " + randomQB() + "<br>" + "RB1: " + randomRB() + "<br>"
                + "RB2: " + randomRB() + "<br>" + "WR1: " + randomWR() + "<br>" + "WR2: " + randomWR() + "<br>" + "TE: " +
                randomTE() + "<br>" + "FLEX: " + randomFlex() + "<br>" + "K: " + randomK() + "<br>" + "DEF: " + randomDEF() + "<br>" + "</html>");


    }
}
