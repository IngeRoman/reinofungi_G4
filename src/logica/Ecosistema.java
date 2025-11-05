package logica;

import entidades.*;
import java.util.ArrayList;
import java.util.List;

public class Ecosistema {
    private List<Fungi> hongos = new ArrayList<>();
    private List<AnimalConsumidor> animales = new ArrayList<>();
    private List<PlantaAsociada> plantas = new ArrayList<>();
    private Micologo micologo;

    public Ecosistema(Micologo micologo) {
        this.micologo = micologo;
    }

    public void agregarHongo(Fungi h) { hongos.add(h); }
    public void agregarAnimal(AnimalConsumidor a) { animales.add(a); }
    public void agregarPlanta(PlantaAsociada p) { plantas.add(p); }

    public void mostrarEcosistema() {
        System.out.println("=== ECOSISTEMA ===");
        micologo.mostrarInfo();
        hongos.forEach(Fungi::mostrarInfo);
        animales.forEach(AnimalConsumidor::mostrarInfo);
        plantas.forEach(PlantaAsociada::mostrarInfo);
    }

    public void simularInteraccion() {
        System.out.println("\nSimulacion de interacciones:");
        if (!hongos.isEmpty() && !animales.isEmpty()) {
            animales.get(0).comer(hongos.get(0));
        }
        if (!hongos.isEmpty() && !plantas.isEmpty()) {
            plantas.get(0).formarMicorriza(hongos.get(0));
        }
        micologo.estudiarHongo(hongos.get(0));
    }
}
