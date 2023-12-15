package travelplanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TravelPlanner extends JFrame {

    private JLabel promptLabel;
    private JTextField paragraphField;
    private JButton countButton;
    private JLabel resultLabel;

    public TravelPlanner() {
        setTitle("Word Counter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        promptLabel = new JLabel("Enter a paragraph:");
        paragraphField = new JTextField(28);
        countButton = new JButton("Count Words");
        resultLabel = new JLabel();

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String paragraph = paragraphField.getText();
                int wordCount = countWords(paragraph);
                resultLabel.setText("Word count: " + wordCount);
            }
        });

        panel.add(promptLabel);
        panel.add(paragraphField);
        panel.add(countButton);

        add(panel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);
    }

    private int countWords(String paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            return 0;
        }
        String[] words = paragraph.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TravelPlanner().setVisible(true);
            }
        });
    }
}
