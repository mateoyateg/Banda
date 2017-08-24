/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria.logica;

import java.awt.Graphics;

/**
 *
 * @author Estudiantes
 */
public class Chelo extends Instrumento {

    @Override
    public void dibujar(Graphics g) {
        System.out.println("Dibujando el chelo");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el chelo");
    }
    
}
