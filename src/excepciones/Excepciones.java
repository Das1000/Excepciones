package excepciones;
public class Excepciones {
public static void main(String[] args) {
        
        int arreglo[] = new int[5];
        
        try {
            arreglo[5] = 1;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: " + e.getMessage());
        }
   
        System.out.println("mensaje");
        
        String arreglo2[] = {"1","2","10","n","54"};
        int suma = 0;
        
        for (int contador = 0;
            contador < arreglo.length; contador++){
            try {
            int numero =
                    Integer.parseInt(arreglo2[contador]);
            suma = suma+ numero;
             
        }catch(NumberFormatException e){
            System.out.println("ERROR AL CONVERTIR " 
                    + "EL STRING A NUMERO");
        }    
        }
        System.out.println("SUMA: " + suma );
        
        
        try {
        int cantidad = Integer.parseInt(null);
        int deuda = cantidad *2;
        }catch(NumberFormatException e){
            System.out.println("LA CANTIDA ES NULA");
        }
        
        try{
        String valor = null;
        int longitud = valor.length();
        }catch(NullPointerException e){
            System.out.println("VARIABLE NULA");     
        }
    }
}
