package br.com.companydata.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

@Embeddable
public class MonthModel {
 
    private String name;

    private Byte numberMonth;

    private Integer valueSelledMonth;

    public MonthModel(){}

    public MonthModel(String name, Byte numberMonth, Integer valueSelledMonth) {
        this.name = name;
        this.numberMonth = numberMonth;
        this.valueSelledMonth = valueSelledMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getNumberMonth() {
        return numberMonth;
    }

    public void setNumberMonth(Byte numberMonth) {
        this.numberMonth = numberMonth;
    }

    public Integer getValueSelledMonth() {
        return valueSelledMonth;
    }

    public void setValueSelledMonth(Integer valueSelledMonth) {
        this.valueSelledMonth = valueSelledMonth;
    }

    @Override
    public String toString() {
        return "MonthModel{" +
                ", name='" + name + '\'' +
                ", numberMonth=" + numberMonth +
                ", valueSelledMonth=" + valueSelledMonth +
                '}';
    }
}
