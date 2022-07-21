/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> lista = new ArrayList<>();

    public void establecerLista(ArrayList<Matricula> c) {
        lista = c;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (Matricula c: lista) {
            suma += c.obtenerTarifa();
        }
        promedioMatriculas = suma/lista.size();
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }
    @Override
    public String toString(){
        String cadena = "";
        for (Matricula c: lista) {
            cadena = String.format("%s%s", cadena, c);
        }
        cadena = String.format("%sPromedio Tarifas: $ %.2f", cadena,obtenerPromedioTarifas());
        return cadena;
    }
}
