import java.util.Scanner;
public class Forca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] palavras = {"Java", "programacao", "desenvolvimento", "computador"};

        String palavraEscolhida = palavras[(int) (Math.random() * palavras.length)];
        char[] palavraOculta = new char[palavraEscolhida.length()];


        for (int i = 0; i < palavraOculta.length; i++) {
            palavraOculta[i] = '_';
        }
        int tentativasMaximas = 6;
        int tentativas = 0;

        System.out.println("Bem vindo ao meu jogo da forca!!!");
        while (tentativas < tentativasMaximas) {
            System.out.println("Palavra: " + new String(palavraOculta));

            System.out.println("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            boolean letraEncontrada = false;
            for (int i = 0; i < palavraEscolhida.length(); i++) {
                if (palavraEscolhida.charAt(i) == letra) {
                    palavraOculta[i] = letra;
                    letraEncontrada = true;
                }
            }
            if (new String(palavraOculta).equals(palavraEscolhida)) {
                System.out.println("Parabéns!! Você acertou a palavra: " + palavraEscolhida);
                break;
            }
            if (!letraEncontrada) {
                tentativas++;
                System.out.println("Letra incorreta. Tentativas restantes: " + (tentativasMaximas - tentativas));
            }

        }

        if (tentativas == tentativasMaximas) {
            System.out.println("Voce perdeu!! a palavra correta era: " + palavraEscolhida);
        }


        scanner.close();
    }
}
