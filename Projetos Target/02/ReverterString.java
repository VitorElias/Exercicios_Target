import javax.swing.JOptionPane;

public class ReverterString {
    public static void main(String[] args) {
        String continuar;

        do {
            
            String original = JOptionPane.showInputDialog(null, "Digite uma string para inverter:");

            
            String invertida = inverterString(original);

        
            JOptionPane.showMessageDialog(null, "String original: " + original + "\nString invertida: " + invertida);

            continuar = JOptionPane.showInputDialog(null, "Continuar no programa? (Sim/Não)").toLowerCase();

        } while (!continuar.equals("não") && continuar.equals("sim") && !continuar.equals("nao"));

        JOptionPane.showMessageDialog(null, "Saindo do programa.");
    }

    public static String inverterString(String original) {
        
        char[] caracteres = original.toCharArray();

        
        for (int i = 0; i < caracteres.length / 2; i++) {

            char c = caracteres[i];

            caracteres[i] = caracteres[caracteres.length - i - 1];

            caracteres[caracteres.length - i - 1] = c;
        }

        
        return new String(caracteres);
    }
}
