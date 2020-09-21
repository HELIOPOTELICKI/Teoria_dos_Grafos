public class testes {
    public static void main(String[] args) {
        int[][] matrizAdj = { { 0, 1, 0 }, { 1, 0, 1 }, { 0, 1, 0 } };
        Grafo grafo = new Grafo(matrizAdj);
        grafo.printMatrizAdj();
    }
}
