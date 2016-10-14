/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEstrella;

public class Nodo {
    private int[][] elemento = new int[3][3];
    private int valorH;
    
    // Constructor
    public Nodo(int[][] e){
        setElemento(e);
        valorH = calcularValorH(e);
    }
    
    // Este método asigna un valor al elemento del nodo
    public void setElemento(int[][] e){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               elemento[i][j] = e[i][j]; 
            }
        }
    }
    
    // Este método regresa el elemento/matriz del nodo
    public int[][] getElemento(){
        return elemento;
    }
    
    // Este método asigna el valor Heurístico del nodo
    public void setValorH(int v){
        valorH = v;
    }
    
    // Este método regresa el valor Heurístico del nodo
    public int getValorH(){
        return valorH;
    }
    
    // Este método calcula el Valor Heurístico del nodo
    private int calcularValorH(int[][] m){
        int valor = 0;
        return valor;
    }
    
    // Este método regresa en forma de String el elemento del nodo (la matriz)
    public String toString(){
        String cadena="{";
        for(int i=0; i<3; i++){
            cadena+=" {";
            for(int j=0; j<3; j++){
                if(j==2)
                    cadena+=""+elemento[i][j];
                else
                    cadena+=""+elemento[i][j]+",";
            }
            if(i==2)
                cadena+="}";
            else
                cadena+="},";
        }
        cadena+=" }";
        return cadena;
    }
}