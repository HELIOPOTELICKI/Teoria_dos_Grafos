public class Analisa_Matriz {
    public static void main(String[] args) {
        Analisa_Matriz analize = new Analisa_Matriz();
        analize.analizar();
    }

    private void analizar() {
        int[][] matrizAdj = { { 0, 1, 0 }, { 1, 0, 1 }, { 0, 1, 0 } };
        Grafo grafo = new Grafo(matrizAdj);
        grafo.printMatrizAdj();
    }
}
