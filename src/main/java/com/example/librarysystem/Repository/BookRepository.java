/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 7/4/2021
 *   Time: 12:21 PM
 *   File: BookRepository.java
 */

package com.example.librarysystem.Repository;

import com.example.librarysystem.Model.Book;
import org.hibernate.hql.internal.ast.tree.IdentNode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
