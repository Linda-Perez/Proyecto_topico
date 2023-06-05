import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main 
{
	public static void main (String []args)
	{
		MiBD conexion =  new MiBD();
		ResultSet result;
		ResultSet result2;
		ResultSet result3;
        ResultSet result4;
		ResultSet result5;
		ResultSet result6;
		ResultSet result7;
		ResultSet result8;
        persona persona= new persona();
		profesor profesor = new profesor();
		alumno alumno = new alumno();
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
		result2 = conexion.getQuery("select * from profesor");
		try
		{
			while(result2.next())
			{
				profesor.nombre = result2.getString("nombre");
				profesor.apellidos = result2.getString("apellidos");
				profesor.email = result2.getString("email");
				profesor.direccion = result2.getString("direccion");
				profesor.telefono = result2.getString("telefono");
				profesor.celular = result2.getString("celular");
				profesor.fecha_nac = result2.getDate("fecha_nac");
				profesor.edad = result2.getInt("edad");
				profesor.CURP = result2.getString("curp");
				profesor.tipo_contrato = result2.getString("tipo_contrato");
				profesor.estudios_realizados = result2.getString("estudios_realizados");
				profesor.universidad = result2.getString("universidad");
				profesor.titulo = result2.getString("titulo");
				profesor.ano_graduacion = result2.getInt("ano_graduacion");
				profesor.tipo_estudio = result2.getString("tipo_estudio");
				profesor.materias_dictar = result2.getString("materias_dictar");

				System.out.println();
				System.out.println (profesor.nombre +" " + profesor.apellidos);
				System.out.println("Email: " + profesor.email);
				System.out.println("Dirección: " + profesor.direccion);
				System.out.println("Teléfono: " + profesor.telefono);
				System.out.println("Celular: " + profesor.celular);
				System.out.println("Fecha de nacimiento: " + profesor.fecha_nac);
				System.out.println("Edad: " + profesor.edad);
				System.out.println("CURP: " + profesor.CURP);
				System.out.println("Tipo de contrato: " + profesor.tipo_contrato);
				System.out.println("Estudios realizados: " + profesor.estudios_realizados);
				System.out.println("Universidad: " + profesor.universidad);
				System.out.println("Título: " + profesor.titulo);
				System.out.println("Año de graduación: " + profesor.ano_graduacion);
				System.out.println("Tipo de estudios: " + profesor.tipo_estudio);
				System.out.println("Materias que puede dictar: " + profesor.materias_dictar);
				System.out.println();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		result3 = conexion.getQuery("select * from alumno");
		try
		{
			while(result3.next())
			{
				alumno.nombre = result3.getString("nombre");
				alumno.apellidos = result3.getString("apellidos");
				alumno.email = result3.getString("email");
				alumno.direccion = result3.getString("direccion");
				alumno.telefono = result3.getString("telefono");
				alumno.celular = result3.getString("celular");
				alumno.fecha_nac = result3.getDate("fecha_nac");
				alumno.edad = result3.getInt("edad");
				alumno.CURP = result3.getString("curp");
				alumno.matricula = result3.getString("matricula");
				alumno.cedula = result3.getInt("cedula");

				System.out.println();
				System.out.println (alumno.nombre +" " + alumno.apellidos);
				System.out.println("Email: " + alumno.email);
				System.out.println("Dirección: " + alumno.direccion);
				System.out.println("Teléfono: " + alumno.telefono);
				System.out.println("Celular: " + alumno.celular);
				System.out.println("Fecha de nacimiento: " + alumno.fecha_nac);
				System.out.println("Edad: " + alumno.edad);
				System.out.println("CURP: " + alumno.CURP);
				System.out.println("Matrícula: " + alumno.matricula);
				System.out.println("Cédula: " + alumno.cedula);
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
