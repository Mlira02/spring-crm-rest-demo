package com.marcos.springdemo.rest;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class CustomerErrorResponse
{

    private int status;
    private String message;
    private long timeStamp;

    public CustomerErrorResponse()
    {
        
    }

    public CustomerErrorResponse(int theStatus, String theMessage, long theTimeStamp)
    {
        status = theStatus;
        message = theMessage;
        timeStamp = theTimeStamp;
    }

    public int getStatus()
    {
        return status;
    }

    public String getMessage()
    {
        return message;
    }

    public long getTimeStamp()
    {
        return timeStamp;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void setTimeStamp(long timeStamp)
    {
        this.timeStamp = timeStamp;
    }
}
