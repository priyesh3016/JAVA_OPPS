package Abstraction.javaConcept;

public class AbstractCarTesla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Car = new Tesla();
		Car.start();
	}

}


//“In Java, abstraction is used to hide implementation details and show only essential features.
//For example, I created an abstract class Car with an abstract method start(). It doesn’t define how the car starts — it only defines that every car must have a start function.
//
//Then a class like Tesla extends Car and provides its own implementation, such as ‘Start with AI system’.
//
//This is useful in automation because different browsers or modules may behave differently, but they follow a common structure.
//For example, Selenium WebDriver is an interface, and each browser (Chrome, Firefox, Edge) implements the methods differently internally.
//So abstraction helps us write flexible, scalable test automation frameworks.”