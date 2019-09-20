/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

// 
public class ASCIIArt {
	public static void main (String [] args) {
		theBird();
		theBird();

	}
	public static void theBird () {
		theHead();
		theBody();
		theLegs();
		extraTree();
	}
	public static void theHead () {
		System.out.println(" /\\_/\\\t\t|");
		System.out.println(" @  @ |\t\t|");
		System.out.println("  v   \\\t\t|");
	}
	public static void theBody () {
		System.out.println(" | ' '''\\\t|");
		System.out.println(" \\' ' '' \\\t|");
	}
	
	public static void theLegs () {
		System.out.println("----v--v--------|");
		System.out.println("  /\\/\\/\\/\\\\\t|");
	}
	public static void extraTree () {
		System.out.println("\t\t|");
	}
	
}