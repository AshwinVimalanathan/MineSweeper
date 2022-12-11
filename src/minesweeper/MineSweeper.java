/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ashwi
 */

public class MineSweeper extends JFrame{

    private JLabel statusbar;
    
    public MineSweeper(){
        initUI();
    }
    public void initUI(){
        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);

        add(new Board(statusbar));        
        
        setResizable(false);
        pack();
        
        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        EventQueue.invokeLater(() -> {
            MineSweeper game = new MineSweeper();
            game.setVisible(true);
        });
    }
    
}
