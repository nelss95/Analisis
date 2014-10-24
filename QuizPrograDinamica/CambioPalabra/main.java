


import java.util.Scanner;

public class main
{
    public static void main ( String args[]) {
        System.out.println("PalabraA:");
        String PalabraA;
        Scanner entradaEscaner = new Scanner(System.in);
        PalabraA = entradaEscaner.next();
        System.out.println("PalabraB:");
        String PalabraB;
        Scanner entradaEscanerB = new Scanner(System.in);
        PalabraB = entradaEscanerB.next();
        CambioPalabra palabras = new CambioPalabra(PalabraA,PalabraB);
        int des = palabras.verificarPalabras( palabras.getPal1(), palabras.getPal2());
        System.out.println("Se necesitan: " + palabras.getContador() + "operaciones");


    }

}
