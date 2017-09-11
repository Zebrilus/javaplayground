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
import javax.swing.SwingUtilities;

public final class PaintingTest extends JComponent {
          
    
    private int oldWidth, oldHeight = -1;
    private int sqWidth;
    
    
    public PaintingTest() {        
        // TODO Auto-generated constructor stub
    }
    
    /** 
     * Precalculate for drawing
     */
    private void calculate() {
        int w = getWidth();
        int h = getHeight();
        if (oldWidth != w || oldHeight != h) {
            oldWidth = w;
            oldHeight = h;
            
        }
    }
    
    
    @Override
    public void setBounds(int x, int y, int width, int height) {
        // TODO Auto-generated method stub
        super.setBounds(x, y, width, height);
    }
       
    
    @Override
    protected void paintComponent(Graphics g) {
        g.drawLine(0, 0, getWidth()/2, getHeight()/2);
        //g.fillRoundRect(x, y, width/2, height/2, arcWidth, arcHeight);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Painting Test");
        frame.setBounds(10, 10, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());        
        frame.add(new PaintingTest(), BorderLayout.CENTER);
        SwingUtilities.invokeLater(new Runnable(){
        public void run() {
            frame.show();
        }}
        );
    }
    
}
