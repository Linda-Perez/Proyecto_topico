import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Agregar extends JFrame{

    Connection conexion;
    PreparedStatement ps;
    //DefaultListModel model = new DefaultListModel();

    private JTextField estudiosText;
    private JTextField nombreText;
    private JTextField apellidoText;
    private JTextField curpText;
    private JTextField edadText;
    private JTextField celularText;
    private JTextField telefonoText;
    private JTextField emailText;
    private JTextField direccionText;
    private JComboBox tipocontratoText;
    private JTextField universidadText;
    private JTextField anograduacionText;
    private JTextField tituloText;
    private JComboBox tipoestudioText;
    private JTextField materiadictarText;
    private JButton aceptarBt;
    private JButton registroConsultar;
    private JButton registroMenu;
    private JPanel Panel_insertar;
    private JTextField fechanacText;

    public Agregar() {
        aceptarBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    insertar();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
     public void insertar() throws SQLException {
        conectar();
        ps = conexion.prepareStatement("Insert into profesor values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,nombreText.getText());
        ps.setString(2,apellidoText.getText());
        ps.setString(3,emailText.getText());
        ps.setString(4,direccionText.getText());
        ps.setString(5,telefonoText.getText());
        ps.setString(6,celularText.getText());
        //ps.setDate(7, Date.valueOf(fechanacText.getText()));
        ps.setInt(8, Integer.parseInt(edadText.getText()));
        ps.setString(9,curpText.getText());
        ps.setString(10,tipocontratoText.getActionCommand());
        ps.setString(11,estudiosText.getText());
        ps.setString(12,universidadText.getText());
        ps.setString(13,tituloText.getText());
        ps.setInt(14, Integer.parseInt(anograduacionText.getText()));
        ps.setString(15,tipoestudioText.getActionCommand());
        ps.setString(16,materiadictarText.getText());

        nombreText.setText("");
        apellidoText.setText("");
        emailText.setText("");
        direccionText.setText("");
        telefonoText.setText("");
        celularText.setText("");
        fechanacText.setText("");
        edadText.setText("");
        curpText.setText("");
        estudiosText.setText("");
        universidadText.setText("");
        tituloText.setText("");
        anograduacionText.setText("");
        materiadictarText.setText("");
     }
    public static void main(String[] args) {
        Agregar f = new Agregar();
        f.setContentPane(new Agregar().Panel_insertar);
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
