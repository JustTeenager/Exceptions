package com.company;

public class Main {

    public static void main(String[] args) {
		Figure f = new Figure(3);
		try {
			System.out.println("first dot ");
			f.SetCoord(0,0,0);
			System.out.println("second dot ");
			f.SetCoord(1,10,0);
			System.out.println("third dot ");
			f.SetCoord(2,10,10);
			System.out.println("fourth dot ");
			f.SetCoord(3,0,10);
		} catch (PointIndexException e) {
			System.out.println(e.getMessage() + ":" + e.getIndex());
		}
	}
}
