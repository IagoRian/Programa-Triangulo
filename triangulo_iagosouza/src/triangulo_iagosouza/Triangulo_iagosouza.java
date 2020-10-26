/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo_iagosouza;
import java.util.Scanner;
/**
 *
 * @author Naja
 */
public class Triangulo_iagosouza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada;
        double a,b,c;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        a = entrada.nextDouble();
        
        System.out.print("Digite outro valor: ");
        b = entrada.nextDouble();
        
        System.out.print("Digite outro valor: ");
        c = entrada.nextDouble();
        
       
        if((a+b)>c && (a+c)>b && (b+c)>a ){
        System.out.println("Forma um Triângulo");}
        if((a==b) && (a==c) && (b==c)){
        System.out.println("Equilátero");}
        else if((a!=b) && (a!=c) && (b!=c)){
        System.out.println("Escaleno");}
        else if((a==b) && (a!=c) && (a==c) && (a!=b) || (b==c) && (b!=a)){
        System.out.println("Isósceles");}
        
        if((a==0) && (b==0) && (c==0)){
        System.out.println("Não forma um triângulo");
        }        
        
        
        
            
    }
        
}       
   
    

