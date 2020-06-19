package com.multiplatform;

public class person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (this.getFirstName().isEmpty() && this.getLastName().isEmpty()) {
            return "";
        } else if (this.getFirstName().isEmpty()) {
            return this.getLastName();
        } else if (this.getLastName().isEmpty()) {
            return this.getFirstName();
        } else {
            return this.getFirstName() + " " + this.getLastName();
        }
    }
}