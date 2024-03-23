public class Main {
    public static void main(String[] args) {
        //TAREA 1
        System.out.println("TAREA1 -- Vamos a calcular el Valor Maximo y Valor Minimo de un Array :");
        int[] listNumber = {7, 13, 4, 20};
        int maximo = 0;
        int minimo;
        minimo = listNumber[0];

        for (int i = 0; i < listNumber.length; i++) {
            if (maximo < listNumber[i]) {
                maximo = listNumber[i];
            }
        }
        {
            System.out.println("Valor Maximo : " + maximo);
        }
        for (int i = 0; i < listNumber.length; i++) {
            if (minimo > listNumber[i]) {
                minimo = listNumber[i];
            }
        }
        {
            System.out.println("Valor Minimo : " + minimo);
        }
        int dif = (maximo - minimo);
        {
            System.out.println("Diferencia de Maximo y Minimo = " + dif);
        }


        //TAREA 2
        System.out.println("TAREA2 -- Vamos a calcular los dos Valores menores de un Array :");
        int[] listNumber1 = {3, 1, 5, 9};
        int minimo1;
        minimo1 = listNumber1[0];

        for (int i = 0; i < listNumber1.length; i++) {

            if (minimo1 > listNumber1[i]) {
                minimo1 = listNumber1[i];
            }
        }
        {
            System.out.println("Valor Menor : " + minimo1);
        }
        int minimo2;
        minimo2 = listNumber1[0];

        for (int i = 0; i < listNumber1.length; i++) {
            if (minimo1 > listNumber1[i]) {
                minimo1 = listNumber1[i];
            } else if (listNumber1[i] < minimo2 && listNumber1[i] != minimo1) {
                minimo2 = listNumber1[i];
            }
        }
        {
            System.out.println("Segundo Valor Menor : " + minimo2);
        }

        //TAREA 3
        System.out.println("TAREA 3 -- Vamos a calcular la formula x^2(4y/5-x)^2 :");
        int x = 2;
        int y = 3;
        double power = Math.pow(x,2);
        double power1 = Math.pow(4 * y / 5 - x,2);
        double result = (power * power1);
        {
            System.out.println("x^2(4y/5-x)^2 = " + result);
        }
    }
}