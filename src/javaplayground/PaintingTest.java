/**
 * PaintingTest.java
 *
 * ©2017 Zebrilus
 */

package javaplayground;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class PaintingTest extends JComponent {

    public PaintingTest() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        g.drawLine(0, 0, getWidth(), getHeight());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chessboard Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());        
        frame.add(new PaintingTest(), BorderLayout.CENTER);
    }
    
}
