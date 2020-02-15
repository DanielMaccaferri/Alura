
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3800.00;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Sua aliquota desse ano é de 7.5%= R$142.00");

		} else {
			if (salario >= 2800.01 && salario <= 3751.0) {
				System.out.println("Sua aliquota desse ano é de 15%= R$350.00");
			} else {
				if (salario >= 3751.01 && salario <= 4664.0) {
					System.out.println("Sua aliquota desse ano é de 22.5%= R$636.00");
				}
			}
		}
	}
}
