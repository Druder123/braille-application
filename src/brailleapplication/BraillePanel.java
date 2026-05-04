package brailleapplication;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abdir
 */
public class BraillePanel extends JPanel {
    private ArrayList<String> patrones = new ArrayList();

    public void setPatrones(ArrayList<String> patrones) {
        this.patrones = patrones;
        this.repaint();
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        int x = 20;
        int y = 20;
        for (String patron: patrones) {
            dibujarCelda(g2d, patron, x, y);
            x += 45;
        }
    }
    
    private void dibujarCelda(Graphics2D g2d, String patron, int xBase, int yBase) {
        int diametro = 12;
        int espacio = 18;
        int dif = espacio - diametro;
        
        int sizeXCasilla = diametro*2+dif*2;
        int sizeYCasilla = diametro*3+dif*3;
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawRect(xBase-(dif/2), yBase-(dif/2), sizeXCasilla, sizeYCasilla);
        
        for(int i = 0; i < 6; i++) {
            int col = i%2;
            int fila = i/2;
            int x = xBase + (col * espacio);
            int y = yBase + (fila * espacio);
            
            if(patron.charAt(i) == '1') {
                g2d.setColor(Color.BLACK);
                g2d.fillOval(x, y, diametro, diametro);
            } else {
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.drawOval(x, y, diametro, diametro);
            }
        }
        
    }
}
