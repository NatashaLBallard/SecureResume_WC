package com.secureresume_wc.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    ResumeRepository resumeRepository;

    @RequestMapping("/")
    public String listResumes(Model model) {
        model.addAttribute("resumes", resumeRepository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String resumeForm(Model model) {
        model.addAttribute("resume", new Resume());
        return "resumeform";
    }

    @PostMapping("/process")
    public String processForm(@Valid Resume resume, BindingResult result) {
        if (result.hasErrors()) {
            return "resumeform";
        }
        resumeRepository.save(resume);
        return "redirect:/";
    }


    @RequestMapping("/display")
    public String showContactOnDisplay( Model model) {
        model.addAttribute("contacts", contactRepository.findAll());
        model.addAttribute("resumes", resumeRepository.findAll());
        return "display";
    }

    @RequestMapping("/detail/{id}")
    public String showResume(@PathVariable("id") long id, Model model) {
        model.addAttribute("resume", resumeRepository.findOne(id));
        return "show";
    }

    @RequestMapping("/update/{id}")
    public String updateResume(@PathVariable("id") long id, Model model){
        model.addAttribute("resume", resumeRepository.findOne(id));
        return "resumeform";
    }

    @RequestMapping("/delete/{id}")
    public String delResume(@PathVariable("id") long id){
        resumeRepository.delete(id);
        return "redirect:/";
    }








    //Contact Information

    @Autowired
    ContactRepository contactRepository;

    @RequestMapping("/viewcontact")
    public String listContactInformation(Model model) {
        model.addAttribute("contacts", contactRepository.findAll());
        return "contact";
    }

    @GetMapping("/addcontact")
    public String contactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contactform";
    }

    @PostMapping("/processcontact")
    public String processContactForm(@Valid Contact contact, BindingResult result) {
        if (result.hasErrors()) {
            return "contactform";
        }
        contactRepository.save(contact);
        return "redirect:/viewcontact";
    }


    @RequestMapping("/detail-contact/{id}")
    public String showContactInformation(@PathVariable("id") long id, Model model) {
        model.addAttribute("contact", contactRepository.findOne(id));
        return "showcontact";
    }

    @RequestMapping("/update-contact/{id}")
    public String updateContactInformation(@PathVariable("id") long id, Model model){
        model.addAttribute("contact", contactRepository.findOne(id));
        return "contactform";
    }

    @RequestMapping("/delete-contact/{id}")
    public String deleteContactInformation(@PathVariable("id") long id){
        contactRepository.delete(id);
        return "redirect:/";
    }










    


    //Individual Pages
    @RequestMapping("/summary")
    public String summaryPage(){
        return "summary";
    }

    @RequestMapping("/contact")
    public String contactPage(){
        return "contact";
    }

    @RequestMapping("/education")
    public String educationPage(){
        return "education";
    }

    @RequestMapping("/skill")
    public String skillPage(){
        return "skill";
    }

    @RequestMapping("/experience")
    public String experiencePage(){
        return "experience";
    }

    @RequestMapping("/reference")
    public String referencePage(){
        return "reference";
    }

    @RequestMapping("/view")
    public String viewPage(){
        return "view";
    }

    @RequestMapping("/completeresume")
    public String viewCompleteResume(){
        return "completeresume";
    }

}
