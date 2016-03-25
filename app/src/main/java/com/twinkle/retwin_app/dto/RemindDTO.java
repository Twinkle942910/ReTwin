package com.twinkle.retwin_app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class RemindDTO {

    private String id;
    private String title;
    private Date remindDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public RemindDTO() {
    }

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
