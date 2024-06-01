package com.nt.beans;
import java.util.Date;
public class VoterVerifier {
    private String name;
    private int age;
    private Date verificationDate;
    
    //constructor
	public VoterVerifier() {
		System.out.println("voter verificatio 0 param constructor");
	}
	
	//setter method from setter injection
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int  age) {
		this.age = age;
	}
	public void setVerificationDate(Date verificationDate) {
		this.verificationDate = verificationDate;
	}
	
	public void strage(String age) {
		this.age = Integer.parseInt(age);
	}
	
    
    //blogic
	
	public String checkVotingEligibilty() {
		if(age<0) {
			return "Enter a valid age";
		}
		else if(age<18)
			return "Mr/Miss/Mrs "+name+" you are  not eligible to voting ...wait "+(18-age)+"years to cast ur vote as of "+verificationDate;
		else
			return "Mr/Miss/Mrs "+name+" you are  now eligible to vote as of "+verificationDate;
	}
    
}
