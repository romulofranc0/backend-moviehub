package com.moviehub.backend_moviehub.entities;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "mh_review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name ="review_id")
    private Long id;

    @CreationTimestamp
    private Instant creationDatetime;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private Double rating;

    private String reviewTitle;
    
    private String reviewBody;

}
