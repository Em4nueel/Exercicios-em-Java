import java.util.Scanner;
import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        
        //ABERTURA DA CLASSE "Scanner.sc" PARA RECEBER DADOS
        //TODA CLASSE "Scanner.sc" NECESSITA DE UMA ABERTURA E UM FECHAMENTO
        // "Locale.US" PARA CONFIGURAR O CODIGO COM "." (EX: 10.00) CASO A MAQUINA ESTEJA CONFIGURADA EM PTBR
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); // COMANDO DE ENTRADA DE DADOS

        // VARIÁVEIS DO TIPO DOUBLE RECEBEM OS ARGUMENTOS EM LARGURA, COMPRIMENTO E
        // ABAIXO DECLARO AS VARIÁVEIS E NA MESMA LINHA REALIZO A LEITURA COM O "sc.nextDouble();"
        // TAMBÉM PODERIA DECLARAR AS VARIÁVEIS E APÓS ISSO REZLIAR A LEITURA
        // EX: double largura, comprimento;
        // largura = sc.nextDoUBLE(); E REPETE COM VARIÁVEL "COMPRIMENTO" E OUTRAS
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        // VARIAVEIS AREA E PREÇO UTILIZANDO A MULTIPLICAÇÃO EM "*"
        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        // COMANDO DE SAÍDA DE DADOS SEMELHANTE AO "PRINTF" NA LINGUAGEM C
        // "println" SEGUE O TEXTO NA MESMA LINHA ENQUANTO O "printf" QUEBRA A LINHA
        System.out.println("AREA = " + area);
        System.out.println("PRECO = " + preco);

        sc.close();

    }
}
