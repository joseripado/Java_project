package mascotas;

import zoo.Animales;

public class Gato extends Animales {
    private String color;

    public Gato(String nombre, String especie, int edad, String color) {
        super(nombre, especie, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void maullar() {
        System.out.println(getNombre() + " está maullando.");
    }
}