/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public String getGenderString() {
        return (gender == 'M') ? "Male" : "Female";
    }
    private boolean ValidEmail(String email) {
       
        return email.contains("@");
    }

    @Override
    public String toString() {
        return name + " (" + getGenderString() + ") at " + email;
    }
    
}

    

