package com.ewangclarks.carbookdriver.service;


import com.sharedlibrary.sharedkafkadto.dto.CustomMessage;

public interface PublishMessage {
    void sendMessage(CustomMessage customMessage);
}
