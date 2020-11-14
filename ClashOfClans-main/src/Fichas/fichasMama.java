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
public abstract class fichasMama {
    
    public String Nombre;
    public int Damage;
    public int Rango;
    public int nivelAparicion;
    public boolean tipoGuerrero;
    public Guerreros Objetivo;
    
    public fichasMama(String Nombre, int Damage, int nivelAparicion, boolean tipoGuerrero) {
        this.Nombre = Nombre;
        this.Damage = Damage;
        this.nivelAparicion = nivelAparicion;
        this.tipoGuerrero = tipoGuerrero;
    }
    
    public void Atacar(){
        Objetivo.Vida = Objetivo.Vida - Damage;
    }
 
    
}
