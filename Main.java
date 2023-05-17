import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main 
{
	public static void main (String []args)
	{
		MiBD conexion =  new MiBD();
		ResultSet result;
        ResultSet result4;
		ResultSet result5;
		ResultSet result6;
		ResultSet result7;
		ResultSet result8;
        persona persona= new persona();
        materia materia = new materia();
		aula aula = new aula();
		materia_aula materia_aula = new materia_aula();
		curso curso = new curso();
		cupo cupo = new cupo();

		result = conexion.getQuery("select * from persona");
		try
		{
			while(result.next())
			{
				persona.nombre = result.getString("nombre");
                persona.apellidos = result.getString("apellidos");
				persona.email = result.getString("email");
				persona.direccion = result.getString("direccion");
                persona.telefono = result.getString("telefono");
                persona.celular = result.getString("celular");
                persona.fecha_nac = result.getDate("fecha_nac");
                persona.edad = result.getInt("edad");
                persona.CURP = result.getString("curp");

                System.out.println();
				System.out.println (persona.nombre +" " + persona.apellidos);
				System.out.println("Email: " + persona.email);
				System.out.println("Dirección: " + persona.direccion);
				System.out.println("Teléfono: " + persona.telefono);
				System.out.println("Celular: " + persona.celular);
				System.out.println("Fecha de nacimiento: " + persona.fecha_nac);
				System.out.println("Edad: " + persona.edad);
				System.out.println("CURP: " + persona.CURP);
                System.out.println();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		result4 = conexion.getQuery("select * from materia");
		try
		{
			while(result4.next())
			{
				materia.nombre = result4.getString("nombre");
				materia.creditos = result4.getInt("creditos");
				materia.tipo_materia = result4.getString("tipo_materia");
				materia.requisitos_temas = result4.getString("requisitos_temas");
				materia.n_horas = result4.getInt("n_horas");
				materia.horario = result4.getString("horario");
				materia.profesor_imparte = result4.getString("profesor_imparte");
				materia.calificacion = result4.getInt("calificacion");
				materia.codigo = result4.getInt("codigo");

				System.out.println();
				System.out.println (materia.nombre);
				System.out.println("N. de créditos: " + materia.creditos);
				System.out.println("Tipo de materia: " + materia.tipo_materia);
				System.out.println("Requisitos de temas: " + materia.requisitos_temas);
				System.out.println("N. de horas: " + materia.n_horas);
				System.out.println("Horario: " + materia.horario);
				System.out.println("Profesor que imparte: " + materia.profesor_imparte);
				System.out.println("Calificación: " + materia.calificacion);
				System.out.println("Código: " + materia.codigo);
				System.out.println();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		result5 = conexion.getQuery("select * from aula");
		try
		{
			while(result5.next())
			{
				aula.lugar = result5.getString("lugar");
				aula.n_pupitres = result5.getInt("n_pupitres");
				aula.codigo = result5.getInt("codigo");

				System.out.println();
				System.out.println ("AULA");
				System.out.println("Lugar del aula: " + aula.lugar);
				System.out.println("N. de pupitres: " + aula.n_pupitres);
				System.out.println("Código: " + aula.codigo);
				System.out.println();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		result6 = conexion.getQuery("select * from materia_aula");
		try
		{
			while(result6.next())
			{
				materia_aula.mes = result6.getString("mes");
				materia_aula.dia = result6.getInt("dia");
				materia_aula.hora = result6.getString("hora");

				System.out.println();
				System.out.println ("Cuando se imparte la materia en el aula");
				System.out.println("Mes: " + aula.lugar);
				System.out.println("Día: " + aula.n_pupitres);
				System.out.println("Hora: " + aula.codigo);
				System.out.println();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		result7 = conexion.getQuery("select * from curso");
		try
		{
			while(result7.next())
			{
				curso.nombre = result7.getString("nombre");
				curso.materia = result7.getString("materia");
				curso.salon = result7.getString("salon");
				curso.horario = result7.getString("horario");
				curso.codigo = result7.getInt("codigo");

				System.out.println();
				System.out.println ("Nombre del curso: " + curso.nombre );
				System.out.println("Materia a la que se dirige: " + curso.materia);
				System.out.println("Salón donde se imparte: " + curso.salon);
				System.out.println("Horario: " + curso.horario);
				System.out.println("Código: " + curso.codigo);
				System.out.println();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		result8 = conexion.getQuery("select * from cupo");
		try
		{
			while(result8.next())
			{
				cupo.cupo_max = result8.getInt("cupo_max");
				cupo.cupo_actual = result8.getInt("cupo_actual");
				cupo.cupo_min = result8.getInt("cupo_min");

				System.out.println();
				System.out.println ("CUPO");
				System.out.println("Cupo máximo: " + cupo.cupo_max);
				System.out.println("Cupo actual: " + cupo.cupo_actual);
				System.out.println("Cupo mínimo: " + cupo.cupo_min);
				System.out.println();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

	}

}
