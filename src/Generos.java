import java.util.Scanner;

public class Generos {
    public static void main(String[] args) {
        int H=0,M=0;
        String genero;
        String hombre="h",mujer="m";
        Scanner leer=new Scanner(System.in);

        for( int i=1; i<=10; i++){
            System.out.println("eres hombre o mujer,escribe h si eres hombre o m si eres mujer");
            genero=leer.next();

            if (genero.equalsIgnoreCase(hombre)){
                H=H+1;
                System.out.println("van"+H+"hombres");
            }
            else if (genero.equalsIgnoreCase(mujer)){
                M=M+1;
                System.out.println("van"+M+"mujeres");
            }
            else{
                System.out.println("siga las instrucciones");
            }
        }
        System.out.println("el total de hombres es "+H+"y el de mujeres es"+M);
        leer.close();
    }
    
}
