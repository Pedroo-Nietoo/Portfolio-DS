import javax.swing.JOptionPane;

public class Array {

    public static void main(String[] args) {
       //String[] nomes = new String[3];
       //nomes[0] = "Javackson";
       //nomes[1] = "javana";
       //nomes[2] = "Mc Rosinha";
       //String[] palavras = {"Lata", "nacaoubunto", "vivaJava"};
       //JOptionPane.showMessageDialog(null, nomes[0]+" "+palavras[2]);
       //String[][] simou = new String[3][3];

       int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho!"));
       String[] vishnu = new String[tamanho];
       int pos = 0;
       while(pos < tamanho){
           vishnu[pos] = JOptionPane.showInputDialog("Digite a palavra da posição "+pos);
           pos++;
       }
       pos = 0;
       String resultado = "";
       while(pos < tamanho){
           resultado += vishnu[pos]+" ";
           pos++;
       }
       JOptionPane.showMessageDialog(null, resultado);
    }
    
}
