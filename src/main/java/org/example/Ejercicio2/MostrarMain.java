package org.example.Ejercicio2;
import java.util.Scanner;
public class MostrarMain {
    public void mostrarDatos(){

                double distancia, tiempo, velocidad;
                String idioma;

                Scanner sc = new Scanner(System.in);

                System.out.println("Seleccione el idioma / Select language:");
                System.out.println("1. Español");
                System.out.println("2. English");
                System.out.print("Opción / Option: ");
                idioma = sc.nextLine();

                Traduccion traduccion;

                if (idioma.equals("1")) {
                    traduccion = new TraductorEspanol();
                } else {
                    traduccion = new TraductorIngles();
                }

                traduccion.introducirDistancia();
                distancia = sc.nextDouble();

                traduccion.introducirTiempo();
                tiempo = sc.nextDouble();


                tiempo = tiempo / 60;


                velocidad = distancia / tiempo;

                traduccion.inicioRespuesta();
                System.out.print(velocidad);
                traduccion.finRespuesta();

    }
}
