package br.com.companydata.models;

import jakarta.persistence.Embeddable;

import java.util.List;

@Embeddable
public class GraficModel {

    private List<Data> dataList;

    public GraficModel(){}

    public GraficModel(List<Data> dataList) {
        this.dataList = dataList;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }
}
