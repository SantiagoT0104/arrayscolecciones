package Estaticas;

public class Ejercicio1{
    public static void main(String[] args) {
        
        //declarar array
        int [] vector1=new int[10];
        //llenar vector manualmente

        /*vector1[0]=30;
        vector1[1]=50;
        vector1[2]=25;
        vector1[3]=85;
        vector1[4]=12;
        vector1[5]=6;
        vector1[6]=32;
        vector1[7]=41;
        vector1[8]=23;
        vector1[9]=63;*/

        /*for(int p=0;p<vector1.length;p++){
            System.out.println("en la posicion"+p+"esta el valor"+vector1[p]);*/
            //5. ciclo para rellenar el array
            for(int p=0;p<vector1.length;p++){
                System.out.println("ingrese el valor de la posicion "+p);
                vector1[p]=leer.nextInt();
            }

            for(int dato:vector1){
                System.out.println("valores"+dato);

            }
            leer.close();

        }


    }
