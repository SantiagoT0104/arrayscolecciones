import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //defenir un objeto;
        Scanner leer=new Scanner(System.in);

        //reciba el radio del circulo y calcule su area

        //datos de entrada
        final double PI=3.1416;
        double radio,area;

        System.out.println("ingrese el radio del circulo");
        radio=leer.nextDouble();

        //procesar la informacion
        area= PI*radio*radio;

        //salida
        System.out.println("el area del circulo con radio"+radio+"es"+area);
        leer.close();
    }
}
