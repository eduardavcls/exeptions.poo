import java.util.Scanner;
public class Lista03_ex2_ex3 {

    public class MenuUsuario {
        //exercício 2 e 3 juntos
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao = 0;
    
            while (true) {
                System.out.println("Menu:");
                System.out.println("1 - Listar nomes");
                System.out.println("2 - Outra opção");
                System.out.println("3 - Sair");
                System.out.print("Escolha uma opção: ");
    
                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();
                    scanner.nextLine(); 
    
                    switch (opcao) {
                        case 1:
                            listarNomes(scanner);
                            break;
                        case 2:
                            System.out.println("Outra opção selecionada.");
                            break;
                        case 3:
                            System.out.println("Saindo...");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                } else {
                    System.out.println("Opção inválida. Por favor, insira um número de 1 a 3.");
                    scanner.nextLine();
                }
            }
        }
    
        private static void listarNomes(Scanner scanner) {
            String[] nomes = {"Lucas", "Enzo", "Eloisa"};
            System.out.println("Nomes disponíveis:");
            for (int i = 0; i < nomes.length; i++) {
                System.out.println(i + " - " + nomes[i]);
            }
            System.out.print("Escolha a opção desejada: ");
    
            if (scanner.hasNextInt()) {
                int indice = scanner.nextInt();
                if (indice >= 0  && indice < nomes.length) {
                    System.out.println("Você escolheu: " + nomes[indice]);
                } else {
                    System.out.println("Opção inexistente. Tente novamente.");
                }
            } else {
                System.out.println("Opção inválida. Por favor, insira um número de 1 a 3.");
                scanner.nextLine(); 
            }
        }
    }

}
