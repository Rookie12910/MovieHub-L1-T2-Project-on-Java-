package com.example.projectfx;

public class ProductionCompany {
    String productionCompany;
    int movieCount;

    public ProductionCompany(String productionCompany, int movieCount) {
        this.productionCompany = productionCompany;
        this.movieCount = movieCount;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public int getMovieCount() {
        return movieCount;
    }

    public void setMovieCount(int movieCount) {
        this.movieCount = movieCount;
    }
}
