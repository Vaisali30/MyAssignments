package week1.day1;

public class car {
	public void insertingKEY() {
		System.out.println("1].Insert KEY to start an car engine");
	}
	public void applyBreak() {
		System.out.println("2].Apply an Break");
	}
	public void applyClutch() {
		System.out.println("3].Apply an Clutch");
	}
	public void ReleaseHandbreak() {
		System.out.println("4].Release the HandBreak to move a car");
	}
	public void Gear() {
		System.out.println("5].Put a GEAR for Increasing Speed or Force");
	}
	public void driveAcar() {
		System.out.println("6].We can Drive an car");
	}
	public void Adjustmirror() {
		System.out.println("7].Adjusting the Side mirrors and Back mirror");
	}
	public void Seatbelt() {
		System.out.println("8].Wearing a Seatbelt for our safety");
	}
	public void SetSeating() {
		System.out.println("9].Setting the seat position");
	}
	public void music() {
		System.out.println("10].Turn on the music player");
	}
	public void switchonAC() {
		System.out.println("11].Switch on the AC and adjusting the wings ");
	}
	public void light() {
		System.out.println("12].Turn ON/OFF the car front light");
	}
	public void Wiper() {
		System.out.println("13].turn ON/OFF the wiperblade when it rains");
	}
	public void Indicators() {
		System.out.println("14].Turn on/off the LEFT & RIGHT Indicators");
	}
	public void CheckFuel() {
		System.out.println("15].Checks the fuel tank whether it is full or empty");
	}
	public static void main(String[] args) {
		car car=new car();
		car.insertingKEY();
		car.applyBreak();
		car.applyClutch();
		car.ReleaseHandbreak();
		car.Gear();
		car.driveAcar(); 
		car.Adjustmirror(); 
		car.Seatbelt();
		car.SetSeating();
		car.music();
		car.switchonAC();
		car.light();
		car.Wiper();
		car.Indicators();
		car.CheckFuel();
	}
}

