import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int precio,cantidad,referencias=0,subtotal,total=0,op,cambio,pagar;

        Scanner leer=new Scanner(System.in);

        for(int x=0;x<=4;x++);{
            System.out.println("ingrese el precio del producto");
            precio=leer.nextInt();

            System.out.println("ingrese la cantidad del producto");
            cantidad=leer.nextInt();
            subtotal=precio*cantidad;
            System.out.println(cantidad+"del producto"+precio+"es"+subtotal);
            //iniciar el contador de minutos de la compra
            referencias=referencias+1;
            //iniciamos acumulador para el total de la compra
            total=total+subtotal;

        }
        System.out.println("la cantidad de minutos de la compra es"+referencias);
        System.out.println("el valor de su compra es"+total);
         
        System.out.println("ingrese el valor con el que desea cancelar");
        pagar=leer.nextInt();
        cambio=pagar-total;
        System.out.println("su cambio es "+cambio);
        System.out.println("dijite 1 si cuenta con telefonia movil exito,de lo contrario dijite 2");
        op=leer.nextInt();
        switch (op){
            case 1:
            System.out.println("los minutos que obtuvo por su compra son"+referencias);
                break;
            case 2:
            System.out.println("no pierdas mas minutos,adquiere ya tu telefonia movil exito");

            default:
                break;
        }

        leer.close();
       




        


    }
    
}

