package com.cognizant.spring_learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {
    public static void main(String[] args) {
    	    displayCountry();
    	    
    }

    public static void displayCountry() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country", Country.class);
        System.out.println("Country : " + country);
        context.close();
    }



}
