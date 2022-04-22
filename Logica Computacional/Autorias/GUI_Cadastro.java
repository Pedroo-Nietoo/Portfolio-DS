import javax.swing.JOptionPane;

public class GUI_Cadastro{
    public static void main(String[] args){
        ///////////////////////////////////////////////////////////////////

        String nome = JOptionPane.showInputDialog(null, "Insira seu nome");
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade"));

        while(idade >= 100){
        JOptionPane.showMessageDialog(null, "Favor inserir uma idade válida");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade"));}
        
        ///////////////////////////////////////////////////////////////////

        if(idade <= 4){
            JOptionPane.showMessageDialog(null, "Você é... um bebê?!");}

        else if(idade <= 14){
            JOptionPane.showMessageDialog(null, "Você é uma criança, certo?");}

        else if(idade <= 18){
            JOptionPane.showMessageDialog(null, "Você é um adolescente, certo?");}

        else if(idade <=30){
            JOptionPane.showMessageDialog(null, "Você é um adulto, certo?");}

        else if(idade <=60){
            JOptionPane.showMessageDialog(null, "Você é um idoso, certo?");}
        ///////////////////////////////////////////////////////////////////

        Object[] options = { "Sim", "Não" };

        int confirm = JOptionPane.showOptionDialog(null, "Deseja confirmar o cadastro?", "Confirmação cadastral", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
        /////////////////////////////////////////////1//////////////////////

        switch(confirm){
            case 0: JOptionPane.showMessageDialog(null, "Parabéns, "+nome+"! Seu cadastro foi realizado com sucesso!");
            break;
            case 1: JOptionPane.showMessageDialog(null, "Entendido. Cadastro cancelado.");
            break;}
    }
}