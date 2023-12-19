package com.learn.customExceptions;

public class UnderAgeException extends Exception
{
	public UnderAgeException()
	{
		super("You are too young to get DL, Please be patience");
	}
}
