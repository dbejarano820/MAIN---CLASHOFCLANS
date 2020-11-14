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
public class guerrerosAereos extends Guerreros implements Ruido, Crecer, Serializable{

    public guerrerosAereos(int Vida, int Campos, String Nombre, int Damage, int nivelAparicion, boolean tipoGuerrero) {
        super(Vida, Campos, Nombre, Damage, nivelAparicion, tipoGuerrero);
        Rango = 50;
    }

    @Override
    public void Aumentar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
