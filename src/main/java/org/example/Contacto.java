package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto con un nombre y una lista de números de teléfono.
 */
public class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Constructor que inicializa un contacto con un nombre y un número de teléfono.
     *
     * @param name  Nombre del contacto.
     * @param phone Número de teléfono inicial del contacto.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return Nombre del contacto.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la lista de números de teléfono del contacto.
     *
     * @return Lista de números de teléfono.
     */
    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
