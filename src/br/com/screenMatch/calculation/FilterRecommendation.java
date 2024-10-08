package br.com.screenMatch.calculation;

public class FilterRecommendation {
    public void filter (Classifiable classifiable) {
        if (classifiable.getClassifiable() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (classifiable.getClassifiable() >= 2) {
            System.out.println("Muito bem avaliado!");            
        } else {
            System.out.println("Avaliação ruim.");
            
        }
    }
}
