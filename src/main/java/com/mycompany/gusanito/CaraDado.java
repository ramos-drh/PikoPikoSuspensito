/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gusanito;

import javax.swing.ImageIcon;

/**
 *
 * @author juan
 */
public enum CaraDado {
    CARA_1(1,1,"res/dado1.png"),
    CARA_2(2,2,"res/dado2.png"),
    CARA_3(3,3,"res/dado3.png"),
    CARA_4(4,4,"res/dado4.png"),
    CARA_5(5,5,"res/dado5.png"),
    CARA_6(6,5,"res/dadoGusano.png");
    
    private int numero;
    private int valor;
    private ImageIcon icono;

    private CaraDado(int numero, int valor, String icono) {
        this.numero = numero;
        this.valor = valor;
        this.icono = new ImageIcon(icono);
    }


    public int getNumero() {
        return numero;
    }

    public int getValor() {
        return valor;
    }

    public ImageIcon getArchivo() {
        return icono;
    }
}
