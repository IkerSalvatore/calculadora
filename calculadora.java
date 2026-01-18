import java.util.Scanner;
public class calculadora{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
    int opcion;
    double numero1, numero2, resultado;
    do {
        System.out.println("----- MENU -----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3 Multiplicar");
            System.out.println("Dividir .4");
            System.out.println("Iva .5");
            System.out.println("Salir .6");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();
        switch (opcion) { 
            case 1: 
            System.out.println("Escogiste Sumar");
            System.out.println("ingresa el primer número");
            numero1=leer.nextDouble();
            System.out.println("ingresa el segundo número");
            numero2=leer.nextDouble();
            resultado=numero1+numero2;
            System.out.println("El resultado es: " + resultado);
            break;
            case 2:
            System.out.println("Escogiste restar");
            System.out.println("ingresa el primer número");
            numero1=leer.nextDouble();
            System.out.println("ingresa el segundo número");
            numero2=leer.nextDouble();
            resultado=numero1-numero2;
            System.out.println("El resultado es: " + resultado);
            break;
            case 3:
            System.out.println("Escogiste multiplicar");
            System.out.println("ingresa el primer número");
            numero1=leer.nextDouble();
            System.out.println("ingresa el segundo número");
            numero2=leer.nextDouble();
            resultado=numero1*numero2;
            System.out.println("El resultado es: " + resultado);
            break;
            case 4:
            System.out.println("Escogiste dividir");
            System.out.println("ingresa el primer número");
            numero1=leer.nextDouble();
            System.out.println("ingresa el segundo número");
            numero2=leer.nextDouble();
            resultado=numero1/numero2;
            System.out.println("El resultado es: " + resultado);
            break;
            case 5:
            System.out.println("Escogiste iva");
            System.out.println("ingresa el valor");
            numero1=leer.nextDouble();
            resultado=numero1*.16;
            System.out.println("el resultado es: " + resultado);
            break;
            default: System.out.println("opcion Inválida ");
            break;
          }
        }while(opcion !=6);
      }
    }