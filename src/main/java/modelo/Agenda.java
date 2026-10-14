
package modelo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void guardarContacto(Contacto contacto) {
        contactos.add(contacto);
    }
}