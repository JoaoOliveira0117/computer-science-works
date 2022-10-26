import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Linguagem> linguagensDev2 = new ArrayList<Linguagem>();
        linguagensDev2.add(new Linguagem("Java", 0, 0));
        Programador dev2 = new Programador("IAOIAOI", "LUL", linguagensDev2);

        Scanner scan = new Scanner(System.in);
        ArrayList<Linguagem> linguagens = new ArrayList<Linguagem>();

        System.out.println("#############################\n");
        System.out.println("          BEM VINDO          \n");
        System.out.println("#############################\n\n");

        System.out.println("QUAL O SEU NOME?\n");
        String devNome = scan.nextLine();

        System.out.println("QUAL O SEU SOBRENOME?\n\n");
        String devSobrenome = scan.nextLine();

        Programador dev = new Programador(devNome, devSobrenome);

        System.out.println("QUANTAS LINGUAGENS DESEJA CADASTRAR? (MAX. 3)\n");
        int qnt = scan.nextInt();

        if (qnt > 3) {
            System.out.println("Número inválido\n");
            scan.close();
            return;
        }

        for(int i = 0; i < qnt; i++) {
            System.out.println("QUAL O NOME DA LINGUAGEM?\n");
            String nome = scan.next();
            System.out.println("QUANTO TEMPO DE EXPERIENCIA? (EM ANOS)\n");
            int exp = scan.nextInt();
            System.out.println("PREFERENCIA PARA TRABALHAR COM ELA? (EM NUMEROS)\n");
            int pref = scan.nextInt();

            Linguagem linguagem = new Linguagem(nome, exp, pref);
            linguagens.add(linguagem);
        }

        scan.close();
        dev.setLinguagens(linguagens);

        Comparar.programaPeloMesmoTempo(dev, dev2);
        return;
    }
}