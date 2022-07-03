package com.np.controller;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;

interface test4 {
	public default void display() {
		System.out.println("hello");
	}
}

interface test5
{
	public default void display()
	{
		System.out.println("bhai");
	}
}
class test6{
	
	public int b=50;
	
	
}
class test7 extends test6{
	
	public int a=100;
	public test7()
	{
		super();
	}
//	public int getint()
//	{
//		return this.a;
//	}

}

public class Test extends test7{
	
	public static void main(String[] args) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, UnsupportedEncodingException {
		
//		Pattern pattern= Pattern.compile("vishald");
//		Matcher matcher= pattern.matcher("vishal gupta");
//		
//		if(matcher.find())
//			System.out.println("match");
//		else
//			System.out.println("not match");
		
		//signature
//		KeyPairGenerator keyPairGen=KeyPairGenerator.getInstance("DSA");
//		
//		//System.out.println("1111    "+keyPairGen);
//		
//		keyPairGen.initialize(2048);
//		
//		KeyPair pair = keyPairGen.generateKeyPair();
//		
//		System.out.println("2222"+pair);
//		
//		PrivateKey privateKey= pair.getPrivate();
//		
//		Signature sign= Signature.getInstance("SHA256withDSA");
//		
//		sign.initSign(privateKey);
//	    byte[] bytes = "vishalgupta".getBytes();
//		
//		sign.update(bytes);
//	      
//	    byte[] signature = sign.sign();
//	      
//	    System.out.println("Digital signature for given text: "+new String(signature, "UTF8"));
		
		Test a= new Test();
		System.out.println(a.a);
		System.out.println(a.b);
}
	
	
}

