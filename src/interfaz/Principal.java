/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import logica.CapturaTeclado;
import logica.EjemploCondicional;
import logica.EjemploCiclo;
/**
 *
 * @author Estudiantes
 */
public class Principal {
    public static void main ( String [] args) {
        System.out.println("Ejemplo de Captura");
        CapturaTeclado ct= new CapturaTeclado();
        ct.operacion();
        System.out.println("Ejemplo de Condicional");
        EjemploCondicional ec= new EjemploCondicional();
        ec.operacion();
        System.out.println("Ejemplo de Ciclos ");
        EjemploCiclo el= new EjemploCiclo();
        el.operacion();
    }
    
}
