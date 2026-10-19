package es.centro.incidencias;

import java.util.Locale;

/**
 * Representa la plantilla de una incidencia
 * @version 1.0
 * @since 1.0
 */


public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;

    /**
     *Crea una incidencia
     *
     * @param id identificador positivo y único
     * @param titulo título descriptivo
     * @param prioridad nivel de prioridad textual
     * @param abierta si la incidencia esta abierta o cerrada
     */


    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    public String getId() {
        return id;
    }
    /**
     * Devuelve el id del objeto
    * @return id
    * */

    public String getTitulo() {
        return titulo;
    }
    /**
     * Devuelve el titulo del objeto
     * @return titulo
     * */

    public String getPrioridad() {
        return prioridad;
    }
    /**
     * Devuelve la prioridad del objeto
     * @return prioridad
     * */

    public boolean isAbierta() {
        return abierta;
    }
    /**
     * Devuelve si el @param abierta del objeto es true o false
     * @return true o false
     * */

    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }
    /**
     * Devuelve true o false dependiendo de si el @param texto coincide con algun atributo de la clase
    * */

}
