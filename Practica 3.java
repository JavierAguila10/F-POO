import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numint;
        double numdbl,res1, res2, res3, res4, res5, res6;
//Mensaje de bienvenida
        System.out.printf("Bienvenidos, favor de seguir las instrucciones\n");
//Documentar:
        Scanner scanner = new Scanner(System.in);
//Documentar:
        System.out.printf("\nDigite un número entero");
//Documentar:
        numint = scanner.nextInt();
        System.out.printf("\nDigite un número decimal");
        numdbl = scanner.nextDouble();
        //Documentar:

        res1 = numdbl + numint;
        res2 = numint / (int) numdbl;
        res3 = numint / numdbl;
        res4 = numdbl / numint;
        res5 = (double) (int) numdbl / numint;
        res6 = (int)numdbl + numint;
        System.out.printf("\nEl valor de la operación =" + res1);
        System.out.printf("\nEl valor de la operación =" + res2);
        System.out.printf("\nEl valor de la operación =" + res3);
        System.out.printf("\nEl valor de la operación =" + res4);
        System.out.printf("\nEl valor de la operación =" + res5);
        System.out.printf("\nEl valor de la operación =" + res6);
    }
}