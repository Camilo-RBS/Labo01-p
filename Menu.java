import java.util.*;

public class Menu {
    public void menu() {
        Calculator calculator=new Calculator();

        Scanner sc = new Scanner(System.in);
    int option=0;
        System.out.println("Elija una de las opciones");
        System.out.println("%n1. Suma%n2. Resta%n3. Multiplicacion%4. Division");
         option =sc.nextInt();

        double N1 = 0;
        double N2=0;
        System.out.println("Ingrese su primer numero");
        N1 =sc.nextDouble();
        System.out.println("Ingrese su Segundo numero");
        N2 =sc.nextDouble();
        seleccion(option,N1,N2);
    }

    public void seleccion (int option,double a,double b){
        switch (option) {

            case 1:
            System.out.println("Su respuesta es:"+calculator.suma(a,b));
            break;
            case 2:
                System.out.println("Su respuesta es:"+calculator.resta(a,b));
                break;
            case 3:
                System.out.println("Su respuesta es:"+calculator.multiplicacion(a,b));
                break;
            case 4:
                System.out.println("Su respuesta es:"+calculator.division(a,b));
                break;
            default:
            case 1:
                System.out.println("Error");
                break;
        }
    }

}

