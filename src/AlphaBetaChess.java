import javax.swing.*;
public class AlphaBetaChess {
    public static void main (String[] args){
        int test = 1;
        JFrame f = new JFrame("Chess");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UserInterface ui = new UserInterface();
        f.add(ui);
        f.setSize(500, 500);
        f.setVisible(true);

    }

}
