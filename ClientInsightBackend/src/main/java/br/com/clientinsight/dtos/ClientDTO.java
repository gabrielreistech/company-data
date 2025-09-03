package br.com.clientinsight.dtos;

import br.com.clientinsight.models.ClientModel;

import java.math.BigDecimal;

public class ClientDTO {

    private Long id;

    private String name;

    private String email;

    private BigDecimal valueConsumed;

    private BigDecimal consumptionMonth;

    public ClientDTO(){}

    public ClientDTO(String name, String email){
        this.name = name;
        this.email = email;
    }

    public ClientDTO(String name, String email, BigDecimal valueConsumed) {
        this.name = name;
        this.email = email;
        this.valueConsumed = valueConsumed;
    }

    public ClientDTO(ClientModel clientModel){
        this.id = clientModel.getId();
        this.name = clientModel.getName();
        this.email = clientModel.getEmail();
        this.valueConsumed = clientModel.getValueConsumed();
        this.consumptionMonth = clientModel.getConsumptionMonth();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getValueConsumed() {
        return valueConsumed;
    }

    public void setValueConsumed(BigDecimal valueConsumed) {
        this.valueConsumed = valueConsumed;
    }

    public BigDecimal getConsumptionMonth() {
        return consumptionMonth;
    }

    public void setConsumptionMonth(BigDecimal consumptionMonth) {
        this.consumptionMonth = consumptionMonth;
    }
}
