import java.util.Scanner;
public class Principal {
     public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
         
        Persona misPersonas[] = new Persona[3];
        Estudiante est = new Estudiante(null,null, 0, 0,0);
        Potencia pot = new Potencia();
       
        misPersonas[0] = new Persona("Manuel", "Becerra", 20);
        misPersonas[1] = new Estudiante("Jose","Macias", 18, 412412, 4);
        misPersonas[2] = new Profesor("Maria","Cardenas",40,12412);
                
        for(Persona personas: misPersonas){
            System.out.println(personas.mostrarDatos());
            System.out.println("");
        }
        
        
        
        
        System.out.println("La base es: ");
        int base=sc.nextInt();
        
        System.out.println("El exponente es: ");
        int exponente=sc.nextInt();
        
        System.out.println("El resultado es: "+pot.potencia(base, exponente));
    }
}
