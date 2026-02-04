package mascotas;

import zoo.Animales;

public class Perro extends Animales {
    private String raza;

    public Perro(String nombre, String especie, int edad, String raza) {
        super(nombre, especie, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void ladrar() {
        System.out.println(getNombre() + " está ladrando.");
    }

}
