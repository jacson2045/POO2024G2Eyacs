/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.claseinterna;

/**
 *
 * @author Datos
 */
public class Principal {

    public static void main(String[] args) {
        Mama ma = new Mama();
        System.out.println(" La mama provee " + ma.alimento);
        Mama.Bebe bb = ma.new Bebe();
        System.out.println(" Su bebe tiene un peso " + bb.peso + "kg");
        System.out.println(" cambios en  mama bebe ");
    }

}
