package com.demoqa.utils;


import org.testng.annotations.Test;
import org.openqa.selenium.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;

public class RepositoryParser {
	private FileInputStream stream;
	private String RepFile;
	Properties propertyFile = new Properties();
	
	public RepositoryParser(String filename) throws IOException	{
		this.RepFile = filename;
		stream = new FileInputStream(RepFile);
		propertyFile.load(stream);
	}
}
