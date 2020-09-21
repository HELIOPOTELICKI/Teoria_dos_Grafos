public class Grafo {
    private int[][] matrizAdj;

    public Grafo(int[][] matrizAdj) {
        this.setGrafo(matrizAdj);
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
        String retorno = "";
        boolean diag = false;
        boolean maior = false;
        boolean regular = false;
        int contDiag = 0;
        int contMaior = 0;
        int contDirig = 0;
        int contNulo = 0;
        int[] somaLinhas = new int[matrizAdj.length];

        for (int l = 0; l < matrizAdj.length; l++) {
            int aux = 0;
            for (int c = 0; c < matrizAdj[0].length; c++) {
                if (matrizAdj[l][c] < 2) {
                    contMaior++;
                }
                if (matrizAdj[l][c] == 0) {
                    contNulo++;
                }
                if (matrizAdj[l][c] == matrizAdj[c][l]) {
                    contDirig++;
                }
                aux += matrizAdj[l][c];
            }
            somaLinhas[l] = aux;
            if (matrizAdj[l][l] == 0) {
                contDiag++;
            }
            if (l >= 1 && l != somaLinhas.length) {
                if (somaLinhas[l] == somaLinhas[l - 1]) {
                    regular = true;
                } else {
                    regular = false;
                }
            }
        }

        contDirig -= matrizAdj.length;

        if (contDirig == (tamanhoMatriz() - matrizAdj.length)) {
            retorno += "Grafo não dirigido, ";
        } else {
            retorno += "Grafo dirigido, ";
        }
        if (contDiag == matrizAdj.length) {
            diag = true;
        }
        if (contMaior == tamanhoMatriz()) {
            maior = true;
        }
        if (diag && maior) {
            retorno += "Simples, ";
        } else {
            retorno += "Multigrafo, ";
        }
        if (regular) {
            retorno += "regular, ";
        } else {
            retorno += "não regular, ";
        }
        if (contNulo == tamanhoMatriz()) {
            retorno += "nulo";
        }
        if (contNulo == 0) {
            retorno += "completo";
        }
        return retorno;
    }

    public String arestasDoGrafo() {
        return "not implemented dude";
    }

    public String grausDoVertice() {
        return "not implemented dude";
    }

    private int tamanhoMatriz() {
        return (matrizAdj.length * matrizAdj[0].length);
    }

    public int[][] getGrafo() {
        return matrizAdj;
    }

    public void setGrafo(int[][] matrizAdj) {
        if (matrizAdj.length != matrizAdj[0].length) {
            throw new IllegalArgumentException("Matriz informada não é adjunta");
        } else {
            this.matrizAdj = matrizAdj;
        }
    }
}
