package com.example.demo.entity;
import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "departureDate",
        "arrivalDate",
        "price",
        "airline",
        "departureAir",
        "arrivalAir"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Data
@Table(name="ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty("departureDate")
    private String departureDate;
    @JsonProperty("arrivalDate")
    private String arrivalDate;
    @JsonProperty("price")
    private String price;
    @JsonProperty("airline")
    private String airline;
    @JsonProperty("departureAir")
    private String departureAir;
    @JsonProperty("arrivalAir")
    private String arrivalAir;

    @JsonProperty("link")
    private String link="";

    @JsonProperty("departureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("departureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @JsonProperty("arrivalDate")
    public String getArrivalDate() {
        return arrivalDate;
    }

    @JsonProperty("arrivalDate")
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("airline")
    public String getAirline() {
        return airline;
    }

    @JsonProperty("airline")
    public void setAirline(String airline) {
        this.airline = airline;
    }

    @JsonProperty("departureAir")
    public String getDepartureAir() {
        return departureAir;
    }

    @JsonProperty("departureAir")
    public void setDepartureAir(String departureAir) {
        this.departureAir = departureAir;
    }

    @JsonProperty("arrivalAir")
    public String getArrivalAir() {
        return arrivalAir;
    }

    @JsonProperty("arrivalAir")
    public void setArrivalAir(String arrivalAir) {
        this.arrivalAir = arrivalAir;
    }

}
