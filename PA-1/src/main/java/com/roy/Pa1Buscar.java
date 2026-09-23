package com.roy;

public class Pa1Buscar {
    public static void main(String[] args){
        System.out.println();
        Buscar();
    }

    public static  void Buscar(){
        int[] Inscritos = {28, 15, 34, 21, 19, 40, 12, 26};

        int mayor = Inscritos[0];
        for(int i = 0; i < Inscritos.length; i++){
            if(Inscritos[i] > mayor)
            {
                mayor = Inscritos[i];
            }
        }
        System.out.println(mayor);

        int menor = Inscritos[0];
        for (int i = 0; i < Inscritos.length; i++){
            if ( Inscritos[i] < menor)
            {
                menor = Inscritos[i];
            }
        }
        System.out.println(menor);
    }
}
