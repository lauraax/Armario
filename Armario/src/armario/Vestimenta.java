/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armario;

/**
 *
 * @author laura
 */
public abstract class Vestimenta implements CaracteristicaPrenda{
    private String estilo;
    private String color;

    public Vestimenta(String estilo, String color) {
        this.estilo = estilo;
        this.color = color;
    }

    @Override
    public String getEstilo() {
        return estilo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(getClass().getSimpleName() + ": " + estilo + " de color " + color);
    }
}
