/**
 * ChessBoardTest.java
 *
 * ©2017 
 */

package javaplayground;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class ChessBoardTest extends JComponent {

    public ChessBoardTest() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        g.drawLine(0, 0, getWidth(), getHeight());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chessboard Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
