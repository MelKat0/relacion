package aula10;

public class MainCar {

	public static void main(String[] args) {
		Motor motor = new Motor("V8");
		Carro carro = new Carro("Mustang", motor);
		
		System.out.println("Carro é: " + carro.getModelo() + "\nMotor: " + motor.getTipo());
	}

}
