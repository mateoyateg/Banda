/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria.logica;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;

/**
 *
 * @author Estudiantes
 */
public class Bajo extends Instrumento {

    @Override
    public void dibujar(Graphics g, int x, int y) {
        System.out.println("Dibujando el bajo");
        Image img = new ImageIcon(this.getClass().getResource("../imagenes/bajo.png")) .getImage();
        g.drawImage(img, x, y, null);
    }

    @Override
    public void tocar() {
        AudioInputStream sound = null;
        try {
            File soundFile = new File(this.getClass().getResource("../sonidos/bajo.wav").toURI());

            sound = AudioSystem.getAudioInputStream(soundFile);
            // load the sound into memory (a Clip)
            DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
            Clip clip;

            clip = (Clip) AudioSystem.getLine(info);

            clip.open(sound);
            // play the sound clip
            clip.start();
        } 
        
        catch (Exception ex) {
        ex.printStackTrace();
        } 
        
        finally {
            try {
                sound.close();
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
    
}
