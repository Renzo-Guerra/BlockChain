package app;

import structures.Block;

public class Main {

	public static void main(String[] args) {
		Block firstBlock= new Block("First block", "0");
		System.out.println("First block hash is: " + firstBlock.getHash());
		
		Block secondBlock= new Block("Second block", firstBlock.getHash());
		System.out.println("Second block hash is: " + secondBlock.getHash());
		
		Block thirdBlock = new Block("Third block", secondBlock.getHash());
		System.out.println("Third block hash is: " + thirdBlock.getHash());
		
		
		
	}

}