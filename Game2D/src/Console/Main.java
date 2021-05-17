package Console;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();
        obj.setBounds(130, 120, 700, 600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);



        Object[] options = {"Evet,Lütfen",
                "Oyuna Devam Et"};
        Component frame = null;
        int n = JOptionPane.showOptionDialog(frame,
                "Github Adresime Gitmek İster misin?",
                "A Silly Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,     //ikon ayarlar
                options,  //the titles of buttons
                options[0]); //Buton Mesajı
    }
}