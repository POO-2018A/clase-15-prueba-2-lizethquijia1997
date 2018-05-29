/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

 import java.util.Scanner;
/**
 *
 * @author ESFOT
 */
public class Principal {

  
   
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    
    Materias [] materia = new Materias[2];
    
       
   
    for(int i =0; i<2; i++){
        
   System.out.println("\t\nINFORMACIÓN ESTUDIANTES");
    System.out.print("Ingrese el nombre edle estudiante:");
    String nombre = scan.nextLine();
         
    System.out.print("Ingrese la edad del estudiante:");
 
     int edad = scan.nextInt();   
    
      /*System.out.print("Ingrese el nombre de la primera materia:");
scan.nextLine();
      String materia1 = scan.nextLine();
      
      System.out.print("Ingrese el nivel de la primera materia:");

     int nivel1 = scan.nextInt();

 System.out.print("Ingrese el nombre de la segunda materia:");
 scan.nextLine();
 String materia2 = scan.nextLine();
 
 
 System.out.print("Ingrese el nivel de la segunda materia:");

     int nivel2 = scan.nextInt();*/
  
     // System.out.print("\nSe ha ingresado el estudiante con los siguientes datos:"+"\n"+"Nombre:"+nombre+"\n"+"Edad:"+edad+"\nMaterias:"+"\n"+materia1+"-"+nivel1+"nivel"+"\n"+materia2+"-"+nivel2+"nivel");      
    for(int j = 0 ; j< materia.length ; j++){
         
       System.out.print("ingresar el nombre de la materia :");     
        String materia1 = scan.nextLine();
        
       System.out.print("Ingrese el nivel de la  materia:");
       int nivel1 = scan.nextInt(); 
 
       
       System.out.print(""+(j+1)+".");
     }
  
     
     System.out.print("\nSe ha ingresado el estudiante con los siguientes datos:"+"\n"+"Nombre:"+nombre+"\n"+"Edad:"+edad+"\nMaterias:");      
    scan.nextLine();
     Estudiantes estudiante = new Estudiantes(nombre ,edad);
 
    Materias m = new Materias();
 
    }
  
    
    }
    
        
    }
    

