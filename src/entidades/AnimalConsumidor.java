package entidades;

public class AnimalConsumidor {
    private String especie;
    private String tipoAlimentacion;
    private boolean esHerbivoro;

    public AnimalConsumidor(String especie, String tipoAlimentacion, boolean esHerbivoro) {
        this.especie = especie;
        this.tipoAlimentacion = tipoAlimentacion;
        this.esHerbivoro = esHerbivoro;
    }

    public void comer(Fungi hongo) {
        if (hongo != null && !hongo.esToxico) {
            System.out.println(especie + " se alimenta de " + hongo.nombreCientifico);
        } else {
            System.out.println(especie + " evita comer este hongo por ser toxico.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Animal: " + especie + " | Alimentacion: " + tipoAlimentacion);
    }
}
