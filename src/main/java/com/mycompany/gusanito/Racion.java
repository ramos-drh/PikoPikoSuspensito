/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gusanito;

import javax.swing.ImageIcon;

/**
 *
 * @author daniel
 */
public enum Racion {

    RACION_21(21, 1, new ImageIcon()),
    RACION_22(22, 1, new ImageIcon()),
    RACION_23(23, 1, new ImageIcon()),
    RACION_24(24, 1, new ImageIcon()),
    RACION_25(25, 2, new ImageIcon()),
    RACION_26(26, 2, new ImageIcon()),
    RACION_27(27, 2, new ImageIcon()),
    RACION_28(28, 2, new ImageIcon()),
    RACION_29(29, 3, new ImageIcon()),
    RACION_30(30, 3, new ImageIcon()),
    RACION_31(31, 3, new ImageIcon()),
    RACION_32(32, 3, new ImageIcon()),
    RACION_33(33, 4, new ImageIcon()),
    RACION_34(34, 4, new ImageIcon()),
    RACION_35(35, 4, new ImageIcon()),
    RACION_36(36, 4, new ImageIcon());

    private int numRacion;
    private int numGusanos;
    //private boolean disponible  puede que no haga falta
    private ImageIcon imagen;

    private Racion(int numRacion, int numGusanos, ImageIcon imagen) {
        this.numRacion = numRacion;
        this.numGusanos = numGusanos;
        this.imagen = imagen;
    }

    public int getNumRacion() {
        return numRacion;
    }

    public int getNumGusanos() {
        return numGusanos;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

}
