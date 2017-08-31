/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria.logica;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Estudiantes
 */
public class Chelo extends Instrumento {

    @Override
    public void dibujar(Graphics g, int x, int y) {
        System.out.println("Dibujando el chelo");
        Image img = new ImageIcon(this.getClass().getResource("../imagenes/chelo.png")) .getImage();
        g.drawImage(img, x, y, null);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el chelo");
    }
    
}
