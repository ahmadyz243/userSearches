package com.ahmad.searchUsers.domain;

import com.ahmad.searchUsers.base.BaseEntity;
import com.ahmad.searchUsers.enumiration.Gender;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@Entity
public class Person extends BaseEntity {
    private String firstname;
    private String lastname;
    private Gender gender;
    private int age;
    private float score;
    private String mobileNumber;
}
