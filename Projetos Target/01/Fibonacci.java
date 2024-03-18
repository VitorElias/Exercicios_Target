import javax.swing.JOptionPane;

public class Fibonacci {
    public static void main(String[] args) {
        String continuar;

        do {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para verificar se está na sequência de Fibonacci:"));
        
            boolean pertence = fib(numero);

            if (pertence) {
                JOptionPane.showMessageDialog(null, numero + " pertence à sequência de Fibonacci.");
            } else {
                JOptionPane.showMessageDialog(null, numero + " não pertence à sequência de Fibonacci.");
            }

            continuar = JOptionPane.showInputDialog(null, "Continuar no programa? (Sim/Não)").toLowerCase();
        } while (!continuar.equals("não") && continuar.equals("sim") && !continuar.equals("nao"));

        JOptionPane.showMessageDialog(null, "Saindo do programa.");
    }

    public static boolean fib(int numero) {
        if(numero == 0 || numero == 1) {
            return true;
        }
        
        int um = 0;
        int dois = 1;
        
        while (dois < numero) {
            int proximo = um + dois;
            um = dois;
            dois = proximo;
        }

        return dois == numero;
    }
}