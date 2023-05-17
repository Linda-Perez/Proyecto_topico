public class materia {
    String nombre;
    int creditos;
    String tipo_materia;
    String requisitos_temas;
    int n_horas;
    String horario;
    String profesor_imparte;
    int calificacion;
    int codigo;
    public materia(){
    }
    public materia(String nombre,int creditos,String tipo_materia,String requisitos_temas,int n_horas,String horario,String profesor_imparte,int calificacion,int codigo){
        this.nombre = nombre;
        this.creditos = creditos;
        this.tipo_materia = tipo_materia;
        this.requisitos_temas = requisitos_temas;
        this.n_horas = n_horas;
        this.horario = horario;
        this.profesor_imparte = profesor_imparte;
        this.calificacion = calificacion;
        this.codigo = codigo;
    }
}
