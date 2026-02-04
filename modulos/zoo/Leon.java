package zoo;

public class Leon extends Animales {
    private String habitat;

    public Leon(String nombre, String especie, int edad, String habitat) {
        super(nombre, especie, edad);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void rugir() {
        System.out.println(getNombre() + " está rugiendo!");
    }

}
