package prisma;

import java.util.Scanner;

public class Prisma {
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
                System.out.println("\nO volume do prisma é de: "+volumePrisma());
                break;
            case 2:
                System.out.println("\nA altura do prisma é de: "+alturaPrisma());
                break;
            case 3:
                System.out.println("\nA área da base do prisma é de: "+areaBasePrisma());
                break;
            case 4:
                System.out.println("\nA área da base do prisma é de: "+areaBaseTotal());
                break;
            case 5:
                System.out.println("\nO número de faces do Prisma é de: "+numeroFaces());
            case 6:
                System.out.println("\nA área da face do prisma é de: "+areaFace());
                break;
            case 7:
                System.out.println("\nA área total do prisma é de: "+areaTotalPrisma());
                break;
            default: System.err.println("\nErro Favor selecionar as opções corretamente.");
                break;
        }
    }
    //1 - Volume
    public static double volumePrisma(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o valor da área da base: ");
        double Ab = ent.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double h = ent.nextDouble();
        return Ab*h;
    }
    //2 - Altura
    public static double alturaPrisma(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o valor do volume: ");
        double V = ent.nextDouble();
        System.out.print("Digite o valor da área da base: ");
        double Ab = ent.nextDouble();
        return V/Ab;
    }
    //3 - Área da base (pelo volume)
    public static double areaBasePrisma(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o valor do volume: ");
        double V = ent.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double h = ent.nextDouble();
        return V/h;
    }
    //4 - Área da base (pela área total)
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
    //5 - Número de faces
    public static double numeroFaces(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o número de vértices: ");
        double vertices = ent.nextDouble();
        System.out.print("Digite o número de arestas: ");
        double arestas = ent.nextDouble();
        return vertices - arestas - 2;
    }
    //6 - Área da face
    public static double areaFace(){
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite o valor da base: ");
        double b = ent.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double h = ent.nextDouble();
        System.out.print("Digite número de faces: ");
        double Nf = ent.nextDouble();
        return (b*h)*Nf;
    }
    //7 - Área total do prisma
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
