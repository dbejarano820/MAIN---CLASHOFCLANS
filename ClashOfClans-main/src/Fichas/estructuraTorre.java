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
public class estructuraTorre extends Estructuras{

    
    public estructuraTorre(Guerreros Objetivo, String Nombre, int Damage, int nivelAparicion, boolean tipoGuerrero) {
        super(Objetivo, Nombre, Damage, nivelAparicion, tipoGuerrero);
        Rango = 40;
    }  
    
    
    public boolean verificarObjetivo(Guerreros Objetivo){

        return true; //ataca a cualquier tipo de guerrero   
    }    
    
}
