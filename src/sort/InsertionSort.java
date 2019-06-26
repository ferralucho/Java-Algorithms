package sort;

/*
El algoritmo de ordenación por inserción es O(N2)
- Esta cota es alcanzable, ya que un vector de entrada de ordenación ordenado en orden inverso requiere un tiempo
cuadrático. Éste representa el peor caso. Ordenación Por Inserción Es un método simple apropiado para pocos elementos a ordenar.

- Si el vector de entrada ya viene ordenado, el tiempo de ejecución es O (N), ya que el test del bucle for más interno falla
inmediatamente. Éste representa el mejor caso.

Todo algoritmo que ordene mediante intercambio de elementos adyacentes requiere, en promedio, un tiempo Ω(N2)
El número medio de inversiones del vector de partida es N (N – 1 ) /4. Cada intercambio elimina exactamente una inversión,
por lo que el número de intercambios necesarios es Ω(N2).

Se observa que el número de inversiones del vector de partida es igual al número de veces que se ejecuta la línea a [ j ] = a [ j - 1 ]; Por lo tanto
si al principio del algoritmo tenemos I inversiones, debemos realizar I intercambios implícitos.
Se pueden calcular cotas precisas del tiempo de ejecución del caso medio del algoritmo de ordenación por inserción, calculando el número medio
de inversiones en el vector.

 */

 public class InsertionSort
{
    // ordenacionPorInsercion: ordena el vector a.
    private static void ordenacionPorInsercion ( Comparable [] a)
    {
        for ( int p = 1 ; p < a.length; p++ )
        {
            Comparable tmp = a [ p ];
            int j = p;
            for ( ; j > 0 && tmp.lessThan ( a [ j - 1 ]); j--)
                a [ j ] = a [ j - 1 ];
            a [ j ] = tmp;
        }
    }
}

