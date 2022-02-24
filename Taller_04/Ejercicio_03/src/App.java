import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        int flag=0;
        NumeroReal nr= new NumeroReal();
        int length=0;
        double[] lista;
        do {
            try {
                System.out.print("Ingrese la cantidad de elementos que desea en la lista: ");  
                length=Integer.parseInt(reader.readLine());   
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un valor válido");
            }
            if (length < 2) {
                System.out.println("Por favor, ingrese un valor válido");
            }
        } while (length < 2);
        lista=nr.GenerarArray(length);   

        while (flag!=3) {
            try {
                System.out.println("ORDENAR LISTA POR LOS SIGUIENTES METODOS");
                System.out.println("1. BubbleSort");
                System.out.println("2. QuickSort");
                System.out.println("3. Salir");
                System.out.println("Ingrese el tipo de ordenamiento que deseas hacer: ");
                flag = Integer.parseInt(reader.readLine());
            switch (flag) {
                case 1:
                    System.out.println("--BUBBLESORT--");
                    lista=nr.BubbleSort(lista,length);   
                    for (double d : lista) {
                        System.out.println(d);
                    }
                    System.out.println("------------------------\nArreglo BubbleSort ordenado exitosamente!\n------------------------");
                    break;
                case 2:
                    System.out.println("--QUICKSORT--");
                    lista=nr.QuickSort(lista,0,lista.length-1);  
                    for (double d : lista) {
                        System.out.println(d);
                    } 
                    System.out.println("------------------------\nArreglo QuickSort ordenado exitosamente!\n------------------------");
                break;
                case 3:
                System.out.println("Muchas gracias!");
                    break;
                default:
                System.out.println("Por favor, ingrese un dato válido.");
                    break;
            }
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un dato válido.");
            }
        }
    }
}
