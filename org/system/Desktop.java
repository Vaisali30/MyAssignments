package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("The Dell has a 15.4 inch screen");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}

}
