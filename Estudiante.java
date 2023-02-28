public class Estudiante extends Persona {
      private int codigoEstudiante;
      private int notaFinal;
      
      public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, int notaFinal){
          super(nombre, apellido, edad);
          
          this.codigoEstudiante = codigoEstudiante;
          this.notaFinal = notaFinal;
      }
      
          public int getcodigoEstudiante() {
        return codigoEstudiante;
    }    
            public int getnotaFinal() {
        return notaFinal;
    }    
          
      
      @Override
     public String mostrarDatos(){
        return "Estudiante "+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+
                "\nCodigo Estudiante: "+codigoEstudiante+"\nNota Final: "+notaFinal;
    }
}
