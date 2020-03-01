/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gusanito;

import java.util.ArrayList;

/**
 *
 * @author ramos
 */
public class TurnoJugadores {
    //Esta lista no es de Strings, es de Jugadores pero Jugador no está implementado
    private ArrayList<String> arrayJugadores;
    private int turno;
    
    public TurnoJugadores(int nJugadores){
        arrayJugadores = new ArrayList<String>(nJugadores-1);
        turno = 0;
    }
    
    //Devuelve el jugador que tiene el turno actual
    public String getTurnoJugador(){
        return arrayJugadores.get(turno);
    }
    
    //No estoy seguro de lo que hace
    public String getTodosJugadores(){
        String infoJugadores = "";
        for(int i = 0; i < arrayJugadores.size(); i++){
           infoJugadores = infoJugadores + arrayJugadores.get(i).toString() + "\n";
        }
        return infoJugadores;
    }
    
    //Pasa el turno al siguiente jugador
    public void pasarSiguiente(){
        //De nuevo necesito var nJugadores
        //Ej 4 jug: si turno < 3 [0, 1, 2] => turno++
        //Ej 2 jug: si turno < 1 [0] => turno++
        if(turno < arrayJugadores.size()){
            turno++;
        } else{
            turno = 0;
        }
    }

    public ArrayList<String> getArrayJugadores() {
        return arrayJugadores;
    }

    //Quizás no haga falta
    public void setArrayJugadores(ArrayList<String> arrayJugadores) {
        this.arrayJugadores = arrayJugadores;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
}
