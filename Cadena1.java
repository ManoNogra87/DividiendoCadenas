//solicitar el ingreso de cualquier texto, luego le preguntamos que conjunto de caracteres desea optene 
// el programa le mostrata el conjunto que el usuario solicito

//importamos la librery para la captura de datos por pantalla
import java.util.Scanner;

//Creamos un clase inicial
public class Cadena1{
 //creamos el metodo main
 public static void main(String args[]){
 //creamos las variable a utilizar 
 String Cadena_original = "", cadena_sub =" ";
 int num_caracteres = 0, desde = 0, hasta = 0;

 //creamos el objeto con el cual vamos a carpturar los datos ingresados 
 Scanner in = new Scanner(System.in);

  //solicitamos la cadena de caracteres base
 System.out.print("Introduce una cadena de caracteres: ");

 //pasamos este resultado a una variable "nextLine es para cadenas" 
 Cadena_original = in.nextLine();  

 //identificamos la cantidad de caracteres tiene la cadean ingresada
  num_caracteres = Cadena_original.length();

 //Indicamos la cadena ingresada y la cantidad de caracteres que la componen
 System.out.print("La cadena es "+Cadena_original + " y tiene "+num_caracteres+ "");

//Solicitamos desde donde quiere que se realice el corte
 System.out.print("Desde que caracter desea obtener la nueva cadena? ");

 //pasamos esta informacion a una variable  "nextInt es para capturar numeros"
  desde = in.nextInt();
   
 //Solicitamos hasta que caracter desea obtener la nueva cadena
 System.out.print("Hata que caracter desea la nueva cadena? ");

 //paramos esta dato a una variable
  hasta = in.nextInt();
 
 //realizamos validacion sobre la variable hasta
 if (num_caracteres >= hasta && num_caracteres >= desde){

  //Realizamos el corte de la cadena original bajo los rangos de caracteres indicados por el usuario
  cadena_sub = Cadena_original.substring(desde, hasta);
  //retornamos al usuario la nueva cadena
  System.out.println("La nueva cadena es: "+ cadena_sub+ "");
  } else {
     System.out.print("La cantidad de caracteres solicitados no esta dentro del rango de los existentes");
  }
 }
}