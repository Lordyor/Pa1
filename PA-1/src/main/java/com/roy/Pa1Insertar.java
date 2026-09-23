package com.roy;

public class Pa1Insertar {
    public static void main(String[] args) {
        Insertar();
    }

    public static void Insertar() {
        int[] Inscritos = {28, 15, 34, 21, 19, 40, 12, 26};

        int Posicion = 3;
        int NuevoValor = 50;

        int[] NuevaInscripcion = new int[Inscritos.length + 1];

        for (int i = 0; i < NuevaInscripcion.length; i++) {
            if (i < Posicion) {
                NuevaInscripcion[i] = Inscritos[i];
            } else if (i == Posicion) {
                NuevaInscripcion[i] = NuevoValor;
            } else {
                NuevaInscripcion[i] = Inscritos[i - 1];
            }
        }

        for (int i = 0; i < NuevaInscripcion.length; i++) {
            System.out.println("Indice " + i + ": " + NuevaInscripcion[i]);
        }
    }
}
