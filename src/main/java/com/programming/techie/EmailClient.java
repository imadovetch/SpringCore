package com.programming.techie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class EmailClient {
    @Autowired
    @Qualifier("basicSpellChecker")
    private SpellChecker spellChecker;

    void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
        // Logic to Send Email
    }
}
