/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armario;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author laura
 */
public class Armario {
    private Vestimenta[] camisetas;
    private Vestimenta[] pantalones;
    private Vestimenta[] zapatos;
    private Vestimenta camisetaSeleccionada;
    private Vestimenta pantalonSeleccionado;
    private Vestimenta zapatosSeleccionados;
    private Random random;

    public Armario() {


    camisetas = new Vestimenta[]{
            new Camiseta("Baby tee", "negro"),
            new Camiseta("Deportiva", "Rojo"),
            new Camiseta("Crop top", "blanco")
        };
        pantalones = new Vestimenta[]{
            new Pantalon("Falda tableada", "blanco"),
            new Pantalon("Cargo", "negro"),
            new Pantalon("Jean", "Azul oscuro")
        };
        zapatos = new Vestimenta[]{
            new Zapatos("Botas", "negro"),
            new Zapatos("Deportivo", "Blanco"),
            new Zapatos("Casuales", "Blanco")
        };

        random = new Random();
    }

    public void seleccionarCamiseta() {
        System.out.println("Elige una camiseta: ");
        mostrarOpciones(camisetas);
        int opcion = new Scanner(System.in).nextInt() - 1;
        camisetaSeleccionada = camisetas[opcion];
    }

    public void seleccionarPantalon() {
        System.out.println("Elige un pantalon: ");
        mostrarOpciones(pantalones);
        int opcion = new Scanner(System.in).nextInt() - 1;
        pantalonSeleccionado = pantalones[opcion];
    }

    public void seleccionarZapatos() {
        System.out.println("Elige unos zapatos: ");
        mostrarOpciones(zapatos);
        int opcion = new Scanner(System.in).nextInt() - 1;
        zapatosSeleccionados = zapatos[opcion];
    }

    public void seleccionarAleatorio() {
        camisetaSeleccionada = camisetas[random.nextInt(camisetas.length)];
        pantalonSeleccionado = pantalones[random.nextInt(pantalones.length)];
        zapatosSeleccionados = zapatos[random.nextInt(zapatos.length)];
        System.out.println("Ropa seleccionada aleatoriamente.");
    }

    public void mostrarSeleccion() {
        System.out.println("\nTu seleccion final es:");
        mostrarRopa(camisetaSeleccionada, "No has seleccionado una camiseta.");
        mostrarRopa(pantalonSeleccionado, "No has seleccionado un pantalon.");
        mostrarRopa(zapatosSeleccionados, "No has seleccionado unos zapatos.");
    }

    private void mostrarOpciones(Vestimenta[] ropa) {
        for (int i = 0; i < ropa.length; i++) {
            System.out.println((i + 1) + ". " + ropa[i].getEstilo() + " " + ropa[i].getColor());
        }
    }

    private void mostrarRopa(Vestimenta ropa, String mensaje) {
        if (ropa != null) {
            ropa.mostrarInfo();
        } else {
            System.out.println(mensaje);
        }
    }
    
}
