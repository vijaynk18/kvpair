package com.hiringmenu.kvpair.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "basic_profile")
@Getter
@Setter
public class BasicProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "primary_phone")
    private String primaryPhone;

    @Column(name = "secondary_phone")
    private String secondaryPhone;

    @Column(name = "p_address_line1")
    private String pAddressLine1;

    @Column(name = "p_address_line2")
    private String pAddressLine2;

    @Column(name = "p_address_line3")
    private String pAddressLine3;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "state")
    private String state;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "primary_email")
    private String primaryEmail;

    @Column(name = "secondary_email")
    private String secondaryEmail;

    @Column(name = "landline")
    private String landline;

    @Column(name = "video_resume_url")
    private String videoResumeUrl;

    @Column(name = "resume_link_url")
    private String resumeLinkUrl;

    @Column(name = "cover_letter", columnDefinition = "TEXT")
    private String coverLetter;

    @Column(name = "maritial_status")
    private String maritalStatus;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;

    @Column(name = "sexual_orientation")
    private String sexualOrientation;

    @Column(name = "experience")
    private double experience;

    @Column(name = "t_address_line1")
    private String tAddressLine1;

    @Column(name = "t_address_line2")
    private String tAddressLine2;

    @Column(name = "t_address_line3")
    private String tAddressLine3;

    @Column(name = "profile_photo")
    private String profilePhoto;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "spouse_name")
    private String spouseName;

    @Column(name = "disability")
    private Boolean disability;

    @Column(name = "disability_metadata", columnDefinition = "TEXT")
    private String disabilityMetadata;

    // Getters and Setters
}
