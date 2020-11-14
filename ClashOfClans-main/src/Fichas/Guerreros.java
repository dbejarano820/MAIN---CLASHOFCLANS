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
public class Guerreros extends fichasMama {
    
    //apariencia1
    //apariencia2
    public int Vida;
    public int Campos;

    public Guerreros(int Vida, int Campos, String Nombre, int Damage, int nivelAparicion, boolean tipoGuerrero) {
        super(Nombre, Damage, nivelAparicion, tipoGuerrero);
        this.Vida = Vida;
        this.Campos = Campos;
    }


    
    
    
    
}
