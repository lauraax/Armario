/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armario;
import java.util.Scanner;
/**
 *
 * @author laura
 */
public class Menu {
    private Armario armario;
    private Scanner scanner;

    public Menu(Armario armario) {
        this.armario = armario;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\nBienvenido al Armario");
            System.out.println("1. Elegir una camiseta");
            System.out.println("2. Elegir un pantalon");
            System.out.println("3. Elegir unos zapatos");
            System.out.println("4. Aleatorio");
            System.out.println("5. Mostrar resultado");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            manejarOpcion(opcion);
        }
    }

    private void manejarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> armario.seleccionarCamiseta();
            case 2 -> armario.seleccionarPantalon();
            case 3 -> armario.seleccionarZapatos();
            case 4 -> armario.seleccionarAleatorio();
            case 5 -> armario.mostrarSeleccion();
            case 6 -> {
                System.out.println("Saliendo del programa");
                scanner.close();
                System.exit(0);
            }
            default -> System.out.println("Opcion no valida. Intentalo de nuevo.");
        }
    }
}
