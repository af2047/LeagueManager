package player.model;

/**
 * Clase que representa a un portero.
 * @author Andrés Fernández
 */
public class Goalkeeper extends Player {

    /**
     * Constructor que crea un portero a partir de su nombre y su dorsal.
     * @param name Nombre
     * @param number Dorsal
     */
    public Goalkeeper(String name, int number) {
        super(name, number, "POR");
    }

}