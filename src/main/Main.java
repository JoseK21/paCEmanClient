package main;

import com.ce.paceman.PacmanGame;
import com.ce.paceman.connection.Controller;
import com.ce.paceman.connection.SocketCliente;
import com.ce.paceman.infra.Display;
import com.ce.paceman.infra.Game;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.util.Observable;

public class Main {

    public static void main(String[] args) {

        new Controller("172.18.62.180",8888);
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Game game = new PacmanGame();
                Display view = new Display(game);
                JFrame frame = new JFrame();
                frame.setTitle("PaCEman");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(view);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                view.requestFocus();
                view.start();
            }

        });
    }
    
}
