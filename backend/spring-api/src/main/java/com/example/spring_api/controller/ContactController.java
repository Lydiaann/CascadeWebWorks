package com.example.spring_api.controller;
import com.example.spring_api.model.Contact;
import com.example.spring_api.repository.ContactRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class ContactController {

    private final ContactRepository repo;

    public ContactController(ContactRepository repo) {
        this.repo = repo;
    }

@PostMapping("/contact")
public String handleForm(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam String category,
        @RequestParam String message,
        @RequestParam(required = false) MultipartFile screenshot
) {

    System.out.println("CONTACT HIT ✅");

    Contact contact = new Contact();
    contact.setName(name);
    contact.setEmail(email);
    contact.setCategory(category);
    contact.setMessage(message);

    if (screenshot != null && !screenshot.isEmpty()) {
        contact.setFileName(screenshot.getOriginalFilename());
    }

    try {
        repo.save(contact);
        System.out.println("SAVED TO DB ✅");
    } catch (Exception e) {
        System.out.println("ERROR SAVING ❌");
        e.printStackTrace();
    }

    return "redirect:/contact.html";
}
}