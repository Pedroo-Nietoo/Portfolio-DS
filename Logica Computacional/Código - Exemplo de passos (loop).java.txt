import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite o número que deseja contar: ");
        int passos = ent.nextInt();
        int c = 0;

        while(c <= passos){
        System.out.println(c);
        c++;
        }
    }
}

//import java.util.Scanner;
//public class Main{
//    public static void main(String[]args){
//        Scanner ent = new Scanner(System.in);

//        System.out.print("Digite o valor para se contar até ele: ");
//        int v = ent.nextInt();
//        for(int i = 0; i <= v; i++){
//       System.out.println(i);
//        }
//    }
//}