package seminarioexemplomoeda;

import java.util.Scanner;

public class SeminarioCodigo {

    public static void main(String[] args) {
        boolean continuar = true;
        Scanner teclado = new Scanner(System.in);

        MoedaChain cofre = new Moeda5();
        cofre.setNext(new Moeda10());
        cofre.setNext(new Moeda25());
        cofre.setNext(new Moeda50());

        try {
            while (continuar) {
                System.out.println("Selecione a moeda para inserir:\n1 - 5\n2 - 10\n3 - 25\n4 - 50");
                int tipoMoeda = teclado.nextInt();
                switch (tipoMoeda) {
                    case (1):
                        cofre.inserirMoeda(IdMoeda.Moeda5);
                        break;
                    case (2):
                        cofre.inserirMoeda(IdMoeda.Moeda10);
                        break;
                    case (3):
                        cofre.inserirMoeda(IdMoeda.Moeda25);
                        break;
                    case (4):
                        cofre.inserirMoeda(IdMoeda.Moeda50);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
                System.out.print("Deseja continuar inserindo moedas: S/N?");
                if (!"S".equals(teclado.next().toUpperCase())) {
                    continuar = false;
                }
            }
        } catch (Exception e) {
        }

        try {
            //cofre.resumoMoeda(IdMoeda.Moeda50);
            //cofre.fullResumo();
            
            System.out.println(cofre.totalArrecadacao());
        } catch (Exception e) {

        }
    }
}
