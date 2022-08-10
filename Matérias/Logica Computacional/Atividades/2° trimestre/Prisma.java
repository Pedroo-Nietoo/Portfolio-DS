import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Selecione uma opção para calcular:\n"
                + "1 - Volume;\n"
                + "2 - Altura;\n"
                + "3 - Área da base (pelo volume);\n"
                + "4 - Área da base (pela área total);\n"
                + "5 - Número de faces;\n"
                + "6 - Área da face;\n"
                + "7 - Área total.\n"
                + "-------------\n"
                + "R: ");
        
        int escolha = ent.nextInt();
        
        switch (escolha) {
            case 1:
                System.out.println();
                System.out.println("O volume do prisma é de: "+volumePrisma());
                break;
            case 2:
                System.out.println();
                System.out.println("A altura do prisma é de: "+alturaPrisma());
                break;
            case 3:
                System.out.println();
                System.out.println("A área da base do prisma é de: "+areaBasePrisma());
                break;
            case 4:
                System.out.println();
                System.out.println("A área da base do prisma é de: "+areaBaseTotal());
                break;
            case 5:
                System.out.println();
                System.out.println("O número de faces do Prisma é de: "+numeroFaces());
            case 6:
                System.out.println();
                System.out.println("A área da face do prisma é de: "+areaFace());
                break;
            case 7:
                System.out.println();
                System.out.println("A área total do prisma é de: "+areaTotalPrisma());
                break;
            default: System.err.println("Erro Favor selecionar as opções corretamente.");
                break;
        }
    }
    public static double volumePrisma(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o valor da área da base: ");
        double Ab = ent.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double h = ent.nextDouble();
        return Ab*h;
    }
    public static double alturaPrisma(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o valor do volume: ");
        double V = ent.nextDouble();
        System.out.print("Digite o valor da área da base: ");
        double Ab = ent.nextDouble();
        return V/Ab;
    }
    public static double areaBasePrisma(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o valor do volume: ");
        double V = ent.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double h = ent.nextDouble();
        return V/h;
    }
    public static double areaBaseTotal(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o valor da área total: ");
        double At = ent.nextDouble();
        System.out.print("Digite o valor do número de faces: ");
        double Nf = ent.nextDouble();
        System.out.print("Digite o valor da área da face: ");
        double Af = ent.nextDouble();
        return (At - Nf*Af)/2;
    }
    public static double numeroFaces(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o número de vértices: ");
        double vertices = ent.nextDouble();
        System.out.print("Digite o número de arestas: ");
        double arestas = ent.nextDouble();
        return vertices - arestas - 2;
    }
    public static double areaFace(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o valor da base: ");
        double b = ent.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double h = ent.nextDouble();
        return (b*h)*numeroFaces();
    }
    
    public static double areaTotalPrisma(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o valor da área da base: ");
        double Ab = ent.nextDouble();
        System.out.print("Digite o valor da número de faces: ");
        double Nf = ent.nextDouble();
        System.out.print("Digite o valor da área da face: ");
        double Af = ent.nextDouble();
        return 2*Ab + Nf*Af;
    }
}
