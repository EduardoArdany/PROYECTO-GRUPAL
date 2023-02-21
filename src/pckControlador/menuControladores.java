
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
    public DefaultTableModel TablaPropietarios = new DefaultTableModel();
    public DefaultTableModel TablaReparacion = new DefaultTableModel();
    public DefaultTableModel TablaEntrega = new DefaultTableModel();
    
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
        
        
        
        //Levantar la vista principal, con la tabla de equipos
        this.VistaMenu.setSize(826, 701);
        this.VistaMenu.setVisible(true);
        
        this.TablaEquipos.addColumn("MARCA");
        this.TablaEquipos.addColumn("MODELO");
        this.TablaEquipos.addColumn("TIPO");
        this.TablaEquipos.addColumn("PROBLEMA");
        
        this.VistaEquipos.tblEquipos.setModel(TablaEquipos);
        
        //Levantar la tabla de Propietarios        
        this.TablaPropietarios.addColumn("APELLIDOS");
        this.TablaPropietarios.addColumn("NOMBRE");
        this.TablaPropietarios.addColumn("TELEFONO");
        
        this.VistaPropietarios.tblPropietarios.setModel(TablaPropietarios);
        
        //Levantar la tabla de Reparacion
        this.TablaReparacion.addColumn("CODIGO");
        this.TablaReparacion.addColumn("DESCRIPCION");
        this.TablaReparacion.addColumn("TECNICO");
        this.TablaReparacion.addColumn("FECHA");
        
        this.VistaReparacion.tblReparacion.setModel(TablaReparacion);
        
        //Levantar la tabla de Entrega
        this.TablaEntrega.addColumn("CODIGO EQUIPO");
        this.TablaEntrega.addColumn("NOMBRE");
        this.TablaEntrega.addColumn("FECHA ENTREGA");
        this.TablaEntrega.addColumn("DESCRIPCION");
        
        this.VistaEntrega.tblEntrega.setModel(TablaEntrega);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        //Llevar del fomulario menu al de equipos
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
        
        if(e.getSource()==this.VistaMenu.btnRegistroPropietario){
            
            this.VistaPropietarios.btnPropietario.addActionListener(this);
            
            this.VistaPropietarios.setLocationRelativeTo(null);
            this.VistaPropietarios.setVisible(true);
        }
        
        if(e.getSource()==this.VistaPropietarios.btnPropietario){
            this.AgregarModel.IngresarPropietarios(this.VistaPropietarios.txtApellidos.getText(),
                    this.VistaPropietarios.txtNombre.getText(),
                    this.VistaPropietarios.txtTelefono.getText());
            this.TablaPropietarios.addRow(new Object[]{this.AgregarModel.ListaPropietarios.get(0).getApellidosP(),
            this.AgregarModel.ListaPropietarios.get(0).getNombreP(),
            this.AgregarModel.ListaPropietarios.get(0).getTelefono()});
        }
                  
        if(e.getSource()==this.VistaMenu.btnReparacion){
            
            this.VistaReparacion.btnReparacion.addActionListener(this);
            
            this.VistaReparacion.setLocationRelativeTo(null);
            this.VistaReparacion.setVisible(true);
        }
        
        if(e.getSource()==this.VistaReparacion.btnReparacion){
            this.AgregarModel.IngresarReparaciones(this.VistaReparacion.txtCodigo.getText(),
                    this.VistaReparacion.txtDescripcion.getText(),
                    this.VistaReparacion.txtFecha.getText(),
                    this.VistaReparacion.txtTecnico.getText());
            
            this.TablaReparacion.addRow(new Object[]{this.AgregarModel.ListaReparaciones.get(0).getCodigoR(),
                this.AgregarModel.ListaReparaciones.get(0).getDescripcionR(),
                this.AgregarModel.ListaReparaciones.get(0).getFechaR(),
                this.AgregarModel.ListaReparaciones.get(0).getTecnico()});
         }
        
        if(e.getSource()==this.VistaMenu.btnEntrega){
            
            this.VistaEntrega.btnEntregar.addActionListener(this);
            
            this.VistaEntrega.setLocationRelativeTo(null);
            this.VistaEntrega.setVisible(true);   
        }
        
        if(e.getSource()==this.VistaEntrega.btnEntregar){
            this.AgregarModel.IngresarEntregas(this.VistaEntrega.txtDescripcionS.getText(),
                    this.VistaEntrega.txtEquipo.getText(),
                    this.VistaEntrega.txtFechaE.getText(),
                    this.VistaEntrega.txtNombreP.getText());
            this.TablaEntrega.addRow(new Object[]{this.AgregarModel.ListaEntregas.get(0).getCodigo(),
                this.AgregarModel.ListaEntregas.get(0).getDescripcion(),
                this.AgregarModel.ListaEntregas.get(0).getFecha(),
                this.AgregarModel.ListaEntregas.get(0).getNombre()});
        }
    }
}