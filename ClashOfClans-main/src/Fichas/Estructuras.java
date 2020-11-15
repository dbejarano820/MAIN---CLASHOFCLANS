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
public class Estructuras extends fichasMama {
    public int Vida;
    
    //apariencia1


    public Estructuras(Guerreros Objetivo, String Imagen, String Nombre, int Damage, int nivelAparicion, boolean tipoGuerrero) {
        super(Imagen, Nombre, Damage, nivelAparicion, tipoGuerrero);
        this.Objetivo = Objetivo;
        this.Vida = 1;
    }
    
    
    
}
