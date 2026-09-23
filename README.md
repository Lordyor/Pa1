# README — PA1: Algoritmos y Estructuras de Datos

> **Curso:** ALGORITMO Y ESTRUCTURA DE DATOS BASADOS EN INTELIGENCIA ARTIFICIAL
> **Código:**   4682
> **Evaluación:** PA1  

## 1. Integrantes


| Integrante | Rol |
|---|---|
| Roy Granados Aguilar | Desarrollo de la Actividad 1 y 2 | 
| Imanol Ponce de León | Desarrollo de la Actividad 3 y 4 |

## 2. Caso de trabajo

Una coordinación académica necesita organizar información de talleres estudiantiles. En esta primera
etapa del sistema se trabajará únicamente con estructuras lineales estáticas. El equipo debe proponer
una solución para registrar cantidades de inscritos, ordenar resultados, realizar consultas puntuales y
representar la distribución de estudiantes por aulas y horarios.

### Actividad 1 – Análisis del problema y selección de estructura

#### 1.1 Expliquen la diferencia entre estructura estática y estructura dinámica

La principal característica es que una estructura estática tiene un tamaño fijo que no puede cambiar durante la ejecución del programa, mientras que un dinámica se asigna automáticamente en tiempo de ejecución.

#### 1.2 Indiquen por qué, para esta primera etapa, resulta adecuado trabajar con arreglos y matrices

Por la propiedad de estar ordenados, cada elemento puede identificarse mediante una posición o índice.

#### 1.3 Relacionen los conceptos de dato, algoritmo y estructura de datos dentro de la solución que propone el equipo.

En este caso el dato sería la cantidad de inscritos. El algoritmo sería el proceso de registrar cantidades, ordenar resultados, realizar consultas y representar la distribución de estudiantes. Y la estructura de datos serían los arreglos estáticos.

---

### Actividad 2 – Modelado y operaciones con vectores

#### 2.1 Representación gráfica

```text
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
```

Cada elemento del vector se identifica mediante su posición o índice.

#### 2.2 Obtener el valor máximo y mínimo

El algoritmo comienza tomando el primer elemento como valor máximo y mínimo. Después recorre los demás elementos y realiza las comparaciones correspondientes.

##### Código Java

```text
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
```

**Resultado:**

```text
Mayor = 40
Menor = 12
```

#### 2.3 Insertar un nuevo valor

##### Código Java

```text
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
```


#### 2.4 Ordenamiento de menor a mayor

##### Código Java

```text
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
```

#### 2.5 Expliquen de forma sencilla el costo aproximado del ordenamiento en el mejor y peor caso.

En el mejor caso se haría el menor número de cambios, y en el peor caso se tendría que cambiar todo,lo que tardaría mucho más.

---

### Actividad 3  Matrices y recorrido completo de datos

#### 3.1 Representación de la matriz

```text
             H0  H1  H2  H3  H4
           ┌───┬───┬───┬───┬───┐
Aula 0     │25 │30 │28 │0  │20 │
Aula 1     │35 │0  │32 │30 │25 │
Aula 2     │20 │22 │0  │18 │24 │
Aula 3     │0  │28 │30 │25 │35 │
           └───┴───┴───┴───┴───┘
```

En Java:

```java
int[][] ocupacion = {
    {25, 30, 28, 0, 20},
    {35, 0, 32, 30, 25},
    {20, 22, 0, 18, 24},
    {0, 28, 30, 25, 35}
};
```

#### 3.2 Total de estudiantes por aula

##### Pseudocódigo

```text
INICIO

    PARA i ← 0 HASTA 3 HACER

        total ← 0

        PARA j ← 0 HASTA 4 HACER
            total ← total + ocupacion[i][j]
        FIN PARA

        MOSTRAR "Total Aula", i, ":", total

    FIN PARA

FIN
```

##### Código Java

```text
for (int i = 0; i < ocupacion.length; i++) {

    int total = 0;

    for (int j = 0; j < ocupacion[i].length; j++) {
        total += ocupacion[i][j];
    }

    System.out.println("Total Aula " + i + ": " + total);
}
```

**Resultados:**

```text
Aula 0 = 103
Aula 1 = 122
Aula 2 = 84
Aula 3 = 118
```

