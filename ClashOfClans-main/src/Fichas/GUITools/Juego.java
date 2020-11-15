/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fichas.GUITools;

import java.util.ArrayList;
import Fichas.*;
import GUI.tableroPrincipal;


/**
 *
 * @author PERSONAL
 */
public class Juego {
    public tableroPrincipal refTablero;
    public ArrayList<Hilo> guerreros;
    public ArrayList<Guerreros> guerrerosTmp;
    public ArrayList<Hilo> enemigos;
    public ArrayList<Hilo> estructuras;

    public Juego(tableroPrincipal refTablero) {
        this.refTablero = refTablero;
        guerreros = new ArrayList<Hilo>();
        enemigos = new ArrayList<Hilo>();
        estructuras = new ArrayList<Hilo>();
    }
    public void generarGuerreros(){
        guerreros.add(new Hilo(new Guerreros(8,8,"Daniel",8,8,true))); 
    }
    public void generarEnemigos(){
        enemigos.add(new Hilo(new Guerreros(8,8,"Daniel",8,8,true))); 
    }
 
   \
    public void startGuerreros(){
        for (int i = 0; i < guerreros.size(); i++) {
            guerreros.get(i).start();
        }
        
        for (int i = 0; i < enemigos.size(); i++) {
            enemigos.get(i).start();
        }
        
        for (int i = 0; i < estructuras.size(); i++){
            estructuras.
        }
    }
    
    public void pauseGuerreros(){
        for (int i = 0; i < guerreros.size(); i++) {
            guerreros.get(i).setPause();
        }
    }
    
    public void stopGuerreros(){
        for (int i = 0; i < guerreros.size(); i++) {
            guerreros.get(i).stopThread();
        }
    }

    HiloPrincipal getMyEnemy(HiloPrincipal hilo) {
        int aleatorio = (new Random()).nextInt(guerreros.size());
        //  buscar un enemigo el mas cercado. recorra el arreglo de enemigos buscan el mas cercano
        /*for (int i = 0; i < guerreros.size(); i++) {
            HiloPrincipal get = guerreros.get(i);    
        }*/
        
        return guerreros.get(aleatorio);
 
        
    }    
    
}
