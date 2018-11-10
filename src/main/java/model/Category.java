package model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public class Category {
    Integer categoryId; // known
    String name; // known
    String path; // known
    Boolean canListAuctions; // known
    Boolean canListClassifieds; // known
    Boolean canRelist; // known
    String legalNotice; // known
    Integer defaultDuration; // known
    List<Integer> allowedDurations; // known
    Fee fees; // known
    Integer freePhotoCount; // known
    Integer maximumPhotoCount; // known
    Boolean isFreeToRelist; // known
    List<Promotions> promotions; // known
    List<String> embeddedContentOptions; // known
    Integer maximumTitleLength; // known
    Integer areaOfBusiness; // known
    Integer defaultRelistDuration; // known

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getCanListAuctions() {
        return canListAuctions;
    }

    public void setCanListAuctions(Boolean canListAuctions) {
        this.canListAuctions = canListAuctions;
    }

    public Boolean getCanListClassifieds() {
        return canListClassifieds;
    }

    public void setCanListClassifieds(Boolean canListClassifieds) {
        this.canListClassifieds = canListClassifieds;
    }

    public Boolean getCanRelist() {
        return canRelist;
    }

    public void setCanRelist(Boolean canRelist) {
        this.canRelist = canRelist;
    }

    public String getLegalNotice() {
        return legalNotice;
    }

    public void setLegalNotice(String legalNotice) {
        this.legalNotice = legalNotice;
    }

    public Integer getDefaultDuration() {
        return defaultDuration;
    }

    public void setDefaultDuration(Integer defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    public List<Integer> getAllowedDurations() {
        return allowedDurations;
    }

    public void setAllowedDurations(List<Integer> allowedDurations) {
        this.allowedDurations = allowedDurations;
    }

    public Fee getFees() {
        return fees;
    }

    public void setFees(Fee fees) {
        this.fees = fees;
    }

    public Integer getFreePhotoCount() {
        return freePhotoCount;
    }

    public void setFreePhotoCount(Integer freePhotoCount) {
        this.freePhotoCount = freePhotoCount;
    }

    public Integer getMaximumPhotoCount() {
        return maximumPhotoCount;
    }

    public void setMaximumPhotoCount(Integer maximumPhotoCount) {
        this.maximumPhotoCount = maximumPhotoCount;
    }

    public Boolean getIsFreeToRelist() {
        return isFreeToRelist;
    }

    public void setIsFreeToRelist(Boolean isFreeToRelist) {
        this.isFreeToRelist = isFreeToRelist;
    }

    public List<Promotions> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotions> promotions) {
        this.promotions = promotions;
    }

    public List<String> getEmbeddedContentOptions() {
        return embeddedContentOptions;
    }

    public void setEmbeddedContentOptions(List<String> embeddedContentOptions) {
        this.embeddedContentOptions = embeddedContentOptions;
    }

    public Integer getMaximumTitleLength() {
        return maximumTitleLength;
    }

    public void setMaximumTitleLength(Integer maximumTitleLength) {
        this.maximumTitleLength = maximumTitleLength;
    }

    public Integer getAreaOfBusiness() {
        return areaOfBusiness;
    }

    public void setAreaOfBusiness(Integer areaOfBusiness) {
        this.areaOfBusiness = areaOfBusiness;
    }

    public Integer getDefaultRelistDuration() {
        return defaultRelistDuration;
    }

    public void setDefaultRelistDuration(Integer defaultRelistDuration) {
        this.defaultRelistDuration = defaultRelistDuration;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", canListAuctions=" + canListAuctions +
                ", canListClassifieds=" + canListClassifieds +
                ", canRelist=" + canRelist +
                ", legalNotice='" + legalNotice + '\'' +
                ", defaultDuration=" + defaultDuration +
                ", allowedDurations=" + allowedDurations +
                ", fees=" + fees +
                ", freePhotoCount=" + freePhotoCount +
                ", maximumPhotoCount=" + maximumPhotoCount +
                ", isFreeToRelist=" + isFreeToRelist +
                ", promotions=" + promotions +
                ", embeddedContentOptions=" + embeddedContentOptions +
                ", maximumTitleLength=" + maximumTitleLength +
                ", areaOfBusiness=" + areaOfBusiness +
                ", defaultRelistDuration=" + defaultRelistDuration +
                '}';
    }
}

