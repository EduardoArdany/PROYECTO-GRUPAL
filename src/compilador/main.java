/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package compilador;
import pckControlador.menuControladores;
import pckModelos.ModelAgregar;
import pckVistas.Equipos;
import pckVistas.Entrega;
import pckVistas.Interfaz;
import pckVistas.Propietarios;
import pckVistas.Reparacion;


public class main {

    public static void main(String[] args) {
     
        Interfaz VistaMenu = new Interfaz();
        Equipos VistaEquipos = new Equipos();
        Entrega VistaEntrega = new Entrega();
        Propietarios VistaPropietarios = new Propietarios();
        Reparacion VistaReparacion = new Reparacion();
        ModelAgregar AgregarModel = new ModelAgregar();
        menuControladores controladorU = new menuControladores(VistaMenu,VistaEquipos, VistaEntrega, VistaPropietarios, VistaReparacion, AgregarModel);
 
    }
}
