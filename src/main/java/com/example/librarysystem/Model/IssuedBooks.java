/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 7/4/2021
 *   Time: 11:13 AM
 *   File: IssuedBooks.java
 */

package com.example.librarysystem.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class IssuedBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="userId")
    private int userId;
    @Column(name="bookId")
    private int bookId;
    @Column(name="Status")
    private String status;
    public IssuedBooks(){

    }




}
