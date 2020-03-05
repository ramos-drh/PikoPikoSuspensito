/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gusanito;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author daniel
 */
public class Jugador {

    private String nombre;
    private int puntosAcum;
    private Dado[] dados;
    private ArrayList<Racion> pilaRacion = new ArrayList<>();
    private int tamPila;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void tirarDados() {

        int resultado = 0;
        Random aleatorio = new Random();
        dados = new Dado[8];
        
        for (int i = 0; i < dados.length; i++) {

            if(dados[i].isDisponible()){
            
            dados[i].setCaraSeleccionada(aleatorio.nextInt(6) + 1);
             }
        
      
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosAcum() {
        return puntosAcum;
    }

    public void setPuntosAcum(int puntosAcum) {
        this.puntosAcum = puntosAcum;
    }

    public Dado[] getDados() {
        return dados;
    }

    public void setDados(Dado[] dados) {
        this.dados = dados;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", puntosAcum=" + puntosAcum + ", dados=" + dados + '}';
    }
    
    
    public boolean push(Racion r){
        if(this.tamPila() < this.tamPila){
            pilaRacion.add(r);
            return true;
        }
        return false;
    }
    
    public Racion pop(){        
        return pilaRacion.remove(this.tamPila - 1);                
    }
    
    public int tamPila(){
        return pilaRacion.size();
    }
    
    public boolean vacia(){
        return pilaRacion.isEmpty();
    }

}
