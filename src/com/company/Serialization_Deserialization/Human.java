package com.company.Serialization_Deserialization;

import com.google.gson.annotations.SerializedName;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Human {

    private String name;
    private int age;

    public Human(){

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }
}
