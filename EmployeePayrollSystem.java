package employeepayrollsystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeePayrollSystem extends JFrame implements ActionListener {

    // Declare Swing components
    JLabel nameLabel, hoursLabel, rateLabel, resultLabel;
    JTextField nameTextField, hoursTextField, rateTextField;
    JButton calculateButton;

    public EmployeePayrollSystem() {
        // Set up the frame
        setTitle("Employee Payroll System");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Use absolute positioning

        // Initialize components
        nameLabel = new JLabel("Employee Name:");
        hoursLabel = new JLabel("Hours Worked:");
        rateLabel = new JLabel("Hourly Rate:");
        resultLabel = new JLabel("");

        nameTextField = new JTextField();
        hoursTextField = new JTextField();
        rateTextField = new JTextField();

        calculateButton = new JButton("Calculate Payroll");

        // Set component positions and sizes
        nameLabel.setBounds(20, 20, 150, 20);
        nameTextField.setBounds(180, 20, 150, 20);

        hoursLabel.setBounds(20, 50, 150, 20);
        hoursTextField.setBounds(180, 50, 150, 20);

        rateLabel.setBounds(20, 80, 150, 20);
        rateTextField.setBounds(180, 80, 150, 20);

        calculateButton.setBounds(120, 110, 150, 30);

        resultLabel.setBounds(20, 150, 400, 20);

        // Add components to the frame
        add(nameLabel);
        add(nameTextField);
        add(hoursLabel);
        add(hoursTextField);
        add(rateLabel);
        add(rateTextField);
        add(calculateButton);
        add(resultLabel);

        // Add action listener to the button
        calculateButton.addActionListener(this);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            calculatePayroll();
        }
    }

    private void calculatePayroll() {
        try {
            String name = nameTextField.getText();
            double hours = Double.parseDouble(hoursTextField.getText());
            double rate = Double.parseDouble(rateTextField.getText());

            double payroll = hours * rate;

            resultLabel.setText("Payroll for " + name + ": $" + payroll);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new EmployeePayrollSystem();
    }
}
