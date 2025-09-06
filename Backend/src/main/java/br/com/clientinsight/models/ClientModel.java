package br.com.clientinsight.models;

import br.com.clientinsight.dtos.ClientDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;

@Entity
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Long id;

    @Column(nullable = false, name = "nome")
    private String name;

    @Email
    @Column(nullable = false)
    private String email;

    @Column(nullable = true, name = "valor_total_consumido")
    private BigDecimal valueConsumed;

    @Column(nullable = false, name = "consumo_mensal")
    private BigDecimal consumptionMonth;

    public ClientModel(){}

    public ClientModel(String name, String email){
        this.name = name;
        this.email = email;
        this.valueConsumed = BigDecimal.valueOf(1000);
        this.consumptionMonth = valueConsumed.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP);
    }

    public ClientModel(String name, String email, BigDecimal valueConsumed){
        this.name = name;
        this.valueConsumed = valueConsumed;
        this.consumptionMonth = valueConsumed.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP);
    }

    public ClientModel(ClientDTO clientDTO){
        this.name = clientDTO.getName();
        this.email = clientDTO.getEmail();
        if(clientDTO.getValueConsumed() != null){
            this.valueConsumed = clientDTO.getValueConsumed();
            this.consumptionMonth = clientDTO.getValueConsumed().divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP);
        } else {
            this.valueConsumed = BigDecimal.valueOf(1000);
            this.consumptionMonth = valueConsumed.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP);
        }
    }

    public String getName() {
        return name;
    }

    public @Email String getEmail() {
        return email;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public BigDecimal getValueConsumed() {
        return valueConsumed;
    }

    public void setValueConsumed(BigDecimal valueConsumed) {
        this.valueConsumed = valueConsumed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getConsumptionMonth() {
        return consumptionMonth;
    }

    @Override
    public String toString() {
        return "ClientModel: " +
                "id:" + id +
                ", name:'" + name + '\'' +
                ", email:'" + email + '\'' +
                ", valueConsumed:" + valueConsumed +
                ", consumptionMonth:" + consumptionMonth;
    }
}
