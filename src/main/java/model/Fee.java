package model;

import java.util.List;

public class Fee {
    Double bundle;
    Double endDate;
    Double feature;
    Double gallery;
    Double listing;
    Double reserve;
    Double subtitle;
    Double tenDays;
    List<ListingFeeTiers> listingFeeTiers;
    Double secondCategory;

    public Double getBundle() {
        return bundle;
    }

    public void setBundle(Double bundle) {
        this.bundle = bundle;
    }

    public Double getEndDate() {
        return endDate;
    }

    public void setEndDate(Double endDate) {
        this.endDate = endDate;
    }

    public Double getFeature() {
        return feature;
    }

    public void setFeature(Double feature) {
        this.feature = feature;
    }

    public Double getGallery() {
        return gallery;
    }

    public void setGallery(Double gallery) {
        this.gallery = gallery;
    }

    public Double getListing() {
        return listing;
    }

    public void setListing(Double listing) {
        this.listing = listing;
    }

    public Double getReserve() {
        return reserve;
    }

    public void setReserve(Double reserve) {
        this.reserve = reserve;
    }

    public Double getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Double subtitle) {
        this.subtitle = subtitle;
    }

    public Double getTenDays() {
        return tenDays;
    }

    public void setTenDays(Double tenDays) {
        this.tenDays = tenDays;
    }

    public List<ListingFeeTiers> getListingFeeTiers() {
        return listingFeeTiers;
    }

    public void setListingFeeTiers(List<ListingFeeTiers> listingFeeTiers) {
        this.listingFeeTiers = listingFeeTiers;
    }

    public Double getSecondCategory() {
        return secondCategory;
    }

    public void setSecondCategory(Double secondCategory) {
        this.secondCategory = secondCategory;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "bundle=" + bundle +
                ", endDate=" + endDate +
                ", feature=" + feature +
                ", gallery=" + gallery +
                ", listing=" + listing +
                ", reserve=" + reserve +
                ", subtitle=" + subtitle +
                ", tenDays=" + tenDays +
                ", listingFeeTiers=" + listingFeeTiers +
                ", secondCategory=" + secondCategory +
                '}';
    }
}

