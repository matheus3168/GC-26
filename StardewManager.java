import java.util.ArrayList;
import java.util.Scanner;

public class StardewManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new VacaMae(101, "Mimosa", "Holandesa", 7));
        animais.add(new GalinhaMae(102, "Giselda", "Caipira", 1));
        animais.add(new OvelhaMae(103, "Chiquinha", "Merino", 3));

        animais.add(new Bezerro(104, "Junior", "Holandesa", 1));
        animais.add(new Pintinho(105, "Piu", "Caipira", 1));
        animais.add(new Cordeiro(106, "Floquinho", "Merino", 1));

        int opcao;

        do {

            System.out.println();
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Ver animais do curral");
            System.out.println("2. Comercio (Coletar/Retirar produtos)");
            System.out.println("3. Sair");

            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    mostrarAnimais(animais);
                    break;

                case 2:
                    coletarProdutos(animais);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 3);

        scanner.close();
    }

    public static void mostrarAnimais(ArrayList<Animal> animais) {

        System.out.println();
        System.out.println("==========================================");
        System.out.println("             ANIMAIS NO CURRAL");
        System.out.println("==========================================");

        for (Animal animal : animais) {

            System.out.println();
            System.out.println("[ID: " + animal.getId() + "] "
                    + animal.getNome());

            System.out.println("- Raca: " + animal.getRaca());

            System.out.println("- Idade: "
                    + animal.getIdade()
                    + " | Status: "
                    + animal.getStatus());

            System.out.print("- Som: ");
            animal.emitirSom();
        }
    }

    public static void coletarProdutos(ArrayList<Animal> animais) {

        System.out.println();
        System.out.println("=== COLETA DE PRODUTOS ===");

        for (Animal animal : animais) {

            System.out.print(animal.getNome() + ": ");

            animal.coletarProduto();
        }
    }
}