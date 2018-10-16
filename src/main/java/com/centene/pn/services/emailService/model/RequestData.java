
package com.centene.pn.services.emailService.model;

import java.util.List;

public class RequestData {

    private String version;
    private List<EmailSending> emailSending = null;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<EmailSending> getEmailSending() {
        return emailSending;
    }

    public void setEmailSending(List<EmailSending> emailSending) {
        this.emailSending = emailSending;
    }

}
