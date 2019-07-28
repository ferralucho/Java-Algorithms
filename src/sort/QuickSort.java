package sort;

/*
Se basa en la técnica divide y vencerás, que consiste en ir subdividiendo el array en arrays más pequeños, y ordenar éstos. Para hacer esta división, se toma un valor del array como pivote, y se mueven todos los
elementos menores que este pivote a su izquierda, y los mayores a su derecha. A continuación se aplica el mismo método a cada una de las dos partes en las que queda dividido el array.
Después de elegir el pivote se realizan dos búsquedas:
Una de izquierda a derecha, buscando un elemento mayor que el pivote
Otra de derecha a izquierda, buscando un elemento menor que el pivote.
Cuando se han encontrado los dos elementos anteriores, se intercambian, y se sigue realizando la búsqueda hasta que las dos búsquedas se encuentran.
Suponiendo que tomamos como pivote el primer elemento, el método Java Quicksort que implementa este algoritmo de ordenación para ordenar un array de enteros se presenta a continuación. Los parámetros izq y
der son el primer y último elemento del array a tratar en cada momento.
El método ordena un array A d eenteros desde la posición izq hasta la posición der. En la primera llamada recibirá los valores izq = 0, der = ELEMENTOS-1.

Los elementos iguales que el pivote (duplicados) van a una u otra partición, pero siempre a la misma.

En el peor caso, cuando el pivote es el elemento menor del array el tiempo de ejecución del método Quicksort es O(n2).
En general el tiempo medio de ejecución del Quicksort es O(n log n).

El proceso de selección consiste en, dado un vector de N elementos, encontrar el k-ésimo menor elemento.
Se puede resolver el problema de selección en tiempo lineal, en promedio.

El peor caso en la selección rápida se presenta cuando la llamada recursiva se realiza con un solo elemento menos.

La mediana de un grupo de N elementos es el [N/2]-ésimo menor elemento.

 */

public class QuickSort {
    private static void insertionSort(Comparable[] a, int low, int high) {
        for (int p = low + 1; p <= high; p++) {
            Comparable tmp = a[p];
            int j;
            for (j = p; j > low && tmp.lessThan(a[j - 1]); j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    /**
     * Quicksort algorithm.
     *
     * @param a an array of Comparable items.
     */
    public static void quicksort(Comparable[] a) {
        quicksort(a, 0, a.length - 1);
    }

    private static final int CUTOFF = 10;

    /**
     * Method to swap to elements in an array.
     *
     * @param a      an array of objects.
     * @param index1 the index of the first object.
     * @param index2 the index of the second object.
     */
    public static void swapReferences(Object[] a, int index1, int index2) {
        Object tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }
    /**
     * Internal quicksort method that makes recursive calls.
     * Uses median-of-three partitioning and a cutoff of 10.
     * @param a an array of Comparable items.
     * @param low the left-most index of the subarray.
     * @param high the right-most index of the subarray. */
    private static void quicksort( Comparable [ ] a, int low, int high ) {
        if( low + CUTOFF > high )
            insertionSort( a, low, high );
        else {
// Sort low, middle, high
            int middle = ( low + high ) / 2;
            if( a[ middle ].lessThan( a[ low ] ) )
                swapReferences( a, low, middle );
            if( a[ high ].lessThan( a[ low ] ) )
                swapReferences( a, low, high );
            if( a[ high ].lessThan( a[ middle ] ) )
                swapReferences( a, middle, high );
// Place pivot at position high - 1
            swapReferences( a, middle, high - 1 );
            Comparable pivot = a[ high - 1 ];
// Begin partitioning
            int i, j;
            for( i = low, j = high - 1; ; ) {
                while( a[ ++i ].lessThan( pivot ) );
                while( pivot.lessThan( a[ --j ] ) );
                if( i < j )
                    swapReferences( a, i, j );
                else
                    break;
            }
// Restore pivot
            swapReferences( a, i, high - 1 );
            quicksort( a, low, i - 1 ); // Sort small elements
            quicksort( a, i + 1, high ); // Sort large elements
        }
    }
}
