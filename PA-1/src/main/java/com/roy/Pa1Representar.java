package com.roy;

import java.util.Arrays;

public class Pa1Representar {

    public static void main(String[] args){
        System.out.println();
        Representar();
    }

    public static  void Representar(){
        System.out.println("Representar numero de inscritos");

        int[] Inscritos = {28, 15, 34, 21, 19, 40, 12, 26};

        System.out.println("Inscritos: " + Arrays.toString(Inscritos));
        System.out.println("Numero de talleres: " + Inscritos.length);

        for (int i=0; i< Inscritos.length; i++){
            System.out.println("Indice " + i + "->" + Inscritos[i]);
        }
    }
}
