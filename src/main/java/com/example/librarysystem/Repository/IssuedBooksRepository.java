/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 7/4/2021
 *   Time: 12:21 PM
 *   File: IssuedBooksRepository.java
 */

package com.example.librarysystem.Repository;

import com.example.librarysystem.Model.IssuedBooks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IssuedBooksRepository extends JpaRepository<IssuedBooks, Integer> {
}
