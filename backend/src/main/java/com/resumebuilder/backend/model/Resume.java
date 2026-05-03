package com.resumebuilder.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "resume")
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resumeName;
    private String firstName;
    private String lastName;
    private String title;

    @Column(length = 1000)
    private String summary;

    private String email;
    private String phone;
    private String city;
    private String website;
    private String linkedin;
    private String github;

    public Long getId() { return id; }
    public String getResumeName() { return resumeName; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getTitle() { return title; }
    public String getSummary() { return summary; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getCity() { return city; }
    public String getWebsite() { return website; }
    public String getLinkedin() { return linkedin; }
    public String getGithub() { return github; }

    public void setId(Long id) { this.id = id; }
    public void setResumeName(String resumeName) { this.resumeName = resumeName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setTitle(String title) { this.title = title; }
    public void setSummary(String summary) { this.summary = summary; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setCity(String city) { this.city = city; }
    public void setWebsite(String website) { this.website = website; }
    public void setLinkedin(String linkedin) { this.linkedin = linkedin; }
    public void setGithub(String github) { this.github = github; }
}