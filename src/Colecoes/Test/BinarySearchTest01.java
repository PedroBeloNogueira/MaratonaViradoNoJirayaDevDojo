package Colecoes.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        numeros.add(1);
        Collections.sort(numeros);
/*       binarySearch
    Funciona semelhante ao IndexOF porém mostra a posição onde o value ficaria no index
    Retornando: -"ponto de inserção" -1 ou ponto de inserção.
        Para que o binarySearch funcione corretamente é necessario a ordenação da lista

 */
        System.out.println(Collections.binarySearch(numeros, 4));




    }
}
