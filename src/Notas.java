import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        
        Double valornotas,subtotalnotas=0.0,totalnotas=0.0;
        Scanner leer=new Scanner(System.in);

        for( int i=1; i<=4; i++){
            System.out.println("dijite el valor de la nota de 1 a 5");
            valornotas=leer.nextDouble();
            subtotalnotas=subtotalnotas+valornotas;
        }
        totalnotas=subtotalnotas/4;
        if (0.0<=totalnotas || totalnotas<=2.9){
            System.out.println("reprobaste la la asignaturascon una nota de"+totalnotas);
        }
        else if (3.0<=totalnotas ||totalnotas<=4.0){
            System.out.println("pasaste rasoando la asignatura con una nota de"+totalnotas);
        }
        else if (4.1<=totalnotas){
            System.out.println("aprobaste con buenos resultados con una nota de"+totalnotas);
        }
        else
        System.out.println("dijite nuevamente las notas");
        leer.close();
    }

    
}
