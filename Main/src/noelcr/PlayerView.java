package noelcr;


import javax.swing.*;

public class PlayerView extends JPanel{
    Player player;
    JLabel playerName = new JLabel("not set");
    public PlayerView(Player player){
        this.player = player;

        add(playerName);
    };

}
