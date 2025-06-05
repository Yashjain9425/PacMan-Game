import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();                         //creates a frame
        int rowCount = 19;
        int colCount = 19;
        int tileSize = 32;
        int boardWidth = colCount * tileSize;
        int boardHeight = rowCount * tileSize;
        frame.setSize(boardWidth, boardHeight);              //sets the x-dimensions,and y-dimension of frame
        // frame.setVisible(true);                              //makes the frame visible
        frame.setTitle("PacMan");                            //sets the title of the frame
        frame.setLocationRelativeTo(null);                   //centers the frame on the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sets the default close operation to exit the application when the frame is closed
        frame.setResizable(false);                           //prevents the frame from being resized
        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();                                    //packs the frame to fit the preferred size of its components
        frame.setVisible(true);                             //makes the frame visible
    }
}
