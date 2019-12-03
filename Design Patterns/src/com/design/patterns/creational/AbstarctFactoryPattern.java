package com.design.patterns.creational;

/**
 * @author nisshukl0
 *
 *         Abstract Product interface
 */
interface Design {
	// Marker interface for Product
}

/**
 * @author nisshukl0
 *
 *         Concrete Product class
 */
class Parts implements Design {
	private String specifications;

	public Parts(String specification) {
		this.specifications = specification;
	}

	public void setSpecifications(String specs) {
		specifications = specs;
	}

	public String getSpecifications() {
		return specifications;
	}
}

/**
 * @author nisshukl0
 *
 *         Concrete Product class
 */
class Shade implements Design {
	private String color;

	public Shade(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

enum CarType {
	BMW, BEN_Q;
}

/**
 * @author nisshukl0
 * 
 *         abstract Product class
 *
 */
interface Car {
	public Parts getWheel();

	public Parts getMirror();

	public Parts getEngine();

	public Shade getBody();
}

/**
 * @author nisshukl0
 *
 *         concrete product class
 * 
 */
class BMW implements Car {

	@Override
	public Parts getWheel() {
		return new Parts("BMW WHEELS");
	}

	@Override
	public Parts getMirror() {
		return new Parts("BMW MIRRORS");
	}

	@Override
	public Parts getEngine() {
		return new Parts("BMW ENGINE");
	}

	@Override
	public Shade getBody() {
		return new Shade("MIRROR BLACK");
	}

}

/**
 * @author nisshukl0
 *
 *         concrete factory class
 * 
 */
class BenQ implements Car {

	@Override
	public Parts getWheel() {
		return new Parts("BenQ WHEELS");
	}

	@Override
	public Parts getMirror() {
		return new Parts("BenQ MIRRORS");
	}

	@Override
	public Parts getEngine() {
		return new Parts("BenQ ENGINE");
	}

	@Override
	public Shade getBody() {
		return new Shade("ROSE RED");
	}
}

/**
 * @author nisshukl0
 * 
 *         car factory
 *
 */
class CarFactory {

	private CarFactory() {
		// do nothing
	}

	public static Car getcar(CarType carType) {
		if (carType.equals(CarType.BEN_Q)) {
			return new BenQ();
		} else if (carType.equals(CarType.BMW)) {
			return new BMW();
		} else {
			System.out.println("No car of the given type found");
			return null;
		}
	}
}

/**
 * @author nisshukl0
 *
 *         client
 *
 */
public class AbstarctFactoryPattern {

	public static void main(String[] args) {
		Car bmw = CarFactory.getcar(CarType.BEN_Q);
		Car benQ = CarFactory.getcar(CarType.BMW);
		System.out.println(
				"BMW car specs :: [ " + bmw.getWheel().getSpecifications() + "," + bmw.getEngine().getSpecifications()
						+ "," + bmw.getMirror().getSpecifications() + "," + bmw.getBody().getColor() + "]");
		System.out.println("BenQ car specs :: [ " + benQ.getWheel().getSpecifications() + ","
				+ benQ.getEngine().getSpecifications() + "," + benQ.getMirror().getSpecifications() + ","
				+ benQ.getBody().getColor() + "]");
	}
}
