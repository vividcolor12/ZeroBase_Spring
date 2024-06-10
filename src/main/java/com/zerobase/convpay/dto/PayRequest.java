package com.zerobase.convpay.dto;
//결제 요청 객체
/*
    enum이 뭐지?? 열거형?


 */
public class PayRequest {
    //편의점 종류
    ConvenienceType convenienceType;

    //결제 금액
    Integer payAmount;
    //자바 bean 규격에 따라 생섬


    public PayRequest(ConvenienceType convenienceType, Integer payAmount) {
        this.convenienceType = convenienceType;
        this.payAmount = payAmount;
    }

    public ConvenienceType getConvenienceType() {
        return convenienceType;
    }

    public void setConvenienceType(ConvenienceType convenienceType) {
        this.convenienceType = convenienceType;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }
}
