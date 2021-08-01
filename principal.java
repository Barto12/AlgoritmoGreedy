package tecnicasresoluciondeproblemas;

import java.io.*;

class principal{

    public static void main(String[] args){

        int num=0;

        /*impresion en consola de las instrucciones*/

        System.out.println("\n\tImplementacion del algoritmo de Dijkstra");
        System.out.print("¿Numero de nodos que tiene el grafo a resolver? ");

        /*do while*/

        do{
            /*manejo de excepciones*/
            try{
                /*uso de inputstream reader para leer las entradas desde el teclado*/
                InputStreamReader l1 = new InputStreamReader(System.in);
                BufferedReader l2 = new BufferedReader(l1);
                /* uso de parse int para mostrar enteros*/
                num= Integer.parseInt(l2.readLine());
            }
            catch(IOException | NumberFormatException e){
                System.out.println("Error: "+e);
                System.out.println("Ingresa el numero de nodos que tiene el grafo a resolver: ");
            }
            /*con el if establecemos el rango de los nodos */
            if(num<3 || num>26)
                System.out.print(" * El numero de nodos debe estar entre 3 y 26 ");

        }while(num<3 || num>26);
        /*instanciamos el objeto dijkstra*/
        dijkstra obj = new dijkstra(num);
    }
}
