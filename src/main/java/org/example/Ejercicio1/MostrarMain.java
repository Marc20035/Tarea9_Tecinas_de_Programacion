package org.example.Ejercicio1;
import java.time.LocalDate;

public class MostrarMain {

    public void mostrarLista(){
        TablaCiclos tablaCiclos = new TablaCiclos();
        Ciclos Segway1 = new Segway("Segway", "Ninebot One E+", LocalDate.of(2020, 10, 10), 18.90, 30, 1.80);
        Ciclos Segway = new Segway("Segway", "Ninebot One E+", LocalDate.of(2020, 10, 10), 18.90, 30, 1.80);
        Ciclos giroscopio = new Giroscopio("Giroscopio", "Weebot Echo", LocalDate.of(2020, 10, 10), 9.90, 35);
        Ciclos segway2 = new Segway("Segway", "Immotion v8", LocalDate.of(2020, 10, 10), 18.90, 40, 1.80);
        Ciclos bicicleta = new Bicicleta("Lapierre", "Speed 400", LocalDate.of(2020, 10, 10), 4.90, 27, 10);
        Ciclos bicicleta2 = new Bicicleta("Btwin", "Riverside 900", LocalDate.of(2020, 10, 10), 4.90, 10, 10);
        tablaCiclos.agregarCiclo(bicicleta);
        tablaCiclos.agregarCiclo(bicicleta2);
        tablaCiclos.agregarCiclo(segway2);
        tablaCiclos.agregarCiclo(Segway1);
        tablaCiclos.agregarCiclo(Segway);
        tablaCiclos.agregarCiclo(giroscopio);
        tablaCiclos.mostrarCiclosDisponibles();
    }



}
