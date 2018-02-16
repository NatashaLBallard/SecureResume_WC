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
//
//    @GetMapping("/add")
//    public String resumeForm(Model model) {
//        model.addAttribute("resume", new Resume());
//        return "resumeform";
//    }
//
//    @PostMapping("/process")
//    public String processForm(@Valid Resume resume, BindingResult result) {
//        if (result.hasErrors()) {
//            return "resumeform";
//        }
//        resumeRepository.save(resume);
//        return "redirect:/";
//    }
//

    @RequestMapping("/display")
    public String showContactOnDisplay( Model model) {
        model.addAttribute("contacts", contactRepository.findAll());
        model.addAttribute("summaries", summaryRepository.findAll());
        model.addAttribute("educations", educationRepository.findAll());
        model.addAttribute("experiences", experienceRepository.findAll());
        model.addAttribute("skills", skillRepository.findAll());
        model.addAttribute("references", referenceRepository.findAll());
        return "display";
    }
//
//    @RequestMapping("/detail/{id}")
//    public String showResume(@PathVariable("id") long id, Model model) {
//        model.addAttribute("resume", resumeRepository.findOne(id));
//        return "show";
//    }
//
//    @RequestMapping("/update/{id}")
//    public String updateResume(@PathVariable("id") long id, Model model){
//        model.addAttribute("resume", resumeRepository.findOne(id));
//        return "resumeform";
//    }
//
//    @RequestMapping("/delete/{id}")
//    public String delResume(@PathVariable("id") long id){
//        resumeRepository.delete(id);
//        return "redirect:/";
//    }
//





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





    //Summary Information

    @Autowired
    SummaryRepository summaryRepository;

