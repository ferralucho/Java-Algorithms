package sort;

/*
Es un algoritmo divide y vencerás que ofrece una mejor cota. Consta de3 pasos:
1. Si el número de elementos es 0 o 1 , acabar.
2. Ordenar recursivamente las dos mitades del vector.
3. Mezclar las dos mitades ordenadas en un vector ordenado.
Este algoritmo es 0 (N log N ) debido a que la mezcla ordenada de los dos vectores ordenados puede realizarse en tiempo lineal.

Mezcla lineal de Vectores ordenados
- El algoritmo se apoya en 3 contadores.
- En cada paso el menor de los valores se copia en el vector de salida.
- Cuando uno de los vectores de entrada se acaba, el resto del otro vector se copia en el vector de salida.
- El tiempo necesario para la mezcla lineal es de 0(N).

Su funcionamiento es similar al Quicksort, y está basado en la técnica divide y vencerás.
De forma resumida el funcionamiento del método MergeSort es el siguiente:
- Si la longitud del array es menor o igual a 1 entonces ya está ordenado.
- El array a ordenar se divide en dos mitades de tamaño similar.
- Cada mitad se ordena de forma recursiva aplicando el método MergeSort.
- A continuación las dos mitades ya ordenadas se mezclan formando una secuencia ordenada.

El método ordena un array A de enteros desde la posición izq hasta la posición der. En la primera
llamada al método recibirá los valores izq = 0, der = ELEMENTOS-1.
Primero se calcula el elemento central m. A continuación la primera parte del array, desde izq hasta m y
la segunda parte del array, desde m+1 hasta der, se mezclan mediante llamadas recursivas al método
mergesort.
La recursión termina cuando izq == der, es decir, cuando un subarray contiene solamente un elemento.
La operación principal de mezcla la realiza el método merge.

QuickSort y MergeSort requieren un trabajo adicional (mezcla y partición).
Quicksort y MergeSort utilizan ambos recursión.
El tiempo necesario para la mezcla lineal es de O(N) y QuickSort es de 0(N log N).
 */

public class MergeSort {

    public static void mergesort(int A[],int izq, int der){
        if (izq<der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);
            merge(A,izq, m, der);
        }
    }

    public static void merge(int A[],int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length]; //array auxiliar
        for (i=izq; i<=der; i++) //copia ambas mitades en el array auxiliar
            B[i]=A[i];
        i=izq; j=m+1; k=izq;
        while (i<=m && j<=der) //copia el siguiente elemento más grande
            if (B[i]<=B[j])
                A[k++]=B[i++];
            else
                A[k++]=B[j++];
        while (i<=m) //copia los elementos que quedan de la
            A[k++]=B[i++]; //primera mitad (si los hay)
    }
}
