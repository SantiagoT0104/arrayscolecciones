import java.util.Scanner;
public class Reto2 {
 
public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int dosisvacuna,pesobebe,mesesbebe;

    System.out.println("ingrese el peso del bebe");
    pesobebe=leer.nextInt();
    System.out.println("ingrese los meses del bebe");
    mesesbebe=leer.nextInt();

    //proceso de informacion
    dosisvacuna=(pesobebe+10)/(mesesbebe*10)*8;

    //salida
    System.out.println("la dosis de vacuna que se le aplica al bebe es"+dosisvacuna);
    leer.close();

   



        
    }
    
}
