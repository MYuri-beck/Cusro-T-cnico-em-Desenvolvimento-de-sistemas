
public class AnalisePost {

    public static void main(String args[]) {

        int likes_post[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int variacao_likes[] = new int[likes_post.length - 1]; // Criando o vetor para a dif

        //armazenando a diferença does likes nos post's
        for (int i = 0; i < variacao_likes.length; i++) {
            variacao_likes[i] = likes_post[i + 1] - likes_post[i];
        }

        //Maior post
        int maior_like = likes_post[0];
        int index_maior_post = 0;

        for (int j = 1; j < likes_post.length; j++) {
            if (likes_post[j] > maior_like) {
                maior_like = likes_post[j];   // maior valor de likes
                index_maior_post = j;         // índice do post
            }
        }

        int maior_dif = 0;
        for (int k = 0; k < variacao_likes.length; k++) {
            if (variacao_likes[k] > maior_dif) {
                maior_dif = variacao_likes[k];
            }
        }

        //Calculo de média    
        int soma = 0;
        double media;
        for (int like : likes_post) {
            soma += like;
        }

        media = (double) soma / likes_post.length;

        int qtde_acima = 0;

        for (int like : likes_post) {
            qtde_acima += (like > media) ? 1 : 0;
        }
        System.out.println("Índice do post com maior pico de engajamento: " + index_maior_post);
        System.out.println("Quantidade de posts acima da média: " + qtde_acima);

    }
}
