package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Promotions {
    Integer id;
    String name;
    String description;
    Double price;
    Double originalPrice;
    Boolean recommended;
    Integer minimumPhotoCount;

    public Boolean getRecommended() {
        return recommended;
    }

    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getMinimumPhotoCount() {
        return minimumPhotoCount;
    }

    public void setMinimumPhotoCount(Integer minimumPhotoCount) {
        this.minimumPhotoCount = minimumPhotoCount;
    }

    @Override
    public String toString() {
        return "Promotions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", originalPrice=" + originalPrice +
                ", recommended=" + recommended +
                ", minimumPhotoCount=" + minimumPhotoCount +
                '}';
    }
}