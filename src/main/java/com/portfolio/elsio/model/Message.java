/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.api.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author elsio
 */
@Getter @Setter
public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public Message() {
    }
   
    
}
