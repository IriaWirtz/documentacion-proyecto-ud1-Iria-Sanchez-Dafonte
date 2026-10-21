package es.centro.incidencias;

import java.util.List;

/**
 * Representa la plantilla de un gestor de incidencias
 * @version 1.0
 * @since 1.0
 */

public final class GestorIncidencias {

    private final List<Incidencia> incidencias;



    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     *Devuelve la lista entera de incidencias
     * @return incidencias
     */
    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     *Devuelve la lista entera de incidencias que esten abiertas
     * @return incidencias abiertas
     */
    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }
    /**
     *Devuelve la lista entera de incidencias que coincidan con el String introducido
     * @param texto texto que se va a comparar
     * @return incidencias que coincidan con texto
     */
    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }
    /**
     *Devuelve la incidencia que coincida con el id introducido, si no la encuentra tira excepción
     * @throws IncidenciaNoEncontradaException si no encuentra el id
     * @param id el id que se va a comparar
     * @return incidencia con id igual al String
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }

    /**
     * Devuelve una incidencia que coincida con el id
     * @param id el valor a comparar
     * @return incidencia la incidencia cuyo id coincida con la busqueda
     * @deprecated El catch nunca salta y llama a un método que hace lo mismo y ya tira la excepcion antes de que este lo haga
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}
