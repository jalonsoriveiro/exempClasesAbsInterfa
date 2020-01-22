/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

import exempclasesabstractas.Poligonos;

/**
 *
 * @author jalonsoriveiro
 */
public class CIrculo extends Poligonos{
    private float radio;

    public CIrculo(float radio) {
        this.radio = radio;
    }
        
    

    @Override
    public void calcularArea() {
        System.out.println("Area ciculo "+(Math.PI*Math.pow(radio, 2)));
    }
}
