package practice.basic.sysntax;
/*
 * This demo show how to use swith pattern
 * Inside Swith condition we could put:
 * String 
 * int
*/

public class SwitchDemo {
    public static void main(String[] args) {
        String month = args[0];
	switch(month.toLowerCase()) {
	    case "january":
	        System.out.println("JAN");
	    	break;
	    case "june": case "july":
		System.out.println("JUN");
	    	break;
  	    default:
    		System.out.println("I have no idea!");
    		break;
        }
    }
}
