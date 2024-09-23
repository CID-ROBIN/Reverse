/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.reverse;

/**
 *
 * @author Cid Corso
 */
public class MujString {
    
    private char[] array;
    private int length;

    public MujString() {
        length = 0;
        array = new char[length];
    }

    public void add(char... znaky) {
        if (znaky.length == 0) {
            return;
        }

        char[] novePole = new char[length + znaky.length];

        for (int i = 0; i < length; i++) {
            novePole[i] = array[i];
        }
        for (int i = 0; i < znaky.length; i++) {
            novePole[length + i] = znaky[i];
        }
        length += znaky.length;
        array = novePole;
    }

    public void reverse() {
        char[] novePole = new char[length];

        for (int i = 0; i < length; i++) {
            novePole[length - i - 1] = array[i];
        }
        array = novePole;
    }

    public int length() {
        return length;
    }

    public boolean startWith(char znak) {
        return array[0] == znak;
    }
    
    public void print() {
        for (char znak : array) {
            System.out.print(znak);
        }
        System.out.println();
    }
    
}
