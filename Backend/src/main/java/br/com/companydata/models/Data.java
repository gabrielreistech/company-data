package br.com.companydata.models;

import jakarta.persistence.Embeddable;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

@Embeddable
public class Data {

    private Set<Map<String, BigDecimal>> valueMonth;

    public Data(){}

    public Data(Set<Map<String, BigDecimal>> valueMonth) {
        this.valueMonth = valueMonth;
    }

    public Set<Map<String, BigDecimal>> getValueMonth() {
        return valueMonth;
    }

    public void setValueMonth(Set<Map<String, BigDecimal>> valueMonth) {
        this.valueMonth = valueMonth;
    }
}
