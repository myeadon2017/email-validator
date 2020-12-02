package emailvalidator;

import java.util.*;

import java.util.regex.Matcher;

import java.util.regex.Pattern;



public class EmailValidator {





	public static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.]+$";



	public static void main(String[] args) {


		List <String> lst= new ArrayList<String>();




		lst.add("Radf.Ddgf@hcl.com");

		lst.add("Dfdv5dfDgdggd@hcl.com");


		Pattern pattern= Pattern.compile(regex);


		for( String value: lst) {

			Matcher matcher= pattern.matcher(value);


			System.out.println("the Email address " + value + " is " + (matcher.matches() ? "valid" : "invalid"));


		}



	}

 

}
