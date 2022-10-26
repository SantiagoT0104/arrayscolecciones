import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String repetir="s";
        int valorglobal=50000,vecesjugadas=0,moneda,eleccion,dineroapostado;

        while (repetir.equalsIgnoreCase("s")){
            moneda=(int)(Math.random()*2)+1;
            System.out.println("dijite la cantidad de dinero que va a apostar,recuerde que el valor global es de "+valorglobal+"mil pesos");
            dineroapostado=leer.nextInt();
            valorglobal=valorglobal-dineroapostado;
            System.out.println("digite 1 para escoger cara o 2 para sello");
            eleccion=leer.nextInt();
            if (moneda==1 && eleccion==1){
                System.out.println("salio cara usted escogio cara ganaste");
                valorglobal=valorglobal+(dineroapostado*2);
            }
            else if(moneda==1 && eleccion==2){
                System.out.println("salio cara usted escogio sello perdiste ");
            }
            else if(moneda==2 && eleccion==2){
                System.out.println("salio sello usted escogio sello ganaste ");
                valorglobal=valorglobal+(dineroapostado*2);
            }
            else if(moneda==2 && eleccion==1){
                System.out.println("salio sello usted escogio cara perdiste ");
            }
            else if(moneda==1 && eleccion==2){
                System.out.println("dijitaste una opcion incorrecta ");
            }
            else{
                System.out.println("datos incorrectos");
            }
            vecesjugadas=vecesjugadas+1;
            System.out.println("el valor global esta en"+valorglobal+"mil pesos");
            System.out.println("si desea volver a jugar dijite s o no para salir");
            repetir=leer.next();

        }
        System.out.println("usted jugo"+vecesjugadas+"veces y acumulo un total de"+valorglobal+"mil pesos");
        leer.close();
    }

    
}
