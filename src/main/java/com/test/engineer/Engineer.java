package com.test.engineer;

import java.util.List;
import java.util.Random;

/**
 * Engineer class
 * This will be super class of all types of Engineers
 */
public class Engineer {

    protected  String firstName;
    protected  String lastName;
    protected List<SkillSet> skillSet;

    /**
     * Default Constructor
     */
    protected Engineer()
    {
        this.firstName = "First"+new Random().nextInt(1000);
        this.firstName = "Last"+new Random().nextInt(1000);
    }

    /**
     * Constructor - To Set First and Last name
     * @param firtstName
     * @param lastName
     */
    protected Engineer(String firtstName, String lastName)
    {
        this.firstName = firtstName;
        this.lastName = lastName;
    }

    /**
     * getter for SkillSet
     * @return
     */
    public List<SkillSet> getSkillSet() {
        return skillSet;
    }

    /**
     * Setters for Skill Set
     * @param skillSet
     */
    public void setSkillSet(List<SkillSet> skillSet) {
        this.skillSet = skillSet;
    }

    /**
     * This method will Say hello
     * with first and last name
     * @return
     */
    protected String sayHello()
    {
        String greetingMessage = null;
        String skills = null;
        int counter = 0;
        for(SkillSet skill : this.getSkillSet())
        {
            if(counter == 0)
                skills = skill.toString();
            skills =  skills+ ","+ " "+skill.toString();
            counter++;
        }
        greetingMessage = "Hello! My name is"+ this.firstName + " "+ this.lastName+ " "
                +"and my skills are: "+ skills;

        return  greetingMessage;
    }

}
