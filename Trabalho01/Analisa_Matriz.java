public class Analisa_Matriz {
    public static void main(String[] args) {
        Analisa_Matriz analize = new Analisa_Matriz();
        analize.analizar();
    }

    private void analizar() {
        int[][] matrizAdj = { { 0, 1, 0 }, { 1, 0, 1 }, { 0, 1, 0 } };
        Grafo grafo = new Grafo(matrizAdj);
        grafo.printMatrizAdj();
        System.out.printf("Este grafo é do tipo: %s \n", grafo.tipoDoGrafo());
        System.out.printf("Que possui: %s \n", grafo.arestasDoGrafo());
        System.out.printf(grafo.grausDoVertice());
    }
}
