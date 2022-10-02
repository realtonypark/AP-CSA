class Car {
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	
	Car(String modelName, int modelYear, String color, int maxSpeed) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car(String modelName) {
		this.modelName = modelName;
	}
	
	Car() {
		this("아반떼", 2016, "흰색", 200);
	}
	
	public String getModel() {
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}
}

public class prog {
	public static void main(String[] args) {
		Car car01 = new Car();
		Car car02 = new Car();
		System.out.println(car01.equals(car02));
		System.out.println(car01==car02);
		
		car01 = car02;			// 두 참조 변수가 같은 주소를 가리킴.
		System.out.println(car01.equals(car02));
		System.out.println(car01==car02);

		Car car03 = new Car("h", 1, "d", 2);
		Car car04 = new Car("h", 1, "d", 2);

		System.out.println(car03.equals(car04));
		
		car03 = car04;		
		System.out.println(car03.equals(car04));

		String a = new String("h");
		String b = new String("h");

		System.out.println(a.equals(b));
		
		a = b;		
		System.out.println(a.equals(b));

		Car s = new Car("h");
		Car d = new Car("h");

		System.out.println(s.equals(d));
		
		s = d;		
		System.out.println(s.equals(d));

	}
}