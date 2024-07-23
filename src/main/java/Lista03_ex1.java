import java.util.Scanner;

public class Lista03_ex1 {
     public class DivisaoDeDoisNumeros{

        public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
            
            try {
                System.out.print("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();
                
                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();
                
                int resultado = divisao( numero1 , numero2);
                System.out.println("O resultado da divisão é: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir por zero.");
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número válido.");
            } finally {
                scanner.close();
            }
        }
        
        public static int divisao(int x, int y) throws ArithmeticException {
            if (y == 0) {
                throw new ArithmeticException("Divisão por zero.");
            }
            return x / y;
        }
    }

}

