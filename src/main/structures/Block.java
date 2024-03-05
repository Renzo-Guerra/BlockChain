package structures;

import java.util.Date;

import utils.StringUtil;

public class Block {
	private String hash;
	private String previousHash;
	private String data;
	private long timestamp;
	
	public Block(String data, String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.timestamp = new Date().getTime();
		this.hash = this.calculatedHash();
	}
	
	public String calculatedHash() {
		return StringUtil.applySha256(this.previousHash + Long.toString(this.timestamp) + this.data);
	}
	
	public static void main(String[] args) {
		System.out.print("Devolvio: " +StringUtil.applySha256("as"));
	}
	
	public boolean wasModified() {
		return this.hash != this.calculatedHash(); 
	}
	
	public String getHash() {
		return this.hash;
	}
	
	public String getPreviousHash() {
		return this.previousHash;
	}
}