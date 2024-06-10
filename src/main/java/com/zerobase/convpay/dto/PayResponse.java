package com.zerobase.convpay.dto;
//결제 응답 객체
// data transper object 데이터 통신 시 사용되는 객체를 만드는 dto 폴더
public class PayResponse {
    //결제 결과

    PayResult payResult;

    //결제 성공 금액
    Integer paidAmount;

    public PayResponse(PayResult payResult, Integer paidAmount) {
        this.payResult = payResult;
        this.paidAmount = paidAmount;
    }

    //Getter Setter가 있어야 데이터를 쉽게 다를 수 있다.
    public PayResult getPayResult() {
        return payResult;
    }

    public void setPayResult(PayResult payResult) {
        this.payResult = payResult;
    }

    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }
}
