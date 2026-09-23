package com.roy;

public class Pa1Ordenar {
    public static void main(String[] args) {
        Ordenar();
    }

    public static void Ordenar(){
        int[] Inscritos = {28, 15, 34, 21, 19, 40, 12, 26};
        int temp = 0;

        for (int i = 0; i < Inscritos.length; i++ ){
            for (int j=i+1; j<Inscritos.length; j++){
                if (Inscritos[i] > Inscritos[j]){
                    temp = Inscritos[i];
                    Inscritos[i] = Inscritos[j];
                    Inscritos[j] = temp;
                }
            }
        }

        for (int inscription : Inscritos) {
            System.out.println(inscription + "");
        }
    }
}
