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
public class Musico {
    Instrumento instrumento;

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
    
    
    
    public void tocarInstrumento(){
        this.instrumento.tocar();
    }
    
    public void presentarInstrumento(Graphics g, int x, int y){
        this.instrumento.dibujar(g, x, y);
    }
    
}
