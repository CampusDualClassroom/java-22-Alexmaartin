package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("GKFFD");
        arrayList.add("TNANA");
        arrayList.add("MPMSL");
        arrayList.add("PSWME");
        arrayList.add("LZMLF");
        arrayList.add("JYEBV");
        arrayList.add("YELNT");
        arrayList.add("JSNKR");
        arrayList.add("JFESF");
        arrayList.add("TMJLL");
        return arrayList;
    }
    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Índice: " + i + ",Elemento: " + customList.get(i));
        }
    }
    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }
    public static void main(String[] args) {
        List<String> arrayList = createArrayList();

        System.out.println("Elementos en la lista original: ");
        printElementsAndIndex(arrayList);

        String newElement = "AAAAA";
        boolean added = addElementToList(arrayList, newElement);

        System.out.println("\n¿Elemento agregado a la lista? " + added);

        System.out.println("\nElementos en la lista después de agregar:");
        printElementsAndIndex(arrayList);
    }
}
