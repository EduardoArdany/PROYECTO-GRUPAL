/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckModelos;

public class reparacion {
    String codigoR;
    String descripcionR;
    String tecnico;
    String fechaR;

    public reparacion(String codigoR, String descripcionR, String tecnico, String fechaR) {
        this.codigoR = codigoR;
        this.descripcionR = descripcionR;
        this.tecnico = tecnico;
        this.fechaR = fechaR;              
    }
    public String getCodigoR() {
        return codigoR;
    }

    public void setCodigoR(String codigoR) {
        this.codigoR = codigoR;
    }

    public String getDescripcionR() {
        return descripcionR;
    }

    public void setDescripcionR(String descripcionR) {
        this.descripcionR = descripcionR;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }
    
    
}
