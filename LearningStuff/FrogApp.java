/*
 * FrogApp.java
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

class Frog {
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public String toString() {
		
		return String.format("%3d : %-10s", id, name);
		
		/*StringBuilder sb = new StringBuilder();
		sb.append(id).append(" : ").append(name);
		return sb.toString();*/
	}
}

public class FrogApp {
	
	public static void main (String args[]) {
		
		Frog frog1 = new Frog(103, "Steve");
		Frog frog2 = new Frog(104, "Sue");
		
		System.out.println(frog1);
		System.out.println(frog2);
	}
}

