package es.studium.extraervariable2;

public class ExtraerVariableLocal
{
	public static void main(String[] args)
	{
		int numero = 3;
		String mensaje = "El factorial de "; //Refactor -> Extract Local Variable (solo lo podremos usar en el método main)
		String es = " es ";
		System.out.println(mensaje + numero + es + calcularFactorial(numero));
		numero = 5;
		System.out.println(mensaje + numero + es + calcularFactorial(numero));
	}

	public static double calcularFactorial(double n)
	{
		if (n == 0)
		{
			return 1;
		} else
		{
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}
}
