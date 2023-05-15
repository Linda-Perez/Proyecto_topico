import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main 
{
	public static void main (String []args)
	{
		MiBD conexion =  new MiBD();
		ResultSet result;

		String nombre;
        String apellidos;
		String email;
		String direccion;
		String telefono;
		String celular;
		Date fecha_nac;
		int edad;
		String CURP;

		result = conexion.getQuery("select * from persona");
		try
		{
			while(result.next())
			{
				nombre = result.getString("nombre");
                apellidos = result.getString("apellidos");
				email = result.getString("email");
				direccion = result.getString("direccion");
				telefono = result.getString("telefono");
				celular = result.getString("celular");
				fecha_nac = result.getDate("fecha_nac");
				edad = result.getInt("edad");
				CURP = result.getString("curp");

                System.out.println();
				System.out.println (nombre +" " + apellidos);
				System.out.println("Email: " + email);
				System.out.println("Dirección: " + direccion);
				System.out.println("Teléfono: " + telefono);
				System.out.println("Celular: " + celular);
				System.out.println("Fecha de nacimiento: " + fecha_nac);
				System.out.println("Edad: " + edad);
				System.out.println("CURP: " + CURP);
                System.out.println();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
