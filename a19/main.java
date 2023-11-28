import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class applet3 extends Applet implements ActionListener {
    TextField num1Field, num2Field;
    Button calculateButton;
    Label resultLabel;
    public void init() {
        num1Field = new TextField(10);
        num2Field = new TextField(10);
  
        calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);

        resultLabel = new Label("Sum will appear here");

        add(new Label("Enter Number 1:"));
        add(num1Field);
        add(new Label("Enter Number 2:"));
        add(num2Field);
        add(calculateButton);
        add(resultLabel);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int sum = num1 + num2;
            resultLabel.setText("Sum: " + sum);
        }  
    }  
} 