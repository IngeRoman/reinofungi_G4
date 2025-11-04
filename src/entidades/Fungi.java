package entidades;

public class Fungi {
    protected String nombreCientifico;
    protected String tipoReproduccion;
    protected String habitat;
    protected boolean esToxico;

    public Fungi(String nombreCientifico, String tipoReproduccion, String habitat, boolean esToxico) {
        this.nombreCientifico = nombreCientifico;
        this.tipoReproduccion = tipoReproduccion;
        this.habitat = habitat;
        this.esToxico = esToxico;
    }

    public void reproducirse() {
        System.out.println(nombreCientifico + " se está reproduciendo por " + tipoReproduccion);
    }

    public void alimentarse() {
        System.out.println(nombreCientifico + " absorbe nutrientes de su entorno.");
    }

    public void mostrarInfo() {
        System.out.println("Hongo: " + nombreCientifico + " | Habitat: " + habitat + " | Tóxico: " + esToxico);
    }
}
