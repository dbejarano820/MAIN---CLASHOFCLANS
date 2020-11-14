/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import Fichas.*;


/**
 *
 * @author PERSONAL
 */
public class Juego {
    public tableroPrincipal refFrame;
    public ArrayList<Hilo> guerreros;
    public ArrayList<Hilo> enemigos;
    public ArrayList<Hilo> estructuras;

    public Juego(tableroPrincipal refFrame) {
        this.refFrame = refFrame;
    }
    public void GenerarGuerreros(){
        guerreros.add(new Hilo(new Guerreros(8,8,"Daniel",8,8,true))); 
    }
    public void GenerarEnemigos(){
        guerreros.add(new Hilo(new Guerreros(8,8,"Daniel",8,8,true))); 
    }
}
