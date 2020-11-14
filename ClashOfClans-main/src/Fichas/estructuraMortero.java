/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fichas;

/**
 *
 * @author PERSONAL
 */
public class estructuraMortero extends Estructuras {

    
    public estructuraMortero(Guerreros Objetivo, String Nombre, int Damage, int nivelAparicion, boolean tipoGuerrero) {
        super(Objetivo, Nombre, Damage, nivelAparicion, tipoGuerrero);
        Rango = 50;
    }
    
    
    
    
    public boolean verificarObjetivo(Guerreros Objetivo){

      return Objetivo.getClass() != guerrerosAereos.class;   
    }
    
    
}
