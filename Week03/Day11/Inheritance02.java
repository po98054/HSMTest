package Day11;

public class Inheritance02 {
	
	public static void main(String[] args) {
		
		KiaCar kia = new KiaCar("Kia","핑크","하성민",123,10,4);
		
		kia.print();
		
		kia.onoff(true);
		
		for(int i = 0; i < 31; i++) {
			
		  kia.speedPlus();
			
		}
		
		HyundaiCar hyundai = new HyundaiCar("Hyundai","노랑","유재석",456,10,4);
		
		hyundai.print();
		
	}

}

class KiaCar extends Car {
	
	String kind = "소나타";
	
	KiaCar(String name, String color, String owner, int number, int speed, int tireCount) {
		
		super(name, color, owner, number, speed, tireCount);
		
	}
	
	
	public void print() {
		
		System.out.println("회사명 : " + super.name + " 차 종류 : " + kind + " 차 색깔 : " + super.color + " 차량 주인 : " + super.owner + " 차 넘버 : " + super.number);
		
	}
	
}

class HyundaiCar extends Car {
	
	String kind = "SM-5";
	
	HyundaiCar(String name, String color, String owner, int number, int speed, int tireCount) {
		
		super(name, color, owner, number, speed, tireCount);
		
	}
	
	public void print() {
		
		System.out.println("회사명 : " + super.name + " 차 종류 : " + kind + " 차 색깔 : " + super.color + " 차량 주인 : " + super.owner + " 차 넘버 : " + super.number);
		
	}	
	
}

class Car{
	
	protected String name;
	
	protected String color;
	
	protected String owner;
	
	protected int number;
	
	protected Boolean onoff;
	
	protected int speed;

	public Tire[] tires;
	
	public int tireCount;
	
	Car(String name, String color, String owner, int number, int speed, int tireCount) {
		
		this.color = color;
		
		this.name = name;
		
		this.number = number;
		
		this.owner = owner;
		
		this.speed = speed;
		
		this.tireCount = tireCount <= 0 ? 4 : tireCount;
		
		tires = new Tire[tireCount];
		
	}
	
	public void onoff(Boolean onoff) {
		
		if(onoff == false) {
			
			System.out.println("시동이 꺼져 있습니다.");
			
		} else {
			
			System.out.println("시동이 켜져 있습니다.");
			
		}
		
	}
	
	public void speedPlus() {
		
		speed = speed + 1;
		
	}
	
	public void speedMinus() {
		
		speed = speed - 1;
		
		if(speed < 0) {
			
			speed = 0;
			
		}
		
	}
	
	
}

class Tire{
	
	public String Company;
	
	public int size;
	
	public String kind;
	
	public Boolean state;
	
	Tire(String Company, int size, String kind, Boolean state) {
		
		this.Company = Company;
		
		this.size = size;
		
		this.kind = kind;
		
		this.state = state;
		
	}
	
	public void print() {
		
		if(state) {
			
			System.out.println("멈춤");
			
		} else {
			
			System.out.println("운행중입니다.");
			
		}
		
	}
	
}