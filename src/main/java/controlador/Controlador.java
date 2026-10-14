/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Agenda;
import modelo.Contacto;

public class Controlador {

    private Agenda agenda;

    public Controlador() {
        this.agenda = new Agenda();
    }

    public void guardarContacto(String nombre, String telefono) {
        Contacto nuevoContacto = new Contacto(nombre, telefono);
        agenda.guardarContacto(nuevoContacto);
    }
    
    public String buscarTelefono(String nombre) {
        return agenda.buscarTelefono(nombre);
    }
}