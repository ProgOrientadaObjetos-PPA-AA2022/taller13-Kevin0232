/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */
        
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();
        
        DominioGmail dominioG = new DominioGmail();
        dominioG.establecerDominio();
        Correo c = new Correo();
        c.establecerDominio(dominioG);
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();
        lista.add(c);
        
        DominioOutlook dominioO = new DominioOutlook();
        dominioO.establecerDominio();
        Correo c1 = new Correo();
        c1.establecerDominio(dominioO);
        c1.establecerUserName(e.obtenerUserName());
        c1.establecerCorreo();
        lista.add(c1);
        
        DominioYahoo dominioY = new DominioYahoo();
        dominioY.establecerDominio();
        Correo c2 = new Correo();
        c2.establecerDominio(dominioY);
        c2.establecerUserName(e.obtenerUserName());
        c2.establecerCorreo();
        lista.add(c2);
        
        DominioUtpl dominioU = new DominioUtpl();
        dominioU.establecerDominio();
        Correo c3 = new Correo();
        c3.establecerDominio(dominioU);
        c3.establecerUserName(e.obtenerUserName());
        c3.establecerCorreo();
        lista.add(c3);
        
        DominioGobierno dominioGob = new DominioGobierno();
        dominioGob.establecerDominio();
        Correo c4 = new Correo();
        c4.establecerDominio(dominioGob);
        c4.establecerUserName(e.obtenerUserName());
        c4.establecerCorreo();
        lista.add(c4);

        e.establecerCorreos(lista);
        
        System.out.printf("%s\n", e);
              
        
    }
    
}