#### 3.3 Total de estudiantes por horario

##### Pseudocódigo

```text
INICIO

    PARA j ← 0 HASTA 4 HACER

        total ← 0

        PARA i ← 0 HASTA 3 HACER
            total ← total + ocupacion[i][j]
        FIN PARA

        MOSTRAR "Total Horario", j, ":", total

    FIN PARA

FIN
```

##### Código Java

```text
for (int j = 0; j < 5; j++) {

    int total = 0;

    for (int i = 0; i < 4; i++) {
        total += ocupacion[i][j];
    }

    System.out.println("Total Horario " + j + ": " + total);
}
```

**Resultados:**

```text
H0 = 80
H1 = 80
H2 = 90
H3 = 73
H4 = 104
```

#### 3.4 Celda con mayor ocupación

##### Pseudocódigo

```text
INICIO

    mayor ← ocupacion[0][0]
    filaMayor ← 0
    columnaMayor ← 0

    PARA i ← 0 HASTA 3 HACER

        PARA j ← 0 HASTA 4 HACER

            SI ocupacion[i][j] > mayor ENTONCES
                mayor ← ocupacion[i][j]
                filaMayor ← i
                columnaMayor ← j
            FIN SI

        FIN PARA

    FIN PARA

    MOSTRAR "Mayor ocupación:", mayor
    MOSTRAR "Aula:", filaMayor
    MOSTRAR "Horario:", columnaMayor

FIN
```

##### Código Java

```text
int mayor = ocupacion[0][0];
int filaMayor = 0;
int columnaMayor = 0;

for (int i = 0; i < ocupacion.length; i++) {

    for (int j = 0; j < ocupacion[i].length; j++) {

        if (ocupacion[i][j] > mayor) {
            mayor = ocupacion[i][j];
            filaMayor = i;
            columnaMayor = j;
        }
    }
}

System.out.println("Mayor ocupación: " + mayor);
System.out.println("Aula: " + filaMayor);
System.out.println("Horario: " + columnaMayor);
```

**Resultado:**

```text
Mayor ocupación = 35 estudiantes
Aula = 1
Horario = 0
```

#### 3.5 ¿Por qué es necesario recorrer varias posiciones?

Es necesario recorrer varias posiciones porque no conocemos previamente en qué celda se encuentra la mayor cantidad de estudiantes. Por eso se revisan las filas y columnas de la matriz y se compara cada valor con el mayor encontrado hasta ese momento.

---

### Actividad 4 – Matrices especiales y decisión técnica

La última actividad solicita definir una **matriz cuadrada** y una **matriz dispersa**, además de plantear un ejemplo académico de matriz dispersa.

#### 4.1 Matriz cuadrada

Una matriz cuadrada es aquella que tiene la misma cantidad de filas y columnas.

Ejemplo:

```text
        C0  C1  C2
      ┌───┬───┬───┐
F0    │ 5 │ 2 │ 8 │
      ├───┼───┼───┤
F1    │ 1 │ 4 │ 7 │
      ├───┼───┼───┤
F2    │ 3 │ 6 │ 9 │
      └───┴───┴───┘
```

Esta matriz es 3 × 3, por lo tanto es cuadrada.

#### 4.2 Matriz poco densa

Una matriz poco densa es aquella en la que la mayoría de sus posiciones contienen valores cero o no tienen información.

Ejemplo académico:

```text
             H0  H1  H2  H3  H4
           ┌───┬───┬───┬───┬───┐
Aula 0     │ 0 │ 0 │20 │ 0 │ 0 │
Aula 1     │ 0 │ 0 │ 0 │ 0 │15 │
Aula 2     │ 0 │ 0 │ 0 │ 0 │ 0 │
Aula 3     │25 │ 0 │ 0 │ 0 │ 0 │
           └───┴───┴───┴───┴───┘
```

En este caso, solo algunas combinaciones de aula y horario tienen estudiantes.

**Justificación:** Una matriz poco densa sería conveniente cuando existen muchas aulas y horarios, pero solo algunas combinaciones están ocupadas. Así se puede trabajar principalmente con las posiciones que contienen información y evitar almacenar una gran cantidad de valores cero.

---

## 3. Video de exposición

No se pudo realizar por falta de tiempo de ambos integrantes.
