import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        System.out.println("juego piedra-papel-tijera");
        try (Scanner teclado = new Scanner(System.in)){
            int seleccioncompu = (int)(Math.random() * 3) + 1;
            System.out.println("la computadora ya escogio..");

            System.out.println("indique su seleccion [¨1=piedra, 2=papel, 3=tijera");
            int seleccionusuario=teclado.nextInt();

            System.out.println("la computadora habia escogido");
            switch (seleccioncompu)
            {
                case 1:
                    System.out.println("piedra");
                    switch (seleccionusuario)
                    {
                        case 1:System.out.println("empate");
                         break;
                        case 2:System.out.println("usted gana");
                         break;
                        case 3:System.out.println("la computadora gana");
                         break;
                    }
                    break;
            
                case 2:
                    System.out.println("papel");
                    switch (seleccionusuario)
                    {
                        case 1:System.out.println("empate");
                         break;
                        case 2:System.out.println("usted gana");
                         break;
                        case 3:System.out.println("la computadora gana");
                         break;
                    }
                    break;
                case 3:
                    System.out.println("tijeras");
                    switch (seleccionusuario)
                    {
                        case 1:System.out.println("empate");
                         break;
                        case 2:System.out.println("usted gana");
                         break;
                        case 3:System.out.println("la computadora gana");
                         break;
                    }
                    break;
            }
        }
    }
    
}
