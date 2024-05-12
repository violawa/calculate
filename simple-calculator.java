import javax.swing.*;

public class KalkulatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Bilangan Pertama:");
        label1.setBounds(20, 20, 120, 25);
        frame.add(label1);

        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 20, 120, 25);
        frame.add(textField1);

        JLabel label2 = new JLabel("Bilangan Kedua:");
        label2.setBounds(20, 50, 120, 25);
        frame.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 50, 120, 25);
        frame.add(textField2);

        JLabel label3 = new JLabel("Operasi:");
        label3.setBounds(20, 80, 120, 25);
        frame.add(label3);

        String[] operations = {"Penambahan (+)", "Pengurangan (-)", "Perkalian (*)", "Pembagian (/)"};
        JComboBox<String> comboBox = new JComboBox<>(operations);
        comboBox.setBounds(150, 80, 120, 25);
        frame.add(comboBox);

        JButton button = new JButton("Hitung");
        button.setBounds(100, 120, 100, 25);
        frame.add(button);

        JLabel label4 = new JLabel("Hasil:");
        label4.setBounds(20, 160, 120, 25);
        frame.add(label4);

        JTextField resultField = new JTextField();
        resultField.setBounds(150, 160, 120, 25);
        resultField.setEditable(false);
        frame.add(resultField);

        button.addActionListener(e -> {
            double bil1 = Double.parseDouble(textField1.getText());
            double bil2 = Double.parseDouble(textField2.getText());
            int selectedIndex = comboBox.getSelectedIndex();
            double result = 0;

            switch (selectedIndex) {
                case 0:
                    result = bil1 + bil2;
                    break;
                case 1:
                    result = bil1 - bil2;
                    break;
                case 2:
                    result = bil1 * bil2;
                    break;
                case 3:
                    if (bil2 != 0) {
                        result = bil1 / bil2;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Tidak bisa melakukan pembagian dengan nol.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }

            resultField.setText(Double.toString(result));
        });

        frame.setVisible(true);
    }
}
