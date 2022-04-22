import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Soluções{
    public static void main(String[] args){
        DecimalFormat fT = new DecimalFormat("0.000");
        DecimalFormat fTp = new DecimalFormat("0.00");
        DecimalFormat fX = new DecimalFormat("0.0");
        
        Object[] options = { "Sim", "Não" };
        int inicio = JOptionPane.showOptionDialog(null, "Deseja realizar uma operação?", "Início", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if(inicio == 0){
            do{

        String escolha = JOptionPane.showInputDialog(null, "Selecione a fórmula que deseja utilizar: \n\nConcentração Comum (C) \nTítulo (T) \nMolaridade (Mr) \nFração molar (X) \nMolalidade (W)", "Seleção", JOptionPane.INFORMATION_MESSAGE);

        //Concentração Comum (C) ///////////////////////////////////////////////////////////////////////////////
        if(escolha.equals("Concentração Comum") || escolha.equals("C")){
            double m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'm1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
            double V = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'V' em litros", "Inserção", JOptionPane.INFORMATION_MESSAGE));
            double C = m1/V;
            JOptionPane.showMessageDialog(null, "O valor da concentração comum é: "+C+" g/L", "Resultado", JOptionPane.INFORMATION_MESSAGE);}
        ///////////////////////////////////////////////////////////////////////////////////////////////////////



        //Título (T e T%) ///////////////////////////////////////////////////////////////////////////////
        if(escolha.equals("Título") || escolha.equals("T")){
            double m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'm1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
            double m2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'm2'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
            double T = m1/(m1+m2);
            double Tp = T*100;
            JOptionPane.showMessageDialog(null, "O valor do título é: "+fT.format(T)+" \nO valor do título em porcentagem é: "+fTp.format(Tp)+"%", "Resultado", JOptionPane.INFORMATION_MESSAGE);}
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        //Molaridade (Mr) ///////////////////////////////////////////////////////////////////////////////
        if(escolha.equals("Molaridade") || escolha.equals("Mr")){
            String escolhaMr = JOptionPane.showInputDialog(null, "Selecione a fórmula que deseja utilizar: \nFórmula 1: n1/V \nFórmula 2: m1/M1*V", "Seleção", JOptionPane.INFORMATION_MESSAGE);

            if(escolhaMr.equals("Fórmula 1") || escolhaMr.equals("1") || escolhaMr.equals("n1/V")){
                double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'n1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                double V = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'V' em litros", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                double Mr1 = n1/V;
                JOptionPane.showMessageDialog(null, "O valor da molaridade é: "+fT.format(Mr1)+" mol/L", "Resultado", JOptionPane.INFORMATION_MESSAGE);}

            else if(escolhaMr.equals("Fórmula 2") || escolhaMr.equals("2") || escolhaMr.equals("m1/M1*V")){
                double m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'm1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                double M1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'M1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                double V = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'V' em litros", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                double Mr2 = m1/(M1*V);
                JOptionPane.showMessageDialog(null, "O valor da molaridade é: "+fT.format(Mr2)+" mol/L", "Resultado", JOptionPane.INFORMATION_MESSAGE);}}
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////



        //Fração molar do soluto e do solvente (X1 e X2) ///////////////////////////////////////////////////////////////////////////////
        if(escolha.equals("Fração molar") || escolha.equals("X")){
            String fração = JOptionPane.showInputDialog(null, "Selecione o tipo de fração molar que deseja calcular: \nFração molar do soluto (X1) \nFração molar do solvente (X2)", "Seleção", JOptionPane.INFORMATION_MESSAGE);

            if(fração.equals("Fração molar do soluto") || fração.equals("X1")){
                String escolhaX1 = JOptionPane.showInputDialog(null, "Selecione a fórmula que deseja utilizar: \nFórmula 1: n1/n \nFórmula 2: m1/M1 / m1/M1 + m2/M2", "Seleção", JOptionPane.INFORMATION_MESSAGE);

                if(escolhaX1.equals("Fórmula 1") || escolhaX1.equals("1") || escolhaX1.equals("n1/n")){
                    double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'n1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'n2'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double X1a = n1/(n1+n2);
                    JOptionPane.showMessageDialog(null, "O valor da fração molar do soluto é: "+X1a, "Resultado", JOptionPane.INFORMATION_MESSAGE);}
                
                else if(escolhaX1.equals("Fórmula 2") || escolhaX1.equals("2") || escolhaX1.equals("m1/M1 / m1/M1 + m2/M2")){
                    double m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'm1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double M1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'M1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double m2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'm2'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double M2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'M2'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double X1b = (m1/M1)/((m1/M1)+(m2/M2));
                    JOptionPane.showMessageDialog(null, "O valor da fração molar do soluto é: "+X1b, "Resultado", JOptionPane.INFORMATION_MESSAGE);}}

            else if(fração.equals("Fração molar do solvente") || fração.equals("X2")){
                String escolhaX2 = JOptionPane.showInputDialog(null, "Selecione a fórmula que deseja utilizar: \nFórmula 1: n2/n \nFórmula 2: m2/M2 / m1/M1 + m2/M2", "Seleção", JOptionPane.INFORMATION_MESSAGE);

                if(escolhaX2.equals("Fórmula 1") || escolhaX2.equals("1") || escolhaX2.equals("n2/n")){
                    double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'n1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'n2'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double X2a = n2/(n1+n2);
                    JOptionPane.showMessageDialog(null, "O valor da fração molar do soluto é: "+X2a, "Resultado", JOptionPane.INFORMATION_MESSAGE);}

                else if(escolhaX2.equals("Fórmula 2") || escolhaX2.equals("2") || escolhaX2.equals("m2/M2 / m1/M1 + m2/M2")){
                    double m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'm1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double M1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'M1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double m2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'm2'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double M2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'M2'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                    double X2b = (m2/M2)/((m1/M1)+(m2/M2));
                    JOptionPane.showMessageDialog(null, "O valor da fração molar do soluto é: "+X2b, "Resultado", JOptionPane.INFORMATION_MESSAGE);}}}
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        //Molalidade (W) //////////////////////////////////////////////////////////////////////////////////////         
        if(escolha.equals("Molalidade") || escolha.equals("W")){
            String escolhaW = JOptionPane.showInputDialog(null, "Selecione a fórmula que deseja utilizar: \nFórmula 1: n1/m2 \nFórmula 2: m1/M1*m2", "Seleção", JOptionPane.INFORMATION_MESSAGE);

            if(escolhaW.equals("Fórmula 1") || escolhaW.equals("1") || escolhaW.equals("n1/m2")){
                double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'n1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                double m2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'm2'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                double W_1 = n1/m2;
                JOptionPane.showMessageDialog(null, "O valor da fração molar do soluto é: "+W_1+" mol/Kg", "Resultado", JOptionPane.INFORMATION_MESSAGE);}   
    
            else if(escolhaW.equals("Fórmula 2") || escolhaW.equals("2") || escolhaW.equals("m1/M1*m2")){
                double m1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'm1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                double M1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'M1'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                double m2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de 'm2'", "Inserção", JOptionPane.INFORMATION_MESSAGE));
                double W_2 = m1/(M1*m2);
                JOptionPane.showMessageDialog(null, "O valor da fração molar do soluto é: "+W_2+" mol/Kg", "Resultado", JOptionPane.INFORMATION_MESSAGE);}}
        ///////////////////////////////////////////////////////////////////////////////////////////////////

        inicio = JOptionPane.showOptionDialog(null, "Deseja realizar outra operação?", "Início", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        }while(inicio == 0);}

        else if(inicio == 1){
            JOptionPane.showMessageDialog(null, "Entendido. Operação cancelada.", "Cancelamento", JOptionPane.ERROR_MESSAGE); 

        }
    }
}