//    @RequestMapping("/summary")
//    public String viewSummary(Model model) {
//        model.addAttribute("summaries", summaryRepository.findAll());
//        return "summary";
//    }

    @RequestMapping("/viewsummary")
    public String listSummary(Model model) {
        model.addAttribute("summaries", summaryRepository.findAll());
        return "summary";
    }

    @GetMapping("/addsummary")
    public String summaryForm(Model model) {
        model.addAttribute("summary", new Summary());
        return "summaryform";
    }

    @PostMapping("/processsummary")
    public String processSummaryForm(@Valid Summary summary, BindingResult result) {
        if (result.hasErrors()) {
            return "summaryform";
        }
        summaryRepository.save(summary);
        return "redirect:/viewsummary";
    }


    @RequestMapping("/detail-summary/{id}")
    public String showSummary(@PathVariable("id") long id, Model model) {
        model.addAttribute("summary", summaryRepository.findOne(id));
        return "showsummary";
    }

    @RequestMapping("/update-summary/{id}")
    public String updateSummary(@PathVariable("id") long id, Model model){
        model.addAttribute("summary", summaryRepository.findOne(id));
        return "summaryform";
    }

    @RequestMapping("/delete-summary/{id}")
    public String deleteSummary(@PathVariable("id") long id){
        summaryRepository.delete(id);
        return "redirect:/";
    }









    //Education Information

    @Autowired
    EducationRepository educationRepository;

    @RequestMapping("/vieweducation")
    public String listEducation(Model model) {
        model.addAttribute("educations", educationRepository.findAll());
        return "education";
    }

    @GetMapping("/addeducation")
    public String educationForm(Model model) {
        model.addAttribute("education", new Education());
        return "educationform";
    }

    @PostMapping("/processeducation")
    public String processEducationForm(@Valid Education education, BindingResult result) {
        if (result.hasErrors()) {
            return "educationform";
        }
        educationRepository.save(education);
        return "redirect:/vieweducation";
    }


    @RequestMapping("/detail-education/{id}")
    public String showEducation(@PathVariable("id") long id, Model model) {
        model.addAttribute("education", educationRepository.findOne(id));
        return "showeducation";
    }

    @RequestMapping("/update-education/{id}")
    public String updateEducation(@PathVariable("id") long id, Model model){
        model.addAttribute("education", educationRepository.findOne(id));
        return "educationform";
    }

    @RequestMapping("/delete-education/{id}")
    public String deleteContact(@PathVariable("id") long id){
        educationRepository.delete(id);
        return "redirect:/";
    }






    //Experience Information

    @Autowired
    ExperienceRepository experienceRepository;

    @RequestMapping("/viewexperience")
    public String listExperience(Model model) {
        model.addAttribute("experiences", experienceRepository.findAll());
        return "experience";
    }

    @GetMapping("/addexperience")
    public String experienceForm(Model model) {
        model.addAttribute("experience", new Experience());
        return "experienceform";
    }

    @PostMapping("/processexperience")
    public String processExperienceForm(@Valid Experience experience, BindingResult result) {
        if (result.hasErrors()) {
            return "experienceform";
        }
        experienceRepository.save(experience);
        return "redirect:/viewexperience";
    }


    @RequestMapping("/detail-experience/{id}")
    public String showExperience(@PathVariable("id") long id, Model model) {
        model.addAttribute("experience", experienceRepository.findOne(id));
        return "showexperience";
    }

    @RequestMapping("/update-experience/{id}")
    public String updateExperience(@PathVariable("id") long id, Model model){
        model.addAttribute("experience", experienceRepository.findOne(id));
        return "experienceform";
    }

    @RequestMapping("/delete-experience/{id}")
    public String deleteExperience(@PathVariable("id") long id){
        experienceRepository.delete(id);
        return "redirect:/";
    }







    //Skill Information

    @Autowired
    SkillRepository skillRepository;

    @RequestMapping("/viewskill")
    public String listSkill(Model model) {
        model.addAttribute("skills", skillRepository.findAll());
        return "skill";
    }

    @GetMapping("/addskill")
    public String skillForm(Model model) {
        model.addAttribute("skill", new Skill());
        return "skillform";
    }

    @PostMapping("/processskill")
    public String processSkillForm(@Valid Skill skill, BindingResult result) {
        if (result.hasErrors()) {
            return "skillform";
        }
        skillRepository.save(skill);
        return "redirect:/viewskill";
    }


    @RequestMapping("/detail-skill/{id}")
    public String showSkill(@PathVariable("id") long id, Model model) {
        model.addAttribute("skill", skillRepository.findOne(id));
        return "showskill";
    }

    @RequestMapping("/update-skill/{id}")
    public String updateSkill(@PathVariable("id") long id, Model model){
        model.addAttribute("skill", skillRepository.findOne(id));
        return "skillform";
    }

    @RequestMapping("/delete-skill/{id}")
    public String deleteSkill(@PathVariable("id") long id){
        skillRepository.delete(id);
        return "redirect:/";
    }









    //Reference Information

    @Autowired
    ReferenceRepository referenceRepository;

    @RequestMapping("/viewreference")
    public String listReference(Model model) {
        model.addAttribute("references", referenceRepository.findAll());
        return "reference";
    }

    @GetMapping("/addreference")
    public String referenceForm(Model model) {
        model.addAttribute("reference", new Reference());
        return "referenceform";
    }

    @PostMapping("/processreference")
    public String processReferenceForm(@Valid Reference reference, BindingResult result) {
        if (result.hasErrors()) {
            return "referenceform";
        }
        referenceRepository.save(reference);
        return "redirect:/viewreference";
    }


    @RequestMapping("/detail-reference/{id}")
    public String showReference(@PathVariable("id") long id, Model model) {
        model.addAttribute("reference", referenceRepository.findOne(id));
        return "showreference";
    }

    @RequestMapping("/update-reference/{id}")
    public String updateReference(@PathVariable("id") long id, Model model){
        model.addAttribute("reference", referenceRepository.findOne(id));
        return "referenceform";
    }

    @RequestMapping("/delete-reference/{id}")
    public String deleteReference(@PathVariable("id") long id){
        referenceRepository.delete(id);
        return "redirect:/";
    }






















    //Individual Pages
//    @RequestMapping("/summary")
//    public String summaryPage(){
//        return "summary";
//    }
//
//    @RequestMapping("/contact")
//    public String contactPage(){
//        return "contact";
//    }
//
//    @RequestMapping("/education")
//    public String educationPage(){
//        return "education";
//    }
//
//    @RequestMapping("/skill")
//    public String skillPage(){
//        return "skill";
//    }
//
//    @RequestMapping("/experience")
//    public String experiencePage(){
//        return "experience";
//    }
//
//    @RequestMapping("/reference")
//    public String referencePage(){
//        return "reference";
//    }

    @RequestMapping("/view")
    public String viewPage(){
        return "view";
    }
//
//    @RequestMapping("/completeresume")
//    public String viewCompleteResume(){
//        return "completeresume";
//    }

}
