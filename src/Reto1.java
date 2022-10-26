import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {  
    System.out.println("ingrese los grados F"); 
    Double temperatura,result;
    Scanner leer=new Scanner(System.in);
    temperatura=leer.nextDouble();
    result=(temperatura-32)/1.8;
    System.out.println("los grados centrigrados que debe poner en el horno son"+result);

    leer.close();

 
    }
        
    }
    

