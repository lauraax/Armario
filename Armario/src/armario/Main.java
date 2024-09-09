/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package armario;

/**
 *
 * @author laura
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Armario armario = new Armario();
        Menu menu = new Menu(armario);
        menu.mostrarMenu();
    }
    
}
