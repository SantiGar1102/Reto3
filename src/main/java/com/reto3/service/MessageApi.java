package com.reto3.service;

import com.reto3.modelo.Message;
import com.reto3.repository.MessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Santiago Garcia
 */
@Service
public class MessageApi {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll(){
        return messageRepository.getAll();
    }

    public Optional<Message> getMessage(int id){
        return messageRepository.getMessage(id);
    }

    public Message save(Message message){
        if(message.getIdMessage() == null){
            return messageRepository.save(message);
        }else{
            Optional<Message> evt = messageRepository.getMessage(message.getIdMessage());
            if(evt.isEmpty()){
                return messageRepository.save(message);
            }else{
                return message;
            }
        }
    }
}
