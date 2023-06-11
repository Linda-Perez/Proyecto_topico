import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Modificar extends JFrame{
    private JPanel panelModificar;
    private JTextField materiadicText;
    private JTextField edadText;
    private JTextField curpText;
    private JTextField universidadText;
    private JTextField fechaNacText;
    private JTextField tituloText;
    private JTextField nombreText;
    private JTextField telefonoText;
    private JTextField direcciontext;
    private JTextField emailText;
    private JTextField apellidoText;
    private JTextField anograduText;
    private JTextField estudiosrealizadosText;
    private JTextField celularText;
    private JButton modificarButton;
    private JButton menuButton;
    private JComboBox tipocontratoBox;
    private JComboBox tipoestudioBox;

    Connection conexion;
    PreparedStatement ps;
    DefaultListModel model = new DefaultListModel();

    public Modificar() {
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    modificar();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public void modificar() throws SQLException {
        conectar();
        ps = conexion.prepareStatement("update profesor set nombre = ?, apellido = ?, email = ?, direccion = ?, telefono = ?, celular = ?, fecha_nac = ?,edad = ?, tipo_contrato = ?, estudios_realizados = ?, universidad = ?, titulo =?,ano_graduacion =?,tipo_estudio = ?, materias_dictar where curp= ? ");
        ps.setString(1,nombreText.getText());
        ps.setString(2,apellidoText.getText());
        ps.setString(3,emailText.getText());
        ps.setString(4,direcciontext.getText());
        ps.setString(5,telefonoText.getText());
        ps.setString(6,celularText.getText());
        ps.setDate(7, Date.valueOf(fechaNacText.getText()));
        ps.setInt(8, Integer.parseInt(edadText.getText()));
        ps.setString(9,tipocontratoBox.getActionCommand());
        ps.setString(10,estudiosrealizadosText.getText());
        ps.setString(11,universidadText.getText());
        ps.setString(12,tituloText.getText());
        ps.setInt(13, Integer.parseInt(anograduText.getText()));
        ps.setString(14,tipoestudioBox.getActionCommand());
        ps.setString(15,materiadicText.getText());
        ps.setString(16,curpText.getText());

        if (ps.executeUpdate()>0){
            model.removeAllElements();
            System.out.println("El elemento ha sido modificado");
        }

        nombreText.setText("");
        apellidoText.setText("");
        emailText.setText("");
        direcciontext.setText("");
        telefonoText.setText("");
        celularText.setText("");
        fechaNacText.setText("");
        edadText.setText("");
        curpText.setText("");
        estudiosrealizadosText.setText("");
        universidadText.setText("");
        tituloText.setText("");
        anograduText.setText("");
        materiadicText.setText("");
    }
    public static void main(String[] args) {
        Modificar f = new Modificar();
        f.setContentPane(new Modificar().panelModificar);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.pack();
    }

    public void conectar(){
        try{
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/control_mat","postgres","LAPS240401");
            System.out.println("Conexión establecida");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


