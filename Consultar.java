import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Consultar extends JFrame{

    Connection conexion;
    DefaultListModel model = new DefaultListModel();
    Statement st;
    ResultSet result;

    private JPanel consultaPanel;
    private JList consultaLista;
    private JButton eliminarBt;
    private JButton menuBt;
    private JTextField eliminarText;
    private JButton consultarBt;


    public Consultar() {
        consultarBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista_consulta();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public  void lista_consulta() throws SQLException {
        conectar();
        consultaLista.setModel(model);
        st = conexion.createStatement();
        result = st.executeQuery("Select * from profesor");
        model.removeAllElements();
        while (result.next()){
            model.addElement(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5)+" "+result.getString(6)+" "+result.getDate(7)+" "+result.getInt(8)+" "+result.getString(9)+" "+result.getString(10)+" "+result.getString(11)+" "+result.getString(12)+" "+result.getString(13)+" "+result.getInt(14)+" "+result.getString(15)+" "+result.getString(16)+" ");

        }
    }
    public static void main(String[] args) {
        Consultar f = new Consultar();
        f.setContentPane(new Consultar().consultaPanel);
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
