package GroupProject;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;

public class CB extends JFrame {

    private JLabel vehiclePriceLabel, downPaymentLabel, taxRateLabel, aprLabel, loanTermLabel, monthlyPaymentLabel, monthlyPaymentOutput, endingLine;
    private JTextField vehiclePriceInput, downPaymentInput, taxRateInput, aprInput;
    private JComboBox loanTermInput;
    private JButton calculateButton, clearButton;

    public CB() {
        create();
        addComponents();
        addActions();
        display();
    }

    private void create() {
        vehiclePriceLabel = new JLabel ("Vehicle Price: ");
        downPaymentLabel = new JLabel ("Down Payment: ");
        taxRateLabel = new JLabel ("Tax Rate (%): ");
        aprLabel = new JLabel ("APR (%): ");
        loanTermLabel = new JLabel ("Loan Term (Months): ");
        monthlyPaymentLabel = new JLabel ("Your Monthly Payment is: ");
        monthlyPaymentOutput = new JLabel ("");
        endingLine = new JLabel("'This is an Estimated your car payment'");

        vehiclePriceInput = new JTextField(10);
        downPaymentInput = new JTextField(10);
        taxRateInput = new JTextField(10);
        aprInput = new JTextField(10);
        String [] loanTerms = {"Select a Term", "12 Months", "24 Months", "36 Months", "48 Months", "60 Months", "72 Months", "84 Months", "96 Months"};
        loanTermInput = new JComboBox(loanTerms);

        calculateButton = new JButton ("Calculate Monthly Payment!");
        clearButton = new JButton ("Clear");
    }

    private void addComponents() {
        GridLayout g = new GridLayout (8, 1);
        this.setLayout(g);

        JPanel temp = new JPanel();
        temp.add(vehiclePriceLabel);
        temp.add(vehiclePriceInput);
        this.add(temp);

        temp = new JPanel();
        temp.add(downPaymentLabel);
        temp.add(downPaymentInput);
        this.add(temp);

        temp = new JPanel();
        temp.add(taxRateLabel);
        temp.add(taxRateInput);
        this.add(temp);

        temp = new JPanel();
        temp.add(aprLabel);
        temp.add(aprInput);
        this.add(temp);

        temp = new JPanel();
        temp.add(loanTermLabel);
        temp.add(loanTermInput);
        this.add(temp);

        temp = new JPanel();
        temp.add(calculateButton);
        temp.add(clearButton);
        this.add(temp);

        temp = new JPanel();
        temp.add(monthlyPaymentLabel);
        temp.add(monthlyPaymentOutput);
        this.add(temp);

        temp = new JPanel();
        temp.add(endingLine);
        this.add(temp);
    }


    private void addActions() {
        calculateButton.addActionListener((ActionEvent ae) -> calculateMonthlyPayment(ae));
        clearButton.addActionListener((ActionEvent ae) -> clearCalculator(ae));
    }

    private void calculateMonthlyPayment (ActionEvent ae) {
        String vehiclePriceString = vehiclePriceInput.getText();
        String downPaymentString = downPaymentInput.getText();
        String taxRateString = taxRateInput.getText();
        String aprString = aprInput.getText();
        String loanTermInputString = loanTermInput.getSelectedItem().toString();
        double vehiclePriceDouble = Double.parseDouble(vehiclePriceString);
        double downPaymentDouble = Double.parseDouble(downPaymentString);
        double taxRateDouble = Double.parseDouble(taxRateString)/100;
        double aprDouble = Double.parseDouble(aprString)/100;
        double loanTermInputDouble =  Double.parseDouble(loanTermInputString.replaceAll("[^0-9]", ""));
        double numerator = (aprDouble/12)*(((vehiclePriceDouble)*(1+taxRateDouble))-downPaymentDouble);
        double denominator = (1-Math.pow(1+(aprDouble/12), -1*loanTermInputDouble)) ;
        double monthlyPaymentValue = numerator/denominator;
        DecimalFormat df = new DecimalFormat ("#.##");
        monthlyPaymentOutput.setText("$" + df.format(monthlyPaymentValue));
    }

    private void clearCalculator(ActionEvent ae) {
        vehiclePriceInput.setText("");
        downPaymentInput.setText("");
        taxRateInput.setText("");
        aprInput.setText("");
        loanTermInput.setSelectedIndex(0);
        monthlyPaymentOutput.setText("");
    }

    private void display() {
        setTitle("Car Payment Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 300);
        setVisible(true);
    }

    public static void main (String args[]) {
        new CB();
    }

} 