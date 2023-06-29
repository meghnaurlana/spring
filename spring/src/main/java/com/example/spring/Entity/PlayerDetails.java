package com.example.spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public  class PlayerDetails {
    public String name;
    public String favourite_sport;
    public String address;
    public String date_of_birth;
    public String phone_number;
    public String surname;
    public String father_name;
    public String mother_name;
}
