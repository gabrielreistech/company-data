package br.com.companydata.models;

import br.com.companydata.dtos.SellerDTO;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Entity
public class SellerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Long id;

    @Column(nullable = false, name = "nome")
    private String name;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false, name = "total_vendido")
    private BigDecimal totalSelled;

    @Column(nullable = true, name = "media_mensal")
    private BigDecimal mediumMonth;

    @Column(nullable = true, name = "lista_mensal")
    private List<MonthModel> month;

    public SellerModel() {
    }

    public SellerModel(String name, String region, BigDecimal totalSelled) {
        this.name = name;
        this.region = region;
        this.totalSelled = totalSelled;
        this.mediumMonth = totalSelled.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP);
    }

    public SellerModel(SellerDTO sellerDTO) {
        this.name = sellerDTO.getName();
        this.region = sellerDTO.getRegion();
        this.totalSelled = sellerDTO.getTotalSelled();
        this.mediumMonth = sellerDTO.getTotalSelled().divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP);
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

    public List<MonthModel> getMonth() {
        return month;
    }

    public void setMonth(List<MonthModel> month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "SellerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", totalSelled=" + totalSelled +
                ", mediumMonth=" + mediumMonth +
                '}';
    }
}
