import java.sql.Date;

public class alumno {
    String nombre;
    String apellidos;
    String email;
    String direccion;
    String telefono;
    String celular;
    Date fecha_nac;
    int edad;
    String CURP;
    String matricula;
    int cedula;
    public alumno(){
    }
    public alumno(String nombre,String apellidos,String email,String direccion,String telefono,String celular,Date fecha_nac,int edad,String CURP,String matricula,int cedula){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.fecha_nac = fecha_nac;
        this.edad = edad;
        this.CURP = CURP;
        this.matricula = matricula;
        this.cedula = cedula;
    }
}
