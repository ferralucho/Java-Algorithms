package sort;

/*
Consideraciones de Shellsort  Uno de los intervalos debe ser 1. En general es el último intervalo y en este caso el algoritmo es idéntico a la
ordenación por inserción.
- Lo expuesto anteriormente garantiza que el vector se ordene correctamente.
- Shell sugirió empezar con un intervalo N/2, luego dividir por la mitad hasta llegar a 1. Ejemplo: N=12, inrecrementos 5,3,1.
Su objetivo es evitar gran cantidad de movimientos de datos.
Su tiempo de ejecución depende en gran medida de la secuencia de incrementos elegida.


 */

    public class ShellSort {
        /** Shellsort, utilizando la secuencia sugerida por Gonnet.
         * divide por 2.2 en vez de 2. */
        public static void shellsort ( Comparable [ ] a) {
            for ( int intervalo = a.length / 2; intervalo > 0;
                  intervalo = intervalo == 2 ? 1 : (int) (intervalo / 2.2) )
                for ( int i = intervalo; i < a.length; i++ ) {
                    Comparable temp = a [ i ];
                    int j = i;
                    for ( ; j >= intervalo && temp.lessThan ( a [ j - intervalo] );
                          j -= intervalo)
                        a [ j ] = a [ j - intervalo ];
                    a [ j ] = temp ;
                }
        }
    }

