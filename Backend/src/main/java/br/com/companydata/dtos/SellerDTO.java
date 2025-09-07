package br.com.companydata.dtos;

import br.com.companydata.models.SellerModel;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SellerDTO {

    private Long id;

    private String name;

    private String region;

    private BigDecimal totalSelled;

    private BigDecimal mediumMonth;

    public SellerDTO(){}

    public SellerDTO(String name, String region, BigDecimal totalSelled) {
        this.name = name;
        this.region = region;
        this.totalSelled = totalSelled;
        this.mediumMonth = totalSelled.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP);
    }

    public SellerDTO(SellerModel sellerModel){
        this.id = sellerModel.getId();
        this.name = sellerModel.getName();
        this.region = sellerModel.getRegion();
        this.totalSelled = sellerModel.getTotalSelled();
        this.mediumMonth = sellerModel.getMediumMonth();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigDecimal getTotalSelled() {
        return totalSelled;
    }

    public void setTotalSelled(BigDecimal totalSelled) {
        this.totalSelled = totalSelled;
    }

    public BigDecimal getMediumMonth() {
        return mediumMonth;
    }

    public void setMediumMonth(BigDecimal mediumMonth) {
        this.mediumMonth = mediumMonth;
    }
}
