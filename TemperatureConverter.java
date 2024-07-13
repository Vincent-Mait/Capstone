package Capstone;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class TemperatureConverter {

    // Declare the GUI Elements
    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JTextField textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JLabel img;
    public static ImageIcon tempImg;
    public static JLabel lblKelvin;
    public static JTextField textKelvin;
    public static JButton btnCalculateKtoF;
    public static JButton btnCalculateCtoF;
    public static JButton btnCalculateFtoC;
    public static JButton btnCalculateFtoK;
    public static JButton btnCalculateKtoC;
    public static JButton btnCalculateCtoK;
    public static JButton btnClear;

    public static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args)
    {
        tempImg = new ImageIcon(TemperatureConverter.class.getResource("img.png"));
        img = new JLabel(tempImg);
        img.setBounds(0, 0, tempImg.getIconWidth(), tempImg.getIconHeight());
        // Set up the frame
        frmMain = new JFrame("Temperature Converter");
        frmMain.setSize(tempImg.getIconWidth(), tempImg.getIconHeight());
        frmMain.setLayout(null);

        // Create GUI Elements
        lblCelsius = new JLabel("Celsius:");
        lblCelsius.setBounds(400, 125, 80, 20);
        textCelsius = new JTextField(10);
        textCelsius.setBounds(450, 125, 100, 20);
        lblKelvin = new JLabel("Kelvin:");
        lblKelvin.setBounds(225, 125, 80, 20);
        textKelvin = new JTextField(10);
        textKelvin.setBounds(275, 125, 100, 20);
        btnCalculateKtoF = new JButton("Convert K to F");
        btnCalculateKtoF.setBounds(20, 45, 180, 30);
        // Add ActionListener
        btnCalculateKtoF.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                // Convert K to F
                                String kText = textKelvin.getText();
                                double k = Double.parseDouble(kText);
                                double f = (k - 273.15) * 9 / 5 + 32;
                                textFahrenheit.setText(df.format(f));
                            }
                        }
                );

        btnCalculateFtoK = new JButton("Convert F to K");
        btnCalculateFtoK.setBounds(20, 10, 180, 30);
        // Add ActionListener
        btnCalculateFtoK.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                // Convert F to K
                                String fText = textFahrenheit.getText();
                                double f = Double.parseDouble(fText);
                                double k = (f - 32) * 5 / 9 + 273.15;
                                textKelvin.setText(df.format(k));
                            }
                        }
                );

        lblFahrenheit = new JLabel("Fahrenheit:");
        lblFahrenheit.setBounds(575, 125, 80, 20);
        textFahrenheit = new JTextField(10);
        textFahrenheit.setBounds(650, 125, 100, 20);
        btnCalculateCtoF = new JButton("Convert C to F");
        btnCalculateCtoF.setBounds(20, 80, 180, 30);
        // Add ActionListener
        btnCalculateCtoF.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                // Convert C to F
                                String cText = textCelsius.getText();
                                double c = Double.parseDouble(cText);
                                double f = (c * 9 / 5) + 32;
                                textFahrenheit.setText(df.format(f));
                            }
                        }
                );

        btnCalculateFtoC = new JButton("Convert F to C");
        btnCalculateFtoC.setBounds(20, 120, 180, 30);
        // Add ActionListener
        btnCalculateFtoC.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                // Convert F to C
                                String fText = textFahrenheit.getText();
                                double f = Double.parseDouble(fText);
                                double c = (f - 32) * 5 / 9;
                                textCelsius.setText(df.format(c));
                            }
                        }
                );

        btnCalculateKtoC = new JButton("Convert K to C");
        btnCalculateKtoC.setBounds(750, 60, 180, 30);
        // Add ActionListener
        btnCalculateKtoC.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                // Convert K to C
                                String kText = textKelvin.getText();
                                double k = Double.parseDouble(kText);
                                double c = k - 273.15;
                                textCelsius.setText(df.format(c));
                            }
                        }
                );

        btnCalculateCtoK = new JButton("Convert C to K");
        btnCalculateCtoK.setBounds(750, 20, 180, 30);
        // Add ActionListener
        btnCalculateCtoK.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                // Convert K to C
                                String cText = textCelsius.getText();
                                double c = Double.parseDouble(cText);
                                double k = c + 273.15;
                                textKelvin.setText(df.format(k));
                            }
                        }
                );

        btnClear = new JButton("Clear");
        btnClear.setBounds(400,160,100,30);
        btnClear.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                textCelsius.setText("");
                                textFahrenheit.setText("");
                                textKelvin.setText("");
                            }
                        }

                );

        // Add the GUI Elements to the frame

        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);
        frmMain.add(lblFahrenheit);
        frmMain.add(textFahrenheit);
        frmMain.add(lblKelvin);
        frmMain.add(textKelvin);
        frmMain.add(btnCalculateKtoF);
        frmMain.add(btnCalculateFtoK);
        frmMain.add(btnCalculateCtoF);
        frmMain.add(btnCalculateFtoC);
        frmMain.add(btnCalculateKtoC);
        frmMain.add(btnCalculateCtoK);
        frmMain.add(btnClear);
        frmMain.add(img);

        // Make the frame visible
        frmMain.setVisible(true);
    }
}

