package com.teerjustin.springproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
    @RequestMapping("/{track}")
    public String hello(@PathVariable("track") String track){
    	
    	String location = track;
    	System.out.println(track);
    	System.out.println(location);
    	if (location.equals("dojo")) {
    		System.out.println("TRACK SHOULD WORK");
    		return location + "is awesome.";
    	}
    	
    	if (location.equals("burbank-dojo")) {
    		return "Burbank Dojo is located in Southern California.";
    	}
    	
    	if (location.equals("san-jose")) {
    		return "SJ Dojo is the headquarters.";
    	}
    	return location;
    }
}
