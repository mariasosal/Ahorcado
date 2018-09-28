package ahorcadoo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Palabra {
    String unaPalabra;
    char letra[];
    String palabras[]={"robot","perro","nadar","madre"};
    void azar(){
    int x=(int) (Math.random()*5);
    unaPalabra=palabras[x];
    }
    void separar(){
        letra=unaPalabra.toCharArray();
    }
}
