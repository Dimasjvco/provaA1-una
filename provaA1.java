import java.util.Scanner;
public class anoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();
        String resultado = (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) ? "bissexto" : "não bissexto";
        System.out.println(ano + " é " + resultado + ".");
        scanner.close();
    }
}
