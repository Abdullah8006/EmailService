
package com.centene.pn.services.emailService.model;


public class EmailSending {

    private String from;
    private String to;
    private String negotiator;
    private String body;
    private String date;
    private String contractEntity;
    private String subject;
    private String cC;
    private String bCC;
    private String mimeType;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getNegotiator() {
        return negotiator;
    }

    public void setNegotiator(String negotiator) {
        this.negotiator = negotiator;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContractEntity() {
        return contractEntity;
    }

    public void setContractEntity(String contractEntity) {
        this.contractEntity = contractEntity;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCC() {
        return cC;
    }

    public void setCC(String cC) {
        this.cC = cC;
    }

    public String getBCC() {
        return bCC;
    }

    public void setBCC(String bCC) {
        this.bCC = bCC;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

}
