import java.sql.Date;

public class profesor {
    String nombre;
    String apellidos;
    String email;
    String direccion;
    String telefono;
    String celular;
    Date fecha_nac;
    int edad;
    String CURP;
    String tipo_contrato;
    String estudios_realizados;
    String universidad;
    String titulo;
    int ano_graduacion;
    String tipo_estudio;
    String materias_dictar;

    public profesor(){
    }
    public profesor (String nombre,String apellidos,String email,String direccion,String telefono,String celular,Date fecha_nac,int edad,String CURP,String tipo_contrato,String estudios_realizados,String universidad,String titulo,int ano_graduacion,String tipo_estudio,String materias_dictar){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.fecha_nac = fecha_nac;
        this.edad = edad;
        this.CURP = CURP;
        this.tipo_contrato = tipo_contrato;
        this.estudios_realizados = estudios_realizados;
        this.universidad = universidad;
        this.titulo = titulo;
        this.ano_graduacion = ano_graduacion;
        this.tipo_estudio = tipo_estudio;
        this.materias_dictar = materias_dictar;
    }
}
