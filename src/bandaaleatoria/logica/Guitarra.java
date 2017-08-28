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
public class Guitarra extends Instrumento{

    @Override
    public void dibujar(Graphics g) {
        System.out.println("Dibujando la guitarra");
        Image img = new ImageIcon(this.getClass().getResource("../imagenes/guitarra.png")) .getImage();
        g.drawImage(img, 0, 0, null);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra");
    }
    
}
