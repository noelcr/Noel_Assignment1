package noelcr;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class mainGUI extends JFrame {
    JLabel question = new JLabel("How many players?");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(10);
    //JLabel answer = new JLabel();
    JButton pressMe = new JButton("NEW GAME");
    JLabel greeting = new JLabel("");
    final int WIDTH = 375;
    final int HEIGHT = 225;
    private STGame game;
    PlayerView playerView;


//    public Integer[] playerListNum = {3,4,5};
//    JComboBox dropMenu = new JComboBox((playerListNum))

    public mainGUI()
    {
        super("Super T Game");
        setSize(WIDTH, HEIGHT);
        //setLayout(new FlowLayout());
        question.setFont(bigFont);
        greeting.setFont(bigFont);

        JPanel panell = new JPanel();
        panell.add(question);
        panell.add(answer);
        add(panell, BorderLayout.NORTH);

//        add(question, BorderLayout.NORTH);
//        add(answer, BorderLayout.WEST);
        add(pressMe, BorderLayout.SOUTH);
        pressMe.setToolTipText("I do not have any info, sorry");
        add(greeting, BorderLayout.EAST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        pressMe.addActionListener(e -> {
            int first = Integer.parseInt(answer.getText().trim());
            STGame game = new STGame(first);
            game.selectDealer();
            game.dealRandomCardsToEachPlayer();
            game.selectYouAsPlayer();
            Player humanPlayer = game.getHumanPlayer();

            if(playerView != null){
                remove(playerView);
            }
            playerView = new PlayerView(humanPlayer);
            add(playerView, BorderLayout.CENTER);
            validate();
            repaint();


            System.out.println(first);
        });

        //pressMe.addActionListener(new MyActivateButtno());



}}
