/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class OperacionTelevisor {
    private ArrayList<Televisor> lista;
    private double masCaro;
    private double totalPrecio;
    private String marcas = "";
    
    public OperacionTelevisor(ArrayList<Televisor> t){
        lista = t;
    }
    
    public void establecerTotalPrecioTvs(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalPrecio += lista.get(i).obtenerPrecio();
        }
    }
    
    public void establecerTelevisorMasCaro(){
        masCaro = lista.get(0).obtenerPrecio();
        for (int i = 0; i < lista.size(); i++) {
           if(lista.get(i).obtenerPrecio()> masCaro ){
               masCaro = lista.get(i).obtenerPrecio();
           }
        }
    }
    
    public void establecerListaMarcasVendidas(){
        for (int i = 0; i < lista.size(); i++) {
           marcas = String.format("%s%s\n",marcas, lista.get(i).obtenerMarca());
        }
    }
    
    public ArrayList<Televisor> obtenerLista() {
        return lista;
    }

    public double obtenerMasCaro() {
        return masCaro;
    }

    public double obtenerTotalPrecio() {
        return totalPrecio;
    }

    public String obtenerMarcas() {
        return marcas;
    }

    @Override
    public String toString(){
        String cadena = "";
        for (int i = 0; i < lista.size(); i++) {
           cadena = String.format("%s%s", cadena, lista.get(i));
        }
        
        cadena = String.format("%sLista de Marcas\n%s\nTelevisor Mas Caro: %.2f\n"
                + "Total de precios: %.2f",
                cadena,
                obtenerMarcas(),
                obtenerMasCaro(),
                obtenerTotalPrecio());
        
        return cadena;
    }
}
