import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
         
        Scanner fin=new Scanner(System.in);

        int moneda,eleccion;
        moneda=(int)(Math.random()*2)+1;
        System.out.println("dijite 1 para cara o 2 para sello");
        eleccion=fin.nextInt();

        if (moneda==1 && eleccion==1){
            System.out.println("salio cara,usted escogio cara ganaste");
        }
        else if (moneda==2 && eleccion==1){
            System.out.println("salio cara,usted escogio sello perdiste ");
        }
        else if (moneda==2 && eleccion==2){
            System.out.println("salio sello,usted escogio sello ganaste");
        }
        else if (moneda==1 && eleccion==2){
            System.out.println("salio sello,usted escogio cara perdiste");
        }
        else if (moneda==1 && eleccion==2){
            System.out.println("dijitaste una opcion incorrecta");
        }
        else 
            System.out.println("datos incorrectos");
            fin.close();
        
    }
    
}
