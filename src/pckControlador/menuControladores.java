/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckControlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import pckModelos.ModelAgregar;
import pckVistas.Entrega;
import pckVistas.Equipos;
import pckVistas.Interfaz;
import pckVistas.Propietarios;
import pckVistas.Reparacion;

public class menuControladores implements ActionListener{

    Interfaz VistaMenu;
    Equipos VistaEquipos;
    Entrega VistaEntrega;
    Propietarios VistaPropietarios;
    Reparacion VistaReparacion;
    ModelAgregar AgregarModel;
    public DefaultTableModel TablaEquipos = new DefaultTableModel();
    
    public menuControladores(Interfaz VistaMenu,Equipos VistaEquipos, Entrega VistaEntrega,  
            Propietarios VistaPropietarios, Reparacion VistaReparacion, ModelAgregar AgregarModel){
        this.VistaMenu = VistaMenu;
        this.VistaEquipos =VistaEquipos;
        this.VistaEntrega = VistaEntrega;
        this.VistaPropietarios = VistaPropietarios;
        this.VistaReparacion = VistaReparacion;
        this.AgregarModel = AgregarModel;
        
        
              
        //Variable boton
        this.VistaMenu.btnIngresoEquipo.addActionListener(this);
        this.VistaMenu.btnEntrega.addActionListener(this);
        this.VistaMenu.btnRegistroPropietario.addActionListener(this);
        this.VistaMenu.btnReparacion.addActionListener(this);
        
        
        
        //Levantar la vista principal
        this.VistaMenu.setExtendedState(Interfaz.MAXIMIZED_BOTH);
        this.VistaMenu.setVisible(true);
        
        this.TablaEquipos.addColumn("MARCA");
        this.TablaEquipos.addColumn("MODELO");
        this.TablaEquipos.addColumn("TIPO");
        this.TablaEquipos.addColumn("PROBLEMA");
        
        this.VistaEquipos.tblEquipos.setModel(TablaEquipos);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaMenu.btnIngresoEquipo){
            
            //PONER A LA ESCUCHA LOS BOTONES DE LA VISTA USUARIOS
            this.VistaEquipos.btnIngresar.addActionListener(this);
            //LEVANTAR LA VISTA USUARIOS
            this.VistaEquipos.setLocationRelativeTo(null);
            this.VistaEquipos.setVisible(true);
        }
        if(e.getSource()==this.VistaEquipos.btnIngresar){
            this.AgregarModel.IngresarEquipos(this.VistaEquipos.txtMarca.getText(),
                    this.VistaEquipos.txtModelo.getText(),
                    this.VistaEquipos.txtTipo.getText(),
                    this.VistaEquipos.txtProblema.getText());
            this.TablaEquipos.addRow(new Object[]{this.AgregarModel.ListaEquipos.get(0).getMarca(),
            this.AgregarModel.ListaEquipos.get(0).getModelo(),
            this.AgregarModel.ListaEquipos.get(0).getTipo(),
            this.AgregarModel.ListaEquipos.get(0).getProblema()});
        }
    }
    
    //Levantar el formulario principal 
    
    
}
//