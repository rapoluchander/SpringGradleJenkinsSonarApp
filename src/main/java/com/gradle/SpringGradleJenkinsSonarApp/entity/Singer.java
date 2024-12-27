package com.gradle.SpringGradleJenkinsSonarApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Singer {
    @Id
    private int id;
    @Column
    private String singerName;
    @Column
    private String location;
    @Column
    private int age;

}
