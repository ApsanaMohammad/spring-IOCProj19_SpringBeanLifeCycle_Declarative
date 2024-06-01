package com.nt.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoterVerifier;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//IOC Container
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get spring bean object
		VoterVerifier voter=context.getBean("voter",VoterVerifier.class);
		System.out.println("please enter your name :");
		String name=sc.next();
		voter.setName(name);
		
		System.out.println("please enter your name :");
		String age=sc.next();
		voter.strage(age);
		
		
		try {
			System.out.println(voter.checkVotingEligibilty());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		context.close();
		sc.close();

	}

}
