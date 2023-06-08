import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_profesor extends JFrame{
    private JButton menuEliminar;
    private JButton menuAgregar;
    private JButton menuConsultar;
    private JPanel menu_principal;


    public static void main(String[] args) {
        GUI_profesor f = new GUI_profesor();
        f.setContentPane(new GUI_profesor().menu_principal);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.pack();
    }
public GUI_profesor() {
    menuAgregar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

           Agregar ir_agregar = new Agregar();
           ir_agregar.setVisible(true);
        }
    });
    menuConsultar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Consultar ir_consultar = new Consultar();
            ir_consultar.setVisible(true);
        }
    });
    menuEliminar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Consultar ir_eliminar = new Consultar();
            ir_eliminar.setVisible(true);
        }
    });
}
}
