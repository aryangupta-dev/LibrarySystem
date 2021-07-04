/*   Created by IntelliJ IDEA.
 *   Author: Aryan Gupta (ag2602)
 *   Date: 7/4/2021
 *   Time: 12:21 PM
 *   File: UserRepository.java
 */

package com.example.librarysystem.Repository;

import com.example.librarysystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
