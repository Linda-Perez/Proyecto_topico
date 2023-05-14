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
		String email;
		String direccion;
		int telefono;
		int celular;
		Date fecha_nac;
		int edad;
		String CURP;
		
		result = conexion.getQuery("select * from persona");
		try
		{
			while(result.next())
			{
				nombre = result.getString("nombre");
				email = result.getString("email");
				direccion = result.getString("direccion");
				telefono = result.getInt("telefono");
				celular = result.getInt("celular");
				fecha_nac = result.getDate("fecha_nac");
				edad = result.getInt("edad");
				CURP = result.getString("curp");
				
				System.out.println (nombre);
				System.out.println(email);
				System.out.println(direccion);
				System.out.println(telefono);
				System.out.println(celular);
				System.out.println(fecha_nac);
				System.out.println(edad);
				System.out.println(CURP);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}
