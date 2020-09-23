public class Analisa_Matriz {
    public static void main(String[] args) {
        Analisa_Matriz analize = new Analisa_Matriz();
        analize.analizar();
    }

    private void analizar() {
        // Teste 00
        int[][] matrizAdj0 = { { 0, 1, 0 }, { 1, 0, 1 }, { 0, 1, 0 } };
        Grafo grafo0 = new Grafo(matrizAdj0);
        grafo0.printMatrizAdj();
        System.out.printf("\nTipo: %s \n", grafo0.tipoDoGrafo());
        System.out.printf("Que possui: %s \n", grafo0.arestasDoGrafo());
        System.out.printf(grafo0.grausDoVertice());

        // Teste 01
        int[][] matrizAdj1 = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        Grafo grafo1 = new Grafo(matrizAdj1);
        grafo1.printMatrizAdj();
        System.out.printf("\nTipo: %s \n", grafo1.tipoDoGrafo());
        System.out.printf("Que possui: %s \n", grafo1.arestasDoGrafo());
        System.out.printf(grafo1.grausDoVertice());

        // Teste 02
        int[][] matrizAdj2 = { { 2, 1, 1 }, { 1, 3, 1 }, { 1, 1, 2 } };
        Grafo grafo2 = new Grafo(matrizAdj2);
        grafo2.printMatrizAdj();
        System.out.printf("\nTipo: %s \n", grafo2.tipoDoGrafo());
        System.out.printf("Que possui: %s \n", grafo2.arestasDoGrafo());
        System.out.printf(grafo2.grausDoVertice());

        // Teste 03
        int[][] matrizAdj3 = { { 0, 1, 1, 3, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 0, 3, 1 }, { 1, 1, 2, 0, 1 },
                { 1, 3, 1, 3, 0 } };
        Grafo grafo3 = new Grafo(matrizAdj3);
        grafo3.printMatrizAdj();
        System.out.printf("\nTipo: %s \n", grafo3.tipoDoGrafo());
        System.out.printf("Que possui: %s \n", grafo3.arestasDoGrafo());
        System.out.printf(grafo3.grausDoVertice());

        // Teste 04
        int[][] matrizAdj4 = { { 0, 1, 0 }, { 1, 0, 1 }, { 0, 1, 0 }, { 0, 1, 0 } };
        try {
            @SuppressWarnings("unused")
            Grafo grafo4 = new Grafo(matrizAdj4);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.toString());
        }

    }
}
