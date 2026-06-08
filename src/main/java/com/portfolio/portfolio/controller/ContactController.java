package com.portfolio.portfolio.controller;


import com.portfolio.portfolio.model.Contact;
import com.portfolio.portfolio.repository.ContactRepository;
import org.hibernate.boot.internal.Abstract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {
    @Autowired
     private ContactRepository contactRepository;
    @PostMapping
    public String saveContact(@RequestBody Contact contact) {
        contactRepository.save(contact);
        return "Message saved!";
    }
}
