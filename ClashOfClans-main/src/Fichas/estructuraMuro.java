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
public class estructuraMuro extends Estructuras {

    public estructuraMuro(Guerreros Objetivo, String Nombre, int nivelAparicion, boolean tipoGuerrero) {
        super(Objetivo, Nombre, 0, nivelAparicion, tipoGuerrero);
        Rango = 0;
    }
     
    
    public boolean verificarObjetivo(Guerreros Objetivo){

    return true;  //No hace daño   
    }
    
}
