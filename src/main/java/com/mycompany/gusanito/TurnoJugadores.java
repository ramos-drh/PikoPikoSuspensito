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
 * @author ramos
 */
public class TurnoJugadores {
    private ArrayList<Jugador> arrayJugadores;
    private int turno;
    
    public TurnoJugadores(ArrayList<Jugador> jugadores){
        Random aleatorio = new Random();
        arrayJugadores = jugadores;
        turno = aleatorio.nextInt(jugadores.size());
    }
    
    //Devuelve el jugador que tiene el turno actual
    public Jugador getTurnoJugador(){
        return arrayJugadores.get(turno);
    }
    
    //Debe devolver el array de jugadores
    public ArrayList<Jugador> getTodosJugadores(){
        return arrayJugadores;
    }
    
    //Pasa el turno al siguiente jugador
    public void pasarSiguiente(){
        //De nuevo necesito var nJugadores
        //Ej 4 jug: si turno < 3 [0, 1, 2] => turno++
        //Ej 2 jug: si turno < 1 [0] => turno++
        if(turno < arrayJugadores.size()-1){
            turno++;
        } else{
            turno = 0;
        }
    }

    //Entiendo que no hace falta porque ya está el método getTodos
    public ArrayList<Jugador> getArrayJugadores() {
        return arrayJugadores;
    }

    //Quizás no haga falta
    public void setArrayJugadores(ArrayList<Jugador> arrayJugadores) {
        this.arrayJugadores = arrayJugadores;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
//    public static void main(String[] args) {
//        ArrayList<Jugador> lista1 = new ArrayList<>();
//        lista1.add(new Jugador("Jug1"));
//        lista1.add(new Jugador("Jug2"));
//        lista1.add(new Jugador("Jug3"));
//        
//        TurnoJugadores t1 = new TurnoJugadores(lista1);
//        
//        System.out.println(t1.getTurnoJugador().getNombre());
//        t1.pasarSiguiente();
//        
//        System.out.println(t1.getTurnoJugador().getNombre());
//        t1.pasarSiguiente();
//    }
    
}
