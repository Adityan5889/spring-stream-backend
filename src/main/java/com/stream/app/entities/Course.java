package com.stream.app.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "yt_courses")
public class Course {
    @Id
    private String id;

    private String title;

//    @OneToMany(mappedBy = "yt_courses")
//    private List<Video> list = new ArrayList<>();
}
