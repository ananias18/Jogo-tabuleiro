import java.util.Scanner;
public class Main {

    static int[][] tabuleiro;
    static int movimento = 0;
    // coordenadas do branco
    static int x_branco = 0, y_branco = 0;


    public static void main(String []args){
        System.out.println("Jogo 8 quadrados.\n");
        inicializa_variaveis();
        imprime_tabuleiro_bonito();
    }

    public static void inicializa_variaveis()  {
        int k = 0;
        tabuleiro = new int[3][3];
        for(int i = 0;i<tabuleiro.length;i++)  {
            for(int j = 0;j<tabuleiro[i].length;j++)  {
                k++;
                tabuleiro[i][j] = k;
            }
        }
        // guarda a posição inicial do branco (valor 9)
        x_branco = 2;
        y_branco = 2;
        movimento = 1;
    }


    public static void imprime_tabuleiro()  {
        for(int i = 0;i<tabuleiro.length;i++)  {
            for(int j = 0;j<tabuleiro[i].length;j++)  {
                if (tabuleiro[i][j] !=9)
                    System.out.printf("%d\t",tabuleiro[i][j]);
                else  {
                    System.out.printf(" \t");
                }
            }
            System.out.printf("\n");
        }

    }

    public static void imprime_tabuleiro_bonito()  {

        int[] state = new int[9];
        String result = "";
        String[] imprimaIsto = {"","","","","","","","",""};

        for(int i = 0;i < tabuleiro.length;i++)  {
            for(int j = 0; j < tabuleiro[i].length;j++)  {
                state[3*i+j] = tabuleiro[i][j];
            }
        }

        for (int i = 0; i < state.length;i++)  {
            String insertString = "|   ";
            if (state[i] == 9)  {
                insertString+="    ";
            }
            else  {
                insertString+= state[i] + "   ";
            }
            imprimaIsto[i] = insertString;
        }

        result += " _______________________\n" + "|       |       |       |\n"+imprimaIsto[0]+imprimaIsto[1]
                +imprimaIsto[2]+"|\n"+"|_______|_______|_______|\n"+"|       |       |       |\n"
                +imprimaIsto[3]+imprimaIsto[4]+imprimaIsto[5]+"|\n"+"|_______|_______|_______|\n"+"|       |       |       |\n"
                +imprimaIsto[6]+imprimaIsto[7]+imprimaIsto[8]+"|\n"+"|_______|_______|_______|";

        System.out.println(result);
    }


}
