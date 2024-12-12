package FichadeTrabalho05;

public class Ex07 {

    public static void desenharQuadrado(String caracter, int linha, int coluna) {

        int[][] matriz = new int[linha][coluna];

        //Criar um ciclo para preencher a matriz e imprimir o quadrado

        for (int linhaMatriz = 0; linhaMatriz < linha; linhaMatriz++){
            //Preencher colunas
            for(int colunaMatriz = 0; colunaMatriz < coluna; colunaMatriz++){
                //Regra para preencher em formato de quadrado
               if(linhaMatriz == 0 || colunaMatriz == 0 || linhaMatriz == linha - 1 || colunaMatriz == coluna -1) {
                   System.out.println(caracter);
               }else {
                   //Preencher com espaços o meio do quadrado
                   System.out.println("");

               }

            }
            //Saltar a linha
            System.out.println();
        }

            public static void main (String[] args){

            Scanner input = new Scanner(System.in);

            String caracterUser;

            int linhaUser, colunaUser;

            System.out.println("Inciando o programa");
            System.out.println("Insira um  caracter");
            caracterUser = input.nextInt();

            System.out.println("Insira o número de linhas: ");
            linhaUser = input.nextInt();
            System.out.println("Insira o número de colunas");
            colunaUser = input.nextInt();


            desenharQuadrado(caracterUser,linhaUser,colunaUser);

        }
    }

}
