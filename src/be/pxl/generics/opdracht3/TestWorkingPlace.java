package be.pxl.generics.opdracht3;

public class TestWorkingPlace {
	public static void main(String[] args) {
		Car car = new Car();
		CircularSaw circularSaw = new CircularSaw();
		Bike bike = new Bike();
		
		WorkingPlace<Car> s = new WorkingPlace<>();
		s.startFixing(car);
		s.finished();
		s.startFixing(car);
		s.finished();
		s.startFixing(car);
		s.finished();
		
		WorkingPlaceUtility q = new WorkingPlaceUtility();
		//System.out.println(q.getScore(s));
	}
}
