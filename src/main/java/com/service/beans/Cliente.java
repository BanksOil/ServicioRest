package com.service.beans;

public class Cliente {
    private String _id;
    private String email;
    private String name;
    private String lastName;
    private String cardNumber;
    private Integer expirationDateYear;
    private String expirationDateMonth;
    private Integer gasType;
    private Double amount;  
    private String gasStation;  
    private String sellerName;
    
    private String status;
    private String message;
    private String error;

    public Cliente() {
    }

    public Cliente(String _id, String email, String name, String lastName, String cardNumber, Integer expirationDateYear, String expirationDateMonth, Integer gasType, Double amount, String gasStation, String sellerName, String status, String message, String error) {
        this._id = _id;
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.expirationDateYear = expirationDateYear;
        this.expirationDateMonth = expirationDateMonth;
        this.gasType = gasType;
        this.amount = amount;
        this.gasStation = gasStation;
        this.sellerName = sellerName;
        this.status = status;
        this.message = message;
        this.error = error;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getExpirationDateYear() {
        return expirationDateYear;
    }

    public void setExpirationDateYear(Integer expirationDateYear) {
        this.expirationDateYear = expirationDateYear;
    }

    public String getExpirationDateMonth() {
        return expirationDateMonth;
    }

    public void setExpirationDateMonth(String expirationDateMonth) {
        this.expirationDateMonth = expirationDateMonth;
    }

    public Integer getGasType() {
        return gasType;
    }

    public void setGasType(Integer gasType) {
        this.gasType = gasType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getGasStation() {
        return gasStation;
    }

    public void setGasStation(String gasStation) {
        this.gasStation = gasStation;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
    

}
