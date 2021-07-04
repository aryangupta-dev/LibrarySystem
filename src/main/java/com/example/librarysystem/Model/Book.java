/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 7/4/2021
 *   Time: 10:35 AM
 *   File: Book.java
 */

package com.example.librarysystem.Model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name="title")
    private String title;
    @Column(name="subject")
    private String subject;
    @Column(name="author")
    private String author;
    public Book(){

    }
}
