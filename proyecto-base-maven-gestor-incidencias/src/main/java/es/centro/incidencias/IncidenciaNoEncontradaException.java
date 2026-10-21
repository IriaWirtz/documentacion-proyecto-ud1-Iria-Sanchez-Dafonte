package es.centro.incidencias;

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
