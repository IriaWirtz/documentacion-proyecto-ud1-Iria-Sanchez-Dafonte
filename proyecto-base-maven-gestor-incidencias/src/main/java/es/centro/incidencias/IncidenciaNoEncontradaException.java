package es.centro.incidencias;

/**
 * Representa la clase que captura excepiones cuando los metodos no encuentran la busqueda y devuelve un mensaje
 * @version 1.0.0
 * @since 1.0.0
 */
public class IncidenciaNoEncontradaException extends Exception {
    /**
     * Lo que devuelve si sale error en alguna clase al buscar por id
     * @param id el valor a comparar
     * Devuelve un String indicando el error
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
