/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beasiswa;

// ANDINI PAPA SULIMA 
//123240118
// IF-D

import beasiswa.view.BeasiswaView;
import javax.swing.SwingUtilities;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new BeasiswaView().setVisible(true);
        });
    }
    
    
}
