import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarar variables

		Scanner leer = null;

		// Atributos
		int numTarjeta;
		String nombre;
		String app;
		String apm;
		long celular;
		float saldo;

		// Variables de tipo objeto
		Cliente clientes = null;

		int mPrincipal, sMenu, Indice;
		// instancia de la clase
		Implementacion imple = new Implementacion();
		try {
			do {

				System.out.println("MENU BANCOMER BIENVENIDO");
				System.out.println("1.-Alta cliente");
				System.out.println("2.-Consultar saldo");
				System.out.println("3.-Deposito en efectivo");
				System.out.println("4.-Retiro de efectivo");
				System.out.println("5.-SALIR");

				leer = new Scanner(System.in);
				mPrincipal = leer.nextInt();

				if (mPrincipal <= 0 || mPrincipal >= 6) {
					System.out.println("INGRESA UNA OPCION CORRECTA");
				}

				else if (mPrincipal > 1 || mPrincipal <= 5) {

					switch (mPrincipal) {
					case 1:
						try {
							System.out.println("Ingrese el numero de tarjeta");
							leer = new Scanner(System.in);
							numTarjeta = leer.nextInt();
							System.out.println("Ingrese el Nombre del Cliente");
							leer = new Scanner(System.in);
							nombre = leer.nextLine();
							System.out.println("Ingrese el Apellido Paterno");
							leer = new Scanner(System.in);
							app = leer.nextLine();
							System.out.println("Ingrese el Apellido Materno");
							leer = new Scanner(System.in);
							apm = leer.nextLine();
							System.out.println("Ingrese el Numero de Celular");
							leer = new Scanner(System.in);
							celular = leer.nextLong();
							System.out.println("Ingrese el Monto a Depositar");
							leer = new Scanner(System.in);
							saldo = leer.nextFloat();

							// objeto
							clientes = new Cliente(numTarjeta, nombre, app, apm, celular, saldo);

							// guardar
							imple.guardar(clientes);

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("ERROR AL GUARDAR" + e.getMessage());
						}

						break;
					case 2:
						System.out.println("CONSULTAR SALDO");
						try {
							// BUSQUEDA
							System.out.println("Ingrese el Numero de Tarjeta a BUSCAR");
							leer = new Scanner(System.in);
							numTarjeta = leer.nextInt();

							imple.mostraNumTarjeta(numTarjeta);

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("INGRESE UN NUMERO DE TARJETA CORRECTO");
						}

						break;
					case 3:
						try {
							System.out.println("DEPOSITO EN EFECTIVO");

							System.out.println("Ingrese el Numero de Tarjeta ");
							leer = new Scanner(System.in);
							numTarjeta = leer.nextInt();

							System.out.println("Ingrese el Monto a Depositar");
							leer = new Scanner(System.in);
							saldo = leer.nextFloat();

							imple.depoNumTarjeta(numTarjeta, saldo);

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("INGRESE EL DATO CORRECTO");
						}

						break;
					case 4:
						try {
							System.out.println("RETIRO EN EFECTIVO");

							System.out.println("Ingrese el Numero de Tarjeta ");
							leer = new Scanner(System.in);
							numTarjeta = leer.nextInt();

							System.out.println("Tu saldo actual es de: " + clientes.getSaldo());

							System.out.println("\nIngrese el Monto a Retirar");
							leer = new Scanner(System.in);
							saldo = leer.nextFloat();

							imple.retiroNumTarjeta(numTarjeta, saldo);

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("INGRESE EL DATO CORRECTO");
						}

						break;
					case 5:
						System.out.println("GRACIAS REGRESE PRONTO");

						break;
					}
				}

			} while (mPrincipal < 5);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("INGRESE UNA OPCION VALIDA " + e.getMessage());
		}
	}

}
