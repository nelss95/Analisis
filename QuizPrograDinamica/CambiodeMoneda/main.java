import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] valores = {10000,5000,2000,1000,500,100,50,25,10,5};
        System.out.println("Saludos, por favor digite el monto para desglosarlo de la forma más optimizada Como estamos trabajando en colones el digito debe ser divisible entre 5. Gracias");
        System.out.println("Monto:");
        String entrada;
        Scanner entradaEscaner = new Scanner(System.in);
        entrada = entradaEscaner.next();
        int monto = Integer.parseInt(entrada);
        Cambio c = new Cambio(monto,valores );

        for (int i = 0; i < valores.length-1 ; i++) {
            System.out.println(valores[i] + " Colones:" + c.getVectorSeleccion()[i] );
        }



    }
}
