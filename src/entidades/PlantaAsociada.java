package entidades;

public class PlantaAsociada {
    private String nombreComun;
    private String tipoRaiz;

    public PlantaAsociada(String nombreComun, String tipoRaiz) {
        this.nombreComun = nombreComun;
        this.tipoRaiz = tipoRaiz;
    }

    public void formarMicorriza(Fungi hongo) {
        System.out.println(nombreComun + " forma micorriza con " + hongo.nombreCientifico);
    }

    public void mostrarInfo() {
        System.out.println("Planta: " + nombreComun + " | Tipo de raiz: " + tipoRaiz);
    }
}
