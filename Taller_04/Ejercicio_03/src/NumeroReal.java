


public class NumeroReal {

    /**
     * Constructor de objetos de la clase Real_Number sin ningún atributo
     * especificado.
     */
    public NumeroReal() {
    }

    public double[] GenerarArray(int length){
        double[] lista= new double[length];
        for (int i = 0; i < lista.length; i++) {
            lista[i]=Math.random()*100;
        }
        return lista;
    }

    public double[] BubbleSort(double lista[], int length) {
        /**
         * Variables que representan los índices del arreglo que se desea
         * ordenar, y el nuevo arreglo ordanado.
         */
        int i=length - 1;
        /**
         * Ciclo que permite ejecutar el método hasta que todo el arreglo se
         * encuentre ordenado de forma ascendente.
         */
        while (i > 0) {
            int index = 0;
            /**
             * ciclo for que recorre el arreglo que se desea ordenar desde la
             * primera a la última posición.
             */
            for (int j = 0; j < i; j++) {
                /**
                 * Condicional que valida si el valor siguiente del arreglo es
                 * menor que el valor presente.
                 */
                if (lista[j + 1] < lista[j]) {
                    /**
                     * Variable auxiliar que permite el almacenamiento del valor
                     * presente si este es mayor que el valor siguiente.
                     */
                    double aux = lista[j];
                    /**
                     * Actualización del valor presente con el valor siguiente
                     * siendo que este es menor.
                     */
                    lista[j] = lista[j + 1];
                    /**
                     * Actualización del valor siguiente con la variable
                     * auxiliar siendo que este es mayor.
                     */
                    lista[j + 1] = aux;
                    /**
                     * Almacenamiento del índice de la posición presente.
                     */
                    index = j;
                }
            }
            /**
             * Actualización de la variable i para que el ciclo while termine.
             */
            i = index;
        }
        /**
         * Retorno del arreglo ordenado mediante el método búrbuja.
         */
        return lista;
    }

    
    public double[] QuickSort(double[] array, int primero, int ultimo) {
        /**
         * Variable de tipo entero que almacena la primera posición del arreglo
         * desde donde se desea ordenar.
         */
        int i = primero;
        /**
         * Variable de tipo entero que almacena la última posición del arreglo
         * hasta donde se desea ordenar.
         */
        int j = ultimo;
        /**
         * Variable que almacenara el índice central de la porción del arreglo o
         * de todo el arreglo que se desea ordenar.
         */
        int central = (primero + ultimo) / 2;
        /**
         * Variable que almacena el valor de tipo double de la posición central
         * del arreglo.
         */
        double pivote= array[central];
        /**
         * Ciclo do-while que opera mientras que la posición incial sea menor o
         * igual que la posición final en la iteración del proceso de
         * ordenamiento.
         */
        do {
            /**
             * Ciclo while que incrementa el índice i y actualiza el primer
             * indice de ordenamiento mientras que el valor del arreglo sea
             * menor que el valor del pivote.
             */
            while (array[i] < pivote) {
                i++;
            }
            /**
             * Ciclo while que decrementa el índice j y actualiza el último
             * índice de ordenamiento mientras que el valor del arreglo sea
             * mayor que el pivote.
             */
            while (array[j] > pivote) {
                j--;
            }
            /**
             * Condicional que evalúa si el indice i es menor o igual que el
             * índice j, es decir verifica que el último índice de ordenamiento
             * sea mayor que el primer índice de ordenamiento.
             */
            if (i <= j) {
                /**
                 * Varible temporal que almacena el valor actualizado del primer
                 * índice de ordenamiento.
                 */
                double tmp= array[i];
                /**
                 * Intercambio de los valores del arreglo del primer índice con
                 * el último.
                 */
                array[i] = array[j];
                array[j] = tmp;
                /**
                 * Incremento y decremento de los valores de los índices i y j.
                 */
                i++;
                j--;
            }
        } while (i <= j);
        /**
         * Condicional que evalúa si el valor ingresado al método como primer
         * índice es igual al índice j.
         */
        if (primero < j) {
            /**
             * Llamada del método Quicksort con actualización del último índice
             * de ordenamiento.
             */
            QuickSort(array, primero, j);
        }
        /**
         * Condicional que evalúa si el valor ingresado al método como último
         * índice es igual al índice j.
         */
        if (i < ultimo) {
            /**
             * Llamada del método Quicksort con actualización del primer índice
             * de ordenamiento.
             */
            QuickSort(array, i, ultimo);
        }
        /**
         * Retorno del arreglo ordenado mediante método Quicksort.
         */
        return array;
    }
}
