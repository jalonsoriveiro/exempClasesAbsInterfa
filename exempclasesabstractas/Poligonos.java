/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempclasesabstractas;

import java.awt.Color;

/**
 *
 * @author jalonsoriveiro
 */
public abstract class Poligonos implements Ipoligono {
    
    private Color colorRecheo;
    
    
    @Override
    public abstract void calcularArea();

    
}

