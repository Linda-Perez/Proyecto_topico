public class profesor {
    String tipo_contrato;
    String estudios_realizados;
    String universidad;
    String titulo;
    int año_graduacion;
    String tipo_estudio;
    String materias_dictar;

    public profesor(){
    }
    public profesor (String tipo_contrato,String estudios_realizados,String universidad,String titulo,int año_graduacion,String tipo_estudio,String materias_dictar){
        this.tipo_contrato = tipo_contrato;
        this.estudios_realizados = estudios_realizados;
        this.universidad = universidad;
        this.titulo = titulo;
        this.año_graduacion = año_graduacion;
        this.tipo_estudio = tipo_estudio;
        this.materias_dictar = materias_dictar;
    }
}
