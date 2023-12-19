package com.learn.customExceptions;

public class OverAgeException extends Exception
{
	public OverAgeException()
	{
		super("You are too old, Please take rest GrandPa");
	}

}
