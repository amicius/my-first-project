package fr.dta.my_first_project;

import fr.dta.commons.utils.MyStringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(MyStringUtils.isNullOrEmpty(""));
		System.out.println(MyStringUtils.isNullOrEmpty(" "));
		System.out.println(MyStringUtils.isNullOrEmpty("  1234"));
    }
}
