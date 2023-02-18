/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckModelos;

import java.util.ArrayList;


public class ModelAgregar {

    public ArrayList<EquiposModel>ListaEquipos = new ArrayList<EquiposModel>();  
    public ArrayList<entregas>ListaEntregas = new ArrayList<entregas>();
    public ArrayList<propietarios>ListaPropietarios = new ArrayList<propietarios>();
    public ArrayList<reparacion>ListaReparaciones = new ArrayList<reparacion>();
    
//EQUIPOS    
public void IngresarEquipos(String marca, String modelo, String tipo, String problema){
    EquiposModel NuevoEquipo = new EquiposModel(marca, modelo, tipo, problema);
    this.ListaEquipos.add(NuevoEquipo);
}
//ENTREGAS
public void IngresarEntregas(String codigo, String nombre, String fecha, String descripcion){
    entregas NuevaEntrega = new entregas(codigo, nombre, fecha, descripcion);
    this.ListaEntregas.add(NuevaEntrega);
}

//PROPIETARIOS
public void IngresarPropietarios(String apellidosP, String nombreP, String telefono){
    propietarios NuevoPropietario = new propietarios(apellidosP, nombreP, telefono);
    this.ListaPropietarios.add(NuevoPropietario);
}
//REPARACIONES
public void IngresarReparaciones(String codigoR, String descripcionR, String tecnico, String fechaR){
    reparacion NuevaReparacion = new reparacion(codigoR, descripcionR, tecnico, fechaR);
    this.ListaReparaciones.add(NuevaReparacion);
}


public ArrayList ListarEquipos(){
    return ListaEquipos;
}
public ArrayList ListarEntregas(){
    return ListaEntregas;
}
public ArrayList ListarPropietarios(){
    return ListaPropietarios;
}
public ArrayList ListarReparaciones(){
    return ListaReparaciones;
}

}
