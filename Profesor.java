public class Profesor extends Persona{
    private int codigoProfesor;

    public Profesor(String nombre, String apellido, int edad, int codigoProfesor) {
        super(nombre, apellido, edad);
        this.codigoProfesor = codigoProfesor;
    }

    public int getCodigoProfesor() {
        return codigoProfesor;
    }
    
          @Override
     public String mostrarDatos(){
        return "Profesor "+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+
                "\nCodigo Profesor: "+codigoProfesor;
    }
}
