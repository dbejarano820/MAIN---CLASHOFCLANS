/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fichas;

import java.io.Serializable;

/**
 *
 * @author PERSONAL
 */
public class guerrerosHeroes extends Guerreros implements Movimiento, Ruido, Serializable {

    public guerrerosHeroes(int Vida, int Campos, String Nombre, int Damage, int nivelAparicion, boolean tipoGuerrero) {
        super(Vida, Campos, Nombre, Damage, nivelAparicion, tipoGuerrero);
        Rango = 10;
    }
    
    
    
}
