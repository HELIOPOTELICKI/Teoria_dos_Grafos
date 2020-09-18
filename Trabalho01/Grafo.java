public class Grafo {
    private int[][] matrizAdj;

    public Grafo(int[][] matrizAdj) {
        this.setGrafo(matrizAdj);
        ;
    }

    public void printMatrizAdj() {
        System.out.println(" ");
        for (int i = 0; i < matrizAdj.length; i++) {
            for (int j = 0; j < matrizAdj[0].length; j++) {
                if (j == 0) {
                    System.out.printf("| %s |", this.matrizAdj[i][j]);
                } else {
                    System.out.printf(" %s |", this.matrizAdj[i][j]);
                }
            }
            System.out.println(" ");
        }
    }

    public String tipoDoGrafo() {
        return "not implemented dude";
    }

    public String arestasDoGrafo() {
        return "not implemented dude";
    }

    public String grausDoVertice() {
        return "not implemented dude";
    }

    public int[][] getGrafo() {
        return matrizAdj;
    }

    public void setGrafo(int[][] matrizAdj) {
        this.matrizAdj = matrizAdj;
    }
}
