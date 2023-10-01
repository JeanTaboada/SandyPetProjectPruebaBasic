import java.util.Scanner;

public class VeterinariaSandyPet{

public static void main(String args[]){

Scanner in = new Scanner(System.in);
String ID="", Password="", Descripcion="";
int Codigo=0, dato=0;

System.out.println("***************************");
System.out.println("*--VETERINARIA SANDY PET--*");
System.out.println("***************************");
System.out.println("");
System.out.print("Ingrese su ID y/o Usuario: ");
ID = in.nextLine();
<ZASA
System.out.print("Ingrese su Password: ");
Password = in.nextLine();  
                                                 

String JTABOADA="Jean Taboada", SPARI="Sandra Pari";

   if(ID.equalsIgnoreCase("JTABOADA")&&Password.equals("743816971007Jr")){
   System.out.println("Sesion Iniciada "+JTABOADA+"...");
   System.out.println("");
   System.out.println("Ingrese el Codigo Indenticador ");
   System.out.println("-------------------------------");
   System.out.println("1. Venta: ");
   System.out.println("2. Consulta: ");
   System.out.println("-------------------------------");
   Codigo = in.nextInt();  
   switch (Codigo){

     case 1:
     System.out.println("***************************");
     System.out.println("*-----VENTA SANDY PET-----*");
     System.out.println("***************************");
     System.out.println("");
     in.nextLine();
     System.out.println("Ingrese nombre del producto y monto: ");
     Descripcion = in.nextLine();
     System.out.println("---------CONTINUAR?------------");
     System.out.println("SI = 1");
     System.out.println("NO = 0");
     System.out.println("-------------------------------");
     dato = in.nextInt();
     for(int i=1;i==dato;i=1){
     in.nextLine();
     System.out.println("Ingrese nombre del producto y monto: ");
     Descripcion = in.nextLine();
     System.out.println("---------CONTINUAR?------------");
     System.out.println("SI = 1");
     System.out.println("NO = 0");
     System.out.println("-------------------------------");
     dato = in.nextInt();}
     break;
  
     case 2:
     System.out.println("***************************");
     System.out.println("*---CONSULTA SANDY PET----*");
     System.out.println("***************************");
     System.out.println("");
     in.nextLine();
     System.out.println("Ingrese su recetario de la consulta: ");
     Descripcion = in.nextLine();
     System.out.println("---------CONTINUAR?------------");
     System.out.println("SI = 1");
     System.out.println("NO = 0");
     System.out.println("-------------------------------");
     dato = in.nextInt();
     for(int i=1;i==dato;i=1){
     in.nextLine();
     System.out.println("Ingrese su recetario de la consulta: ");
     Descripcion = in.nextLine();
     System.out.println("---------CONTINUAR?------------");
     System.out.println("SI = 1");
     System.out.println("NO = 0");
     System.out.println("-------------------------------");
     dato = in.nextInt();}
     break;
     default:
     System.out.println("Codigo incorrecto, ingrese de nuevo o comuniquese con soporte...");  
   }}
   else if(ID.equalsIgnoreCase("SPARI")&&Password.equals("743816971007")){
   System.out.println("Sesion Iniciada "+SPARI+"...");
   }
   else{
   System.out.println("ID y/o Password incorrectos");
   }                                                                                                        
}
}