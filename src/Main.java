import entidades.*;
import logica.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("      Escuela Politecnica Nacional");
        System.out.println("      Proyecto: Reino Fungi");
        System.out.println("Grupo: 4");
        System.out.println("Integrantes:");
        System.out.println("-Jhoan Patricio Sasnalema De La Cruz\n");
        System.out.println("-Deyvid Leonardo Roman Marcillo\n");
        System.out.println("==========================================\n\n\n");





        Micologo micologo = new Micologo("Dr. Fungal", 10);

        Fungi seta = new HongoSeta("Agaricus bisporus", "sexual", "bosque humedo", false, 5.5, "marron");
        Fungi levadura = new Levadura("Saccharomyces cerevisiae", "asexual", "ambiente humedo", false, "alcoholica", true);
        Fungi moho = new Moho("Penicillium", "asexual", "materia organica", false, "verde", "frutas");

        AnimalConsumidor ardilla = new AnimalConsumidor("Ardilla", "omnivora", true);
        PlantaAsociada roble = new PlantaAsociada("Roble", "micorrizica");

        Ecosistema ecosistema = new Ecosistema(micologo);
        ecosistema.agregarHongo(seta);
        ecosistema.agregarHongo(levadura);
        ecosistema.agregarHongo(moho);
        ecosistema.agregarAnimal(ardilla);
        ecosistema.agregarPlanta(roble);

        ecosistema.mostrarEcosistema();
        ecosistema.simularInteraccion();
    }
}
