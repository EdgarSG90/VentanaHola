import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLogin extends JFrame{

    JButton btnAceptar;
    JButton btnCancelar;

    public VentanaLogin(String titulo) {
        this.setTitle(titulo);
        this.setResizable(false);
        this.setLayout(null);

        Container panelPrinc = this.getContentPane();
        panelPrinc.setBackground(Color.GREEN);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblUsuario = new JLabel("Usuario: ");
        lblUsuario.setBounds(10, 10, 100, 30);
        panelPrinc.add(lblUsuario);

        JTextField edtUsuario = new JTextField();
        edtUsuario.setBounds(120, 10, 100, 30);
        panelPrinc.add(edtUsuario);

        JLabel lblClave = new JLabel("Contraseña: ");
        lblClave.setBounds(10, 50, 100, 30);
        panelPrinc.add(lblClave);

        JTextField edtClave = new JTextField();
        edtClave.setBounds(120, 50, 100, 30);
        panelPrinc.add(edtClave);

        //Creación de objetos que generan eventos
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(40, 90, 80, 30);
        panelPrinc.add(btnAceptar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(130, 90, 80, 30);
        panelPrinc.add(btnCancelar);

        //Creación de oyentes
        AccionBoton oyenteBtnAceptar = new AccionBoton(btnAceptar);
        AccionBoton oyenteBtnCancelar = new AccionBoton(btnCancelar);

        //Vincular oyente al componente
        btnAceptar.addActionListener(oyenteBtnAceptar);
        btnCancelar.addActionListener(oyenteBtnCancelar);
    }


    public static void main(String[] args)
    {
        VentanaLogin f = new VentanaLogin("Primera Ventana");
        f.setSize(300,300);
        f.setLocation(200,100);
        //f.setBackground(Color.cyan); No funciona Es sobre el panel principal

        f.setVisible(true);
    }
}


class AccionBoton implements ActionListener{

    private JButton btnAcep;

    public AccionBoton(JButton btnAcept){
        this.btnAcep = btnAcept;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Presionaste un botón " + ((JButton) e.getSource()).getText());

        if ( ((JButton) e.getSource()) == btnAcep){
            System.out.println("Botón presionado es Aceptar");
        }
        else System.out.println("Botón presionado es Cancelar");
    }
}













