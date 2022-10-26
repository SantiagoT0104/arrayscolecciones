import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
        int op,num1,num2;
        System.out.println("menu opciones \n 1.suma \n 2.suma \n 3.multiplicacion \n 4.division \n ingrese el numero de la opcion que desea realizar ");
        op=leer.nextInt();

        System.out.println("ingrese el numero 1");
        num1=leer.nextInt();
        System.out.println("ingrese el numero 2");
        num2=leer.nextInt();

        switch (op){
            case 1:
                int suma=num1+num2;
                System.out.println("la suma entre el numero"+num1+"y el numero"+num2+"es"+suma );
            break;

            case 2:
                int resta=num1-num2;
                System.out.println("la suma entre el numero"+num1+"y el numero"+num2+"es"+resta );
            break;

            case 3:
                int multiplicar=num1*num2;
                System.out.println("el numero"+num1+"y el numero"+num2+"y el resultado de esta multiplicacion es"+multiplicar);
            break;

            case 4:
                int division=num1/num2;
                System.out.println("el numero"+num1+"se dividio entre el numero"+num2+"y el resultado de esta dividicion es "+division);
            break;

            case 5:
                int potenciacion=num1^num2;
                System.out.println("el numero"+num1+"se elevo a la potenciacion"+num2+"es"+potenciacion);
                break;
            case 6:
                Double raizcuadrada1=Math.sqrt(num1);
                Double raizcuadrada2=Math.sqrt(num2);
                System.out.printf("la raiz cuadrada del numero"+num1+"es"+raizcuadrada1+"y la de el numero"+num2+"es"+raizcuadrada2);
                break;
        }
        leer.close();

    }
    
}
