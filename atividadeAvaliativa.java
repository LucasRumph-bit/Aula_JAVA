import java.util.TreeSet;

public class atividadeAvaliativa {

    public static void main(String[] args) {
        int n = 10;
        int[] valores = { 60, 30, 40, 10, 80, 20, 50, 70, 100, 90 }; 
        int i, j, menor, aux;

        for (i = 0; i < n - 1; i++) { // ordena os elementos do vetor
            menor = i;
            for (j = i + 1; j < n; j++) { // seleciona o menor valor do vetor
                if (valores[j] < valores[menor])
                    menor = j;
            }
            if (menor!= i) {  //troca se for necessario
            System.out.println("Troca posição " + i + " ( valor " + valores[i] + " ) com posição " + menor + " ( valor " + valores[menor] + " )" ); //exibe cada troca feita, posição(valor) por posição(valor)
            
            aux = valores[i]; //trocar a posição do vetor[I] com o menor valor do vetor [menor], aux é apenas uma variavel para auxiliar na troca da ordem dos valores
            valores[i] = valores[menor];
            valores[menor] = aux;
                
            } else {
                System.out.println("Nenhuma troca foi feita");//se nenhuma troca ocorrer ou for necessaria
            }
        }
        System.out.println("Ordenado"); //for para exibir os valores que estão salvo no vetor
        for (int o = 0; o < n; o++) {
            System.out.println(valores[o]);//exibe os valores em ordem
        }

        TreeSet<Integer> valores1 = new TreeSet<>(); //cria o treeset

        //Adiciona valores no treeset
        valores1.add(60);
        valores1.add(30);
        valores1.add(40);
        valores1.add(10);
        valores1.add(80);
        valores1.add(20);
        valores1.add(50);
        valores1.add(70);
        valores1.add(100);
        valores1.add(90);

        // treeset ja faz a ordem correta de forma automatica

        System.out.println("Ordenado Collections");
        for(Integer valor: valores1)  { //for each
            System.out.println(valor); //exibi a lista ordenada
        }


    } 
}
