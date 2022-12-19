package com.cisco.features;

import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

public class Operations {
	public String createfile(String filename) {
		String folder="C:\\Users\\vinnambu\\Documents\\Phase_1\\Project_1\\src\\Files_available";
		File f= new File(folder,filename);
		try {
			boolean result=f.createNewFile();
			if(result)
				return "Successfully created";
			else
				return "failed to create file";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "failed to create";
	}
	
	public String deletefile(String filename) {
		String folder="C:\\Users\\vinnambu\\Documents\\Phase_1\\Project_1\\src\\Files_available";
		File f= new File(folder,filename);
		try {
			boolean result=f.delete();
			if(result)
				return "Deleted successfully";
			else
				return "File Not Found";
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "File Not Found";
	}
	
	public TreeSet<String> ascendingorder(){
		TreeSet<String> filenames=new TreeSet<String>();
		String directpath="C:\\Users\\vinnambu\\Documents\\Phase_1\\Project_1\\src\\Files_available";
		File dirmain=new File(directpath);
		File filesarr[]=null;
		if(dirmain.exists() && dirmain.isDirectory()) {
			filesarr=dirmain.listFiles();
		}
		for(File f: filesarr) {
			filenames.add(f.getName());
		}
		return filenames;
	}
	
	public boolean search(String filename) {
		TreeSet<String> filenames=this.ascendingorder();
		for(String i: filenames) {
			if(i.equals(filename))
				return true;
		}
		return false; 
	}

}
