package de.ptb.codataapi.model;

public class expandedUnc {
    Double uncertainty;
    int coverageFactor;
    Double coverageProbabilty;

    public Double getUncertainty() {
        return uncertainty;
    }

    public void setUncertainty(Double uncertainty) {
        this.uncertainty = uncertainty;
    }

    public int getCoverageFactor() {
        return coverageFactor;
    }

    public void setCoverageFactor(int coverageFactor) {
        this.coverageFactor = coverageFactor;
    }

    public Double getCoverageProbabilty() {
        return coverageProbabilty;
    }

    public void setCoverageProbabilty(Double coverageProbabilty) {
        this.coverageProbabilty = coverageProbabilty;
    }
    public expandedUnc(Double uncertainty, int coverageFactor, Double coverageProbabilty){
        this.uncertainty = uncertainty;
        this.coverageFactor = coverageFactor;
        this.coverageProbabilty = coverageProbabilty;
    }

}
