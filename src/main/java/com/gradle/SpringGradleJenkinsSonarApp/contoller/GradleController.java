package com.gradle.SpringGradleJenkinsSonarApp.contoller;

import com.gradle.SpringGradleJenkinsSonarApp.entity.Singer;
import com.gradle.SpringGradleJenkinsSonarApp.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradleController {

    @Autowired
    SingerService singerService;

    @GetMapping("/test")
    public String getTest(){
        return "Welcome to Gradle Project";
    }

    @PostMapping("/savesinger")
    public Singer save(@RequestBody Singer singer){
        return singerService.save(singer);
    }


}
