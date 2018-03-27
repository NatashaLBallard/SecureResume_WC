package com.secureresume_wc.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner{

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    ContactRepository contactRepository;

    @Autowired
    CoverLetterRepository coverLetterRepository;

    @Autowired
    EducationRepository educationRepository;

    @Autowired
    ExperienceRepository experienceRepository;

    @Autowired
    ReferenceRepository referenceRepository;

    @Autowired
    ResumeRepository resumeRepository;

    @Autowired
    SkillRepository skillRepository;

    @Autowired
    SummaryRepository summaryRepository;

    public void run(String...strings) throws Exception{
        System.out.println("Loading data...");


//        AFTER FIRST DEPLOYMENT TO WEB SERVER (HEROKU), COMMENT OUT THIS SECTION TO AVOID DUPLICATING THE CREATION
//        roleRepository.save(new RoleClass("USER"));
//        roleRepository.save(new RoleClass("ADMIN"));
//
//        RoleClass adminRole = roleRepository.findByRole("ADMIN");
//        RoleClass userRole = roleRepository.findByRole("USER");
//
//        User user = new
//                User ("bob@bob.com", "bob", "Bob", "Bobberson", true, "bob");
//        user.setRoles(Arrays.asList(userRole));
//        userRepository.save(user);

//        user = new
//                User ("jim@jim.com", "jim", "Jim", "Jimmerson", true, "jim");
//        user.setRoles(Arrays.asList(userRole));
//        userRepository.save(user);

//        user = new
//                User ("admin@adm.com", "pass", "Admin", "User", true, "admin");
//        user.setRoles(Arrays.asList(adminRole));
//        userRepository.save(user);
//
//        user = new
//                User ("sam@ev.com", "pass", "Sam", "Everyman", true, "sam");
//        user.setRoles(Arrays.asList(adminRole));
//        userRepository.save(user);





    }





}
