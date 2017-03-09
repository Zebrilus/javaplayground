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

    public PaintingTest() {
        
        // TODO Auto-generated constructor stub
    }
    
    
    @Override
    public void setBounds(int x, int y, int width, int height) {
        // TODO Auto-generated method stub
        super.setBounds(x, y, width, height);
    }
    
    @Override
    public void reshape(final int x, final int y, final int w, final int h) {
        int oldWidth = getWidth();
        int oldHeight = getHeight();
        super.reshape(x, y, w, h);
        if (oldWidth != w || oldHeight != h) {
            recalculate();
        }        
    }
    
    /** 
     * Calculate all the Square Positions
     */
    private void recalculate() {
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        g.drawLine(0, 0, getWidth(), getHeight());
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
