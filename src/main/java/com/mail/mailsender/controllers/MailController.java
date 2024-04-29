package com.mail.mailsender.controllers;

import com.mail.mailsender.Model.MailStructure;
import com.mail.mailsender.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")

public class MailController {

    @Autowired
    private MailService mailService;
    @PostMapping("/send/{mail}")

    public String sendmail(@PathVariable String mail, @RequestBody MailStructure mailStructure){
        mailService.sendmail(mail,mailStructure);
        return "mail sent succesfully";

    }

}
