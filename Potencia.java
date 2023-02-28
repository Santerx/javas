public class Potencia {
     public int potencia(int b, int e){
         if(e==1)
             return b;
         else if(e == 0)
             return 1;
         else
             return b * potencia(b,e-1);
     }
}
