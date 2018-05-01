/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentrabajo;

/**
 *
 * @author Erick
 */
public class Examentrabajo {
    
    public void comprobarCadena(String cadena){
    char [] caracteres = cadena.toCharArray();
    int cont=1;
    for(int i=0;i<caracteres.length;i++){
           //System.out.println("posicion " + i + caracteres[i]);
        if(caracteres[i]>='a' && caracteres[i]<='z'){
            cont++;
        }
    }
         if(cont==27){
             System.out.println("felicidades, tienes todas las letras del alfabeto");
         }
         else{
             System.out.println("Sigue participando");
         }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Examentrabajo a = new Examentrabajo();
            a.comprobarCadena("abcdefgh ijklmnñopqrs tuvw xyz");
    }
    
}
