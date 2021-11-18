package com.sirius.twitter.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Tweets")
public class Tweet {

    @Id
    @Column(name="id", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private int id;

    @Column(name="replies")
    @OneToMany(cascade = CascadeType.ALL)
    @Getter @Setter
    // If any, the tweet is the head of a thread and elements are replies
    private List<Tweet> replies = new ArrayList<Tweet>();

    @Column(name="userId")
    @Getter @Setter
    private int userId;

    @Column(name = "content", nullable = false)
    @Getter @Setter
    private String content;

    @Column(name = "likes")
    @Getter @Setter
    private int likes;

    @Column(name = "retweets")
    @Getter @Setter
    private int retweets;

    @Column(name = "timestamp")
    @Getter @Setter
    private Timestamp timestamp;

}