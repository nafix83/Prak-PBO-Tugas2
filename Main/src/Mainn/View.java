package Mainn;
//membuat gui untuk menghitung balok
import Ruang.Balok;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class View extends JFrame{
    //membuat gui untuk menghitung balok
    JLabel labelPanjang = new JLabel("Panjang: ");
    JLabel labelLebar = new JLabel("Lebar: ");
    JLabel labelTinggi = new JLabel("Tinggi: ");
    JLabel labelLuas = new JLabel("Luas: ");
    JLabel labelKeliling = new JLabel("Keliling: ");
    JLabel labelVolume = new JLabel("Volume: ");
    JLabel labelLuasPermukaan = new JLabel("Luas Permukaan: ");
    JLabel hasil = new JLabel("Result");
    //membuat label hasil
    JLabel labelHasilPermukaan = new JLabel("");
    JLabel labelHasilVolume = new JLabel("");
    JLabel labelHasilKeliling = new JLabel("");
    JLabel labelHasilLuas = new JLabel("");
    //membuat textfield
    JTextField textPanjang = new JTextField(30);
    JTextField textLebar = new JTextField(30);
    JTextField textTinggi = new JTextField(30);
   
    //membuat button
    JButton buttonHitung = new JButton("Hitung");
    JButton buttonReset = new JButton("Reset");

    //membuat event listener
    public View(){
        //membuat frame
        JFrame frame = new JFrame("Menghitung Balok");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 380);
        frame.setLayout(null);

        // BUTTON HITUNG
        buttonHitung.addActionListener(new ActionListener() { //action listener untuk button hitung
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil nilai dari textfield
                float panjang, lebar, tinggi;
                try{
                    panjang = Float.parseFloat(textPanjang.getText());
                    lebar = Float.parseFloat(textLebar.getText());
                    tinggi = Float.parseFloat(textTinggi.getText());
                    //membuat objek balok
                    Balok balok = new Balok(panjang, lebar, tinggi);
                   
                    // membuat label hasil
                    labelHasilLuas.setText("Luas: " + balok.luas());
                    labelHasilKeliling.setText("Keliling: " + balok.keliling());
                    labelHasilVolume.setText("Volume: " + balok.volume());
                    labelHasilPermukaan.setText("Luas Permukaan: " + balok.luasPermukaan());
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        // BUTTON RESET
        buttonReset.addActionListener(new ActionListener() { //action listener untuk button reset
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengosongkan textfield
                textPanjang.setText("");
                textLebar.setText("");
                textTinggi.setText("");
                labelHasilLuas.setText("");
                labelHasilKeliling.setText("");
                labelHasilVolume.setText(""); 
                labelHasilPermukaan.setText("");
                
            }
        });


        //menambahkan komponen ke frame

        
        frame.add(labelPanjang);
        frame.add(textPanjang);
        frame.add(labelLebar);
        frame.add(textLebar);
        frame.add(labelTinggi);
        frame.add(textTinggi);

     
        frame.add(labelHasilLuas);
        frame.add(labelHasilKeliling);
        frame.add(labelHasilVolume);
        frame.add(labelHasilPermukaan);
        
        frame.add(hasil);
        frame.add(buttonHitung);
        frame.add(buttonReset);


        //mengatur posisi komponen
        labelPanjang.setBounds(10, 10, 100, 20);
        textPanjang.setBounds(110, 10, 150, 20);
        labelLebar.setBounds(10, 40, 100, 20);
        textLebar.setBounds(110, 40, 150, 20);
        labelTinggi.setBounds(10, 70, 100, 20);
        textTinggi.setBounds(110, 70, 150, 20);
        
        hasil.setBounds(160,110,100,20);

        labelHasilLuas.setBounds(10, 130, 100, 20);
        labelHasilKeliling.setBounds(10, 150, 100, 20);
        labelHasilVolume.setBounds(10, 180, 100, 20);
        labelHasilPermukaan.setBounds(10, 200, 150, 20);
        
        buttonHitung.setBounds(70, 260, 100, 20);
        buttonReset.setBounds(180, 260, 100, 20);


        

        frame.setVisible(true);
    }
}