/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria.gui;

import bandaaleatoria.logica.Banda;
import bandaaleatoria.logica.Guitarra;
import bandaaleatoria.logica.Instrumento;
import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Lienzo extends Canvas {

    @Override
    public void paint(Graphics g) {
        Banda b = new Banda();
        Random rn = new Random();
        
        int cantidadMusicos = rn.nextInt(15);
        
        b.crearBanda(cantidadMusicos);
        b.presentarBanda(g);
        
    }
    
    
    
}
