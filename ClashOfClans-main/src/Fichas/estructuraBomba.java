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
public class estructuraBomba extends Estructuras {
    
    public boolean Detonada;

    public estructuraBomba(Guerreros Objetivo, String Nombre, int Damage, int nivelAparicion, boolean tipoGuerrero) {
        super(Objetivo, Nombre, Damage, nivelAparicion, tipoGuerrero);
        Detonada = false;
        Rango = 10;
    }

    
    
    
    public boolean verificarObjetivo(Guerreros Objetivo){
        
       return Objetivo.getClass() != guerrerosAereos.class;   
    }   
    
    @Override
    public void Atacar(){
        if (!Detonada)
             Objetivo.Vida = Objetivo.Vida - Damage;
    }
    
}
