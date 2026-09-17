package Colecoes.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayConvertorTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        //CONVERTER LISTAS PARA ARRAY

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("------------");
        //converterArrayParaLista

        Integer[] arrayToList = new Integer[3];
        arrayToList[0] = 1;
        arrayToList[1] = 2;
        arrayToList[2] = 3;

        System.out.println("Array: "+Arrays.toString(arrayToList));

        List<Integer> listconvertor = new ArrayList<>(Arrays.asList(arrayToList));
        System.out.println("List: "+listconvertor);

    }
}
