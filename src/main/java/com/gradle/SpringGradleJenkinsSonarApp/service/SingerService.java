package com.gradle.SpringGradleJenkinsSonarApp.service;

import com.gradle.SpringGradleJenkinsSonarApp.entity.Singer;
import com.gradle.SpringGradleJenkinsSonarApp.repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingerService {

    @Autowired
    SingerRepository repository;

    public Singer save(Singer singer){
        return (Singer) repository.save(singer);
    }
}
