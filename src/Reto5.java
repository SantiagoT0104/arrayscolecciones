import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String nombre,apellido;

        System.out.println("dijite su nombre");
        nombre=leer.next();

        System.out.println("dijite su apellido");
        apellido=leer.next();

        int length=nombre.length();
        System.out.println("la longitud de su nombre es"+length);

        System.out.println(nombre.toUpperCase());
        System.out.println(apellido.toLowerCase());
        System.out.println(nombre+" "+apellido);

        String subnombre= nombre.substring(0,2);

        System.out.println(subnombre+apellido);
        leer.close();

    }

    
}
