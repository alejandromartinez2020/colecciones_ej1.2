/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej1_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Alfa
 */
public class ColeccionesEj1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razaPerros = new ArrayList<>();
        String raza;
        String rta;
        String razaElim;
        do {
            System.out.println("Ingrese raza de Perro: ");
            raza = leer.next();
            razaPerros.add(raza);
            System.out.println("Agregar otro perro, si/no ");
            rta = leer.next();
        } while ("si".equalsIgnoreCase(rta));
        System.out.println(" RAZAS ");
        System.out.println("");
        
        for(String lista : razaPerros){
            System.out.println(lista);
        }
        System.out.println(" TOTAL PERROS: " + razaPerros.size());
        System.out.println("INGRESE LA RAZA QUE NO DEBE ESTAR EN LA LISTA");
        razaElim = leer.next();
        Iterator<String> mi_iterator = razaPerros.iterator();
        while(mi_iterator.hasNext()){
            String it = mi_iterator.next();
            if (it.equals(razaElim)){
                mi_iterator.remove();
                System.out.println(razaPerros);
            }
        }
    }
    
}
