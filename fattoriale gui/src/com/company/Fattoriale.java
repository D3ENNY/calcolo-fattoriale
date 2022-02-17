package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;

public class Fattoriale extends JFrame {
    private JButton CALCOLAButton;
    private JTextField fattorialeText;
    private JPanel mainPanel;
    private JLabel ris;
    private JLabel risultato2;
    final String html = "<html><body style='width: %1spx'>%1s";

    public Fattoriale(){

        ImageIcon image = new ImageIcon("fattoriale.png");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("Fattoriale!");
        setIconImage(image.getImage());
        setSize(700,700);
        setVisible(true);
        setLocationRelativeTo(null);
        risultato2.setSize(200,300);

        CALCOLAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fattoriale;
                String fat = fattorialeText.getText();
                fattoriale = calcoloFattoriale (fat);
                ris.setText("il fattoriale di "+fat+" è ");
                risultato2.setText(String.format(html, 200, fattoriale));
            }
        });

        }
    public String calcoloFattoriale(String data) {

        int fattoriale1 = 0;
        BigInteger fattoriale;

        try {
            fattoriale1 = Integer.parseInt(data);
        } catch (NumberFormatException e) {
            System.out.println("debug rirova");
            ris.setText("inserisci un numero!");
        }

        fattoriale = factorial(fattoriale1);

        data = String.valueOf(fattoriale);
        System.out.println("debug data "+data);
        System.out.println("debug fattoriale 1 " +fattoriale1);
        System.out.println("debug fattoriale " +fattoriale);
      //  System.out.println("SPEDCIAl "+ factorial(fattoriale1));

        return data;
    }

    static BigInteger factorial(int N)
    {
        //inizializzo il biginter
        BigInteger f = new BigInteger("1");


        for (int i = 2; i <= N; i++) {
            f = f.multiply(BigInteger.valueOf(i));
            System.out.println("debug f"+f);
        }

        return f;
    }

}

