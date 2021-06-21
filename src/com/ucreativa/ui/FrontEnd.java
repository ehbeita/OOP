package com.ucreativa.ui;
import com.ucreativa.repositories.FileRepository;
import com.ucreativa.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

import static java.lang.String.join;

public class FrontEnd extends JFrame{

    public FrontEnd (String titulo){
        super(titulo);
    }

    public void build(){
        this.construccionPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }

    private void construccionPantalla(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,200);
        super.setLayout(new GridLayout(5,2));
    }

    private void agregarComponentes(Component componente){
        super.getContentPane().add(componente);
    }

    private void crearComponentes(){

        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblCedula = new JLabel("Cedula");
        JLabel lblEdad = new JLabel("Edad");
        JLabel lblRiesgo = new JLabel("Riesgo");
        JLabel lblIsAmigo = new JLabel("Es Amigo?");
        JLabel lblRelacion = new JLabel("Relacion");
        JLabel lblFacebook = new JLabel("Facebook");
        JLabel lblParentesco = new JLabel("Parentesco");
        JLabel lblMarca = new JLabel("Marca");

        JTextField txtNombre = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtEdad = new JTextField();
        JTextField txtRelacion = new JTextField();
        JTextField txtFacebook = new JTextField();
        JTextField txtParentesco = new JTextField();
        JTextField txtMarca = new JTextField();

        JCheckBox txtRiesgo = new JCheckBox();
        JCheckBox txtIsAmigo = new JCheckBox();

        txtIsAmigo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    lblParentesco.setVisible(!txtIsAmigo.isSelected());
                    txtParentesco.setVisible(!txtIsAmigo.isSelected());
                    lblRelacion.setVisible(txtIsAmigo.isSelected());
                    txtRelacion.setVisible(txtIsAmigo.isSelected());
                    lblFacebook.setVisible(txtIsAmigo.isSelected());
                    txtFacebook.setVisible(txtIsAmigo.isSelected());
            }
        });

        JButton salvar = new JButton("Salvar");
        salvar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraService service = new BitacoraService(new FileRepository());
                try {
                    service.save(txtNombre.getText(),txtCedula.getText(),txtEdad.getText(),
                            txtRiesgo.isSelected(),txtIsAmigo.isSelected(),txtRelacion.getText(),
                            txtFacebook.getText(),txtParentesco.getText(),txtMarca.getText());

                    txtNombre.setText("");
                    txtCedula.setText("");
                    txtEdad.setText("");
                    txtRiesgo.setText("");
                    txtIsAmigo.setText("");
                    txtRelacion.setText("");
                    txtFacebook.setText("");
                    txtParentesco.setText("");
                    txtMarca.setText("");

                    //String reporte = String.join("\n",service.get());
                    //JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(), reporte);

                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        this.agregarComponentes(lblNombre);
        this.agregarComponentes(txtNombre);
        this.agregarComponentes(lblCedula);
        this.agregarComponentes(txtCedula);
        this.agregarComponentes(lblEdad);
        this.agregarComponentes(txtEdad);
        this.agregarComponentes(lblRiesgo);
        this.agregarComponentes(txtRiesgo);
        this.agregarComponentes(lblIsAmigo);
        this.agregarComponentes(txtIsAmigo);
        this.agregarComponentes(lblRelacion);
        this.agregarComponentes(txtRelacion);
        this.agregarComponentes(lblFacebook);
        this.agregarComponentes(txtFacebook);
        this.agregarComponentes(lblParentesco);
        this.agregarComponentes(txtParentesco);
        this.agregarComponentes(lblMarca);
        this.agregarComponentes(txtMarca);
        this.agregarComponentes(salvar);

    }
}
