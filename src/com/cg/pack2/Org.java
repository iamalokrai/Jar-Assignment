package com.cg.pack2;

//Org class created which having regNo,name,revenue
public class Org {
	private int regNo;
	private String name;
	private double revenue;

	public Org(int regNo, String name, double revenue) { // Constructor with
															// parameters
		super();
		this.regNo = regNo;
		this.name = name;
		this.revenue = revenue;
	}

	public void disp() { // Display method to display
		System.out.println("Reg.No       Name       Revenue");
		System.out.println(+regNo + "       " + name + "       " + revenue);
	}

}
