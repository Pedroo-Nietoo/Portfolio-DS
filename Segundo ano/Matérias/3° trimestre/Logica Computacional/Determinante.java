package novocalculardeterminantes;

import java.util.Scanner;

public class NovoCalcularDeterminantes {
    
    static int[][] numeros = new int[3][3];
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        numeros = new int[3][3];
            
            SolicitarValores();
                        
            System.out.println();
            print(numeros);
            
            calcDet(numeros);
            
            System.out.println();
            System.out.print("Deseja alterar algum número? [Y][N]\nR: ");
            
            String resposta = ent.next();
            alterar(resposta);
    }
    public static void SolicitarValores(){
        Scanner ent = new Scanner(System.in);
        System.out.print("Qual o tamanho da sua matriz?: ");
        int tamanho = ent.nextInt();
        numeros = new int[tamanho][tamanho]; //Array com o tamanho do usuário
        
        for(int a = 0; a < tamanho; a++){ //For para solicitar os valores da matriz
                for(int b = 0; b < tamanho; b++){
                    System.out.print("Digite o valor da posição ["+a+"]["+b+"]: ");
                    numeros[a][b] = ent.nextInt();
                    }
            }
    }
   public static void calcDet(int[][] matriz){
        int dp = 0;
        int ds = 0;
        int n = matriz[0].length;
        int colP = 0;
        int colS = n-1;
        for(int i = 0; i<n; i++){
            int diagonalP = 1;
            int diagonalS = 1;
             for (int linha = 0; linha < n; linha++) {
                 if(colP == n){
                     colP = 0;
                 }
                 else if(colP < 0){
                     colP = n-1;
                 }
                 if(colS == n){
                     colS = 0;
                 }
                 else if(colS < 0){
                     colS = n-1;
                 }
                 diagonalS *= matriz[linha][colS];
                 diagonalP *= matriz[linha][colP];
                 colP ++;
                 colS --;
             }
             ds += diagonalS;
             dp += diagonalP;
             colP --;
             colS ++;
        }
        int determinante = dp-ds;
        if(determinante < 0){
            determinante *=-1;
        }
        System.out.println("determinante: "+determinante);
    }
   
    public static int calcularDeterminante(){
        for(int diagonal = 0; diagonal < 3; diagonal++){
            for(int linha = 0; linha < 3; linha++){
                for(int coluna = 0; coluna < 3; coluna++){
                    //System.out.println("["+linha+"]["+coluna+"]");
                    //[0][0]*[1][1]*[2][2] + | linha == coluna
                    //[0][1]*[1][2]*[2][0] + | linha++ coluna (?)
                    //[0][2]*[1][0]*[2][1] | linha++ coluna(?)
                }
            }
        }
        
        int diagonalPrincipal = 
            numeros[0][0]*numeros[1][1]*numeros[2][2]+ 
            numeros[0][1]*numeros[1][2]*numeros[2][0]+
            numeros[0][2]*numeros[1][0]*numeros[2][1];
            
            int diagonalSecundaria = 
            numeros[0][2]*numeros[1][1]*numeros[2][0]+
            numeros[0][0]*numeros[1][2]*numeros[2][1]+
            numeros[0][1]*numeros[1][0]*numeros[2][2];
            
            int determinante = diagonalPrincipal-diagonalSecundaria;
            
            if(determinante < 0){
                return determinante = determinante * -1;
            }
            else{
                return determinante;
            }
    }
    public static void alterar(String resposta){
        Scanner ent = new Scanner(System.in);
        System.out.println();
        if(resposta.equals("Y") || resposta.equals("y")){
                System.out.print("Qual número deseja alterar?: ");
                int numeroQueroMudar = ent.nextInt();
                System.out.print("Por qual número deseja alterar?: ");
                int numeroVouMudarPor = ent.nextInt();               
                
            for(int a = 0; a < 3; a++){
                for(int b = 0; b < 3; b++){
                    if(numeros[a][b] == numeroQueroMudar){
                        numeros[a][b] = numeroVouMudarPor;
                    }
                }
            }
            System.out.println();
            print(numeros);
            System.out.println("O determinante é: "+calcularDeterminante());
        }
        else if(resposta.equals("N")){
            System.out.println("OK");
        }
        else{
            System.err.println("Favor selecionar uma opção válida");
        }
    }
    public static void print(int[][] numeros){
        String matriz = "Matriz:\n";
        for(int linha = 0; linha < 3; linha++){
                for(int coluna = 0; coluna < 3; coluna++){
                    matriz += numeros[linha][coluna]+" ";
                }
                matriz += "\n";
            }
        System.out.println(matriz);
    }
}
