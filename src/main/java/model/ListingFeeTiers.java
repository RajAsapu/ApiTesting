package model;

public class ListingFeeTiers {
    Double minimumTierPrice;
    Double fixedFee;

    public double getMinimumTierPrice() {
        return minimumTierPrice;
    }

    public void setMinimumTierPrice(Double minimumTierPrice) {
        this.minimumTierPrice = minimumTierPrice;
    }

    public double getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(Double fixedFee) {
        this.fixedFee = fixedFee;
    }

    @Override
    public String toString() {
        return "ListingFeeTiers{" +
                "minimumTierPrice=" + minimumTierPrice +
                ", fixedFee=" + fixedFee +
                '}';
    }
}
