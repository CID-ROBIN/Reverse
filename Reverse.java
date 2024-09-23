/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.reverse;

/**
 *
 * @author Cid Corso
 */
public class Reverse {

    public static void main(String[] args) {
        
        MujString string = new MujString();

        string.add('a', 'h', 'o', 'j');
        string.add(' ');
        string.add();
        string.add('s', 'v', 'e', 't', 'e');
        
        string.print();
        string.reverse();
        string.print();

        
        
        
    }
}
