/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Fichas.*;
import javax.swing.JLabel;
/**
 *
 * @author XT
 */
public class Hilo extends Thread{
    //Atributos de la pantalla
    public tableroPrincipal refPantalla;
    public JLabel refLabel;
    public int numeroLabel;
    //caracteristicas de GUERREROS o ESTRUCTURAS
    public Hilo enemigo;
    String nombre;
    public int damage;
    public int vida;
    public int nivel;
    public int campos;
    public boolean tipo;
    
    
    //image = new Image;
    //image = new Image;
    
    private boolean running = true;
    private boolean pause = false;

    public Hilo(Guerreros guerrero) {
        this.nombre = guerrero.Nombre;
        this.damage = guerrero.Damage;
        this.vida = guerrero.Vida;
        this.nivel = guerrero.nivelAparicion;
        this.campos = guerrero.Campos;
        this.tipo = guerrero.tipoGuerrero;
        
        
    }
    public Hilo(Estructuras estructura) {
        this.nombre = estructura.Nombre;
        this.damage = estructura.Damage;
        this.nivel = estructura.nivelAparicion;
        this.tipo = estructura.tipoGuerrero; 
        
    }
    
    @Override
    public void run(){
        
         while (running){
            
            try {
                if(vida <= 0) break;
                
                
                sleep(500);
                
                
                refPantalla.moveLabel(numeroLabel);
                
                
                
            } catch (InterruptedException ex) {
                
            }
            
            
            //
            while(pause){
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                    
                }
            }
            
        }    
    }
    
    public void stopThread(){
        this.running = false;
    }
    
    public void setPause(){
        this.pause = !this.pause;
    }
    public void setEnemy(Hilo enemigo){
       this.enemigo = enemigo;
    } 
    public void atacar(){
        enemigo.vida = enemigo.vida - damage;   
    }
    
    public Hilo buscarCercano(){
        Hilo cercano = null;
        int x = refLabel.getLocation().x;
        int y = refLabel.getLocation().y;
        int menorY = 1200;
        int menorX = 1200;
        
        for(int i = 0; i < 10; i++ ){
            //recorre la lista que se la pasa
        }
        
        
        return cercano;
    }
    public boolean verificar(Hilo cercano){
        return true;
    }
    
}
