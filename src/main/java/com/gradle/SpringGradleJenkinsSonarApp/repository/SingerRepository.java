package com.gradle.SpringGradleJenkinsSonarApp.repository;

import com.gradle.SpringGradleJenkinsSonarApp.entity.Singer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingerRepository extends JpaRepository< Singer, Integer> {
}
