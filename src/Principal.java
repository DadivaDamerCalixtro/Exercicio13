/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class Principal {
    public static void main(String [] args){
        Circulo cir = new Circulo ();
        cir.comunicar();
        
        Quadrado quad = new Quadrado ();
        quad.comunicar();
        
        Triangulo tri = new Triangulo ();
        tri.comunicar();
        
        FiguraEquilatera FE = new FiguraEquilatera();
        FE.comunicar();
    }
}
