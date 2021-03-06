package com.nhpatt.myconference.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Javier Gamarra
 */
public class Talk implements Serializable {

    private Date start;
    private Date end;
    private String room;
    private String title;
    private String speaker;

    public Talk(String title, String room) {
        this.title = title;
        this.room = room;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }
}
