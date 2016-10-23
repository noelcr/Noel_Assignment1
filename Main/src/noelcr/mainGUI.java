package noelcr;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class mainGUI extends JFrame {
    JLabel question = new JLabel("How many players?");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(10);
    JButton pressMe = new JButton("NEW GAME");
    JLabel greeting = new JLabel("");
    final int WIDTH = 375;
    final int HEIGHT = 225;



    public mainGUI()
    {
        super("Super T Game");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        question.setFont(bigFont);
        greeting.setFont(bigFont);
        add(question, BorderLayout.NORTH);
        add(answer);
        add(pressMe);
        pressMe.setToolTipText("I do not have any info, sorry");
        add(greeting, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pressMe.addActionListener(e -> {
            int first = Integer.parseInt(answer.getText().trim());
            STGame game = new STGame(first);
            game.selectDealer();
            game.dealRandomCardsToEachPlayer();
            game.selectYouAsPlayer();
            System.out.println(first);
        });

        //pressMe.addActionListener(new MyActivateButtno());



}}
