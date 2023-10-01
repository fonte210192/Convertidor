import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "Peso Chilenos a Euros", "Peso Chilenos a Dólares", "Peso Chilenos a Libras Esterlinas", "Peso Chilenos a Yen",
                    "Peso Chilenos a Won" };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en Peso Chilenos: ");
            double pesoChil;
            try {
                pesoChil = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            if (choice.equals("Peso Chilenos a Dólares")) {
                double dollars = pesoChil / 810;
                JOptionPane.showMessageDialog(null,
                        pesoChil + " Peso Chilenos son " + FormatearDecimal.format(dollars) + " dólares.");
            } else if (choice.equals("Peso Chilenos a Euros")) {
                double euros = pesoChil / 910;
                JOptionPane.showMessageDialog(null, pesoChil + " Peso Chilenos son " + euros + " euros.");
            } else if (choice.equals("Peso Chilenos a Libras Esterlinas")) {
                double pounds = pesoChil / 1064;
                JOptionPane.showMessageDialog(null, pesoChil + " Peso Chilenos son " + pounds + " libras esterlinas.");
            } else if (choice.equals("Peso Chilenos a Yen")) {
                double yen = pesoChil / 586;
                JOptionPane.showMessageDialog(null, pesoChil + " Peso Chilenos son " + yen + " yenes japoneses.");
            } else if (choice.equals("Peso Chilenos a Won")) {
                double won = pesoChil / 0.0027;
                JOptionPane.showMessageDialog(null, pesoChil + " Peso Chilenos son " + won + " wones surcoreanos.");
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }

    }
}