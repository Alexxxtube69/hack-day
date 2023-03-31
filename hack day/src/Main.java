import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        Scanner lector = new Scanner(System.in);

do {


    menu();
    opc = lector.nextInt();
    switch (opc) {


        case 1:
            jugar();
            break;


        case 2:
            salir();
            break;


        default:
            System.out.println("opc incorrecta");

            break;

    }

}
while (opc != 0);

    }

    private static void salir(  ) {

        System.out.println("Gracias por la visita");
        System.out.println("INS PLA 1DAM");


    }

    private static void jugar( ) {
        String user;
        int opc1 = 0;
        int opc2 = 0;
        int opc3 = 0;
        Scanner lec = new Scanner(System.in);

        System.out.println("Escribe un nombre: ");
        user = lec.nextLine();

        do {
            pregunta1();
            opc1 = lec.nextInt();
        }
         while (opc1 !=2);

         do {
             pregunta2();
             opc2 = lec.nextInt();
         }
         while (opc2 !=1);


         do {
                 pregunta3();
                 opc3 = lec.nextInt();
             }
         while (opc3!=3);


        System.out.println("Hola "+user+" Este es el codigo: "+opc1+opc2+opc3);

    }



    private static void pregunta3() {
        System.out.println("======PREGUNTAS=======");
        System.out.println("Que significa las iniciales de CPU?");
        System.out.println("1-unidada controlada de procemamientos");
        System.out.println("2-Unidad central de retencion ");
        System.out.println("3-Unidad Central de Procesamiento"); //V
        System.out.println("Cual es tu respuesta?: ");



    }

    private static void pregunta2() {

        System.out.println("======PREGUNTAS=======");
        System.out.println("Cual es el numero 69 en binario?");
        System.out.println("1-1000101"); //ESTA ES LA V
        System.out.println("2-1000110");
        System.out.println("3-111101");
        System.out.println("Cual es tu respuesta?: ");

    }

    private static void pregunta1() {
        System.out.println("======PREGUNTAS=======");
        System.out.println("Que es una IP?");
        System.out.println("1-Numero de modelo de PC");
        System.out.println("2-Un numero de direccion de red");
        System.out.println("3-Codigo que identifica a un dispositivo "); //V
        System.out.println("Cual es tu respuesta?: ");
    }

    private static void menu() {
        System.out.println("HACK DAY");
        System.out.println("==============");
        System.out.println("=====MENU=====");
        System.out.println("-1-JUGAR");
        System.out.println("-2-SALIR");
        System.out.println("==============");
        System.out.println("==============");
        System.out.println("Elije una opcion:");
    }
}