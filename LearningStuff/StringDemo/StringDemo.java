/*
 * StringDemo.java
 * 
 * Copyright 2016 Scott <Scott@SPEEDY>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


import java.io.*;

public class StringDemo {
	
	public static void main (String args[]) throws IOException {
		
		DataInputStream d = new DataInputStream(System.in);
		
		System.out.print("How many fruits do you like? : ");
		int nfruits = Integer.parseInt(d.readLine());
		
		String s[] = new String[nfruits];//String object array
		
		System.out.println("\nEnter "+ nfruits + " names of fruits.");
		for (int i = 0; i < nfruits; i++) {
			s[i] = d.readLine();
		}
		
		//Sorting
		String temp;
		for (int i = 0; i < nfruits; i++) {
			for (int j = i + 1; j < nfruits; j++) {
				if ((s[i].compareTo(s[j])) > 0) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		
		System.out.println("After sorting list of fruits: ");
		for (int i = 0; i < nfruits; i++) {
			System.out.println(s[i].toUpperCase());
		}
	}
}

