import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Soy la prueba típica");
        colegio();
        bucleDesc();
        padres();

        }

    public static void colegio() {
        /* vale para la pregunta necesito el Scanner
        CREA LA VARIABLE POR TU VIDA QUE LUEGO TE ESTRESAS
        con la variable ifelseo ¿mejor Switch? y sale la respuesta

         */

        System.out.println("Ejercicio 1: " + "\n");


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Por favor, introduce tu edad: ");
        int edad;
        edad = scanner.nextInt();

       if(edad < 6){
           System.err.println("No computa");
       } else if(edad <= 12){
            System.out.println("Estás en el Cole");
        } else if (edad <=18 ) {
           System.out.println("Estás en el Insti");
        }else if (edad <=25){
           System.out.println("Estás en la Uni");
       }else if (edad > 26 && edad < 100){
           System.out.println("Lamento tu destino, obrero");
       }else{
           System.err.println("No computa");
       }



        System.out.println("\n");
    }
    public static void bucleDesc() {

        /*bien, hay que ir de 20 a 10 y sobre cada uno hacer el cuadrado.
        forear hasta menos 10 (inclusive)
        incluir en el foreado la operanción
        OJO HAZ LA VARIABLE ANTES QUE TE PIERDES

        ¿? podría hacer un array ¿? o me complico la vida mucho; neh, a lo simple
         */

        System.out.println("Ejercicio 2: " + "\n");

        double numbers;
        for(int i = 20; i>= 10;i--){
            numbers = Math.sqrt(i);
            System.out.println(numbers);
        }
        System.out.println("\n");





    }
    public static void padres() {
        /* Necesito VARIABLES para los nombres y para las edades con sus preguntas
        y una formulilla de media
         */

        System.out.println("Ejercicio 3: " + "\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el nombre de pila de tu madre: ");
        String nameMom;
        nameMom = scanner.nextLine();

        System.out.println("Escribe el nombre de pila de tu padre: ");
        String nameDad = scanner.nextLine();

        System.out.println("Introduce la edad de tu madre: ");
        double ageMom = scanner.nextDouble();

        System.out.println("Introduce la edad de tu padre: ");
        double ageDad = scanner.nextDouble();

        double ageMedia = (ageMom + ageDad)/2;

        scanner.close();

        System.out.println("El nombre de tu madre es " + nameMom + ", el nombre de tu padre es " + nameDad +
                ", la edad de tu madre es " + ageMom + ", la edad de tu padre es " + ageDad +
                " y la media de sus edades es " + ageMedia);


        System.out.println("\n");
    }


}
