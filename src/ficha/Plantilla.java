/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ficha;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author findag
 */
public class Plantilla
{
    /*
    * En esta clase crearemos la plantilla que usaremos para la toma de datos utilizando la libreria swing
    */
    public Plantilla()
    {
        /*
        * Definimos primero los componentes
        */
        JFrame marco;
        JPanel panel;
        JLabel tNombre;
        JLabel tApellidos;
        JLabel tIdentificacion;
        JLabel tNacionalidad;
        JLabel tDireccion;
        JLabel tPoblacion;
        JLabel tProvincia;
        JLabel tTelefono;
        JLabel tEmail;
        JLabel tMascota;
        JTextField nombre;
        JTextField apellidos;
        JTextField identificacion;
        JTextField nacionalidad;
        JTextField direccion;
        JTextField poblacion;
        JTextField provincia;
        JTextField telefono;
        JTextField email;
        JCheckBox mascota;
        JButton bAceptar;
        JButton bCancelar;
        
        /*
        * Creamos los componentes
        */
        marco = new JFrame("Ficha Clientes");
        panel = new JPanel ();
        tNombre = new JLabel("Nombre");
        tApellidos = new JLabel("Apellidos");
        tIdentificacion = new JLabel("DNI/Pasaporte");
        tNacionalidad = new JLabel("Nacionalidad");
        tDireccion = new JLabel("Direccion");
        tPoblacion = new JLabel("Poblacion");
        tProvincia = new JLabel("Provincia");
        tTelefono = new JLabel("Telefono");
        tEmail = new JLabel("Email");
        tMascota = new JLabel("Mascota");
        nombre = new JTextField(15);
        apellidos = new JTextField(15);
        identificacion = new JTextField(15);
        nacionalidad = new JTextField(15);
        direccion = new JTextField(15);
        poblacion = new JTextField(15);
        provincia = new JTextField(15);
        telefono = new JTextField(15);
        email = new JTextField(15);
        mascota = new JCheckBox();
        bAceptar = new JButton("Aceptar");
        bCancelar = new JButton("Cancelar");
        
        /*
        * Aplicamos un layout para modificar el como aparecen los componentes en el panel
        */
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        /*
        * Agregamos todos los componentes al panel.
        */
        panel.add(tNombre);
        panel.add(nombre);
        panel.add(tApellidos);
        panel.add(apellidos);
        panel.add(tIdentificacion);
        panel.add(identificacion);
        panel.add(tNacionalidad);
        panel.add(nacionalidad);
        panel.add(tDireccion);
        panel.add(direccion);
        panel.add(tPoblacion);
        panel.add(poblacion);
        panel.add(tProvincia);
        panel.add(provincia);
        panel.add(tTelefono);
        panel.add(telefono);
        panel.add(tEmail);
        panel.add(email);
        panel.add(tMascota);
        panel.add(mascota);
        panel.add(bAceptar);
        panel.add(bCancelar);
        /*
        * Agregamos el panel al marco y definimos sus caracteristicas
        */
        marco.add(panel);
        marco.setSize(800,600);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
       
    }
}
