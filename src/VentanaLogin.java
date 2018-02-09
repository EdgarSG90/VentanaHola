import javax.swing.JFrame;
import java.awt.*;

public class VentanaLogin extends JFrame{

    public VentanaLogin(String titulo) {
        this.setTitle(titulo);

        Container panelPrinc = this.getContentPane();
        panelPrinc.setBackground(Color.GREEN);
    }

    public static void main(String[] args)
    {
        VentanaLogin f = new VentanaLogin("Primera Ventana");
        f.setSize(300,300);
        f.setLocation(200,100);
        //f.setBackground(Color.cyan); No funciona Es sobre el panel principal
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
