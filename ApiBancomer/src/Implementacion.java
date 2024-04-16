import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {
	List<Cliente> listaCliente = new ArrayList<Cliente>();

	@Override
	public void guardar(Cliente clientes) {
		// TODO Auto-generated method stub
		boolean bandera = false;
		for (Cliente c : listaCliente) {
			if (c.getNumTarjeta() == clientes.getNumTarjeta()) {
				System.out.println("\nEL NUMERO DE TARJETA YA EXISTE\n");
				bandera = true;
				break;
			}
		}
		if (bandera == false) {
			listaCliente.add(clientes);
			System.out.println("SE GUARDO CORRECTAMENTE\n");

		}

	}

	@Override
	public Cliente buscar(int indice) {
		// TODO Auto-generated method stub
		return listaCliente.get(indice);
	}

	@Override
	public void mostraNumTarjeta(int numTarjeta) {
		boolean bandera = false;
		for (int i = 0; i < listaCliente.size(); i++) {
			if (listaCliente.get(i).getNumTarjeta() == numTarjeta) {
				System.out.println("Se encontro el Numero de Tarjeta: " + listaCliente.get(i).getNumTarjeta()
						+ "\n Con un Saldo de: " + listaCliente.get(i).getSaldo());
				bandera = true;
			}
		}
		if (bandera == false) {
			System.out.println("EL Numero de Tarjeta NO EXISTE");

		}
	}

	@Override
	public void depoNumTarjeta(int numTarjeta, float saldo) {
		boolean bandera = false;

		for (int i = 0; i < listaCliente.size(); i++) {
			if (listaCliente.get(i).getNumTarjeta() == numTarjeta) {
				if (saldo < 0 || saldo >= 10000) {
					System.out.println("No puedes realizar depositos menores a 0 ni mayor o igual a 10000\n");
					break;
				} else if (saldo > 0 || saldo < 10000) {
					listaCliente.get(i).setSaldo(listaCliente.get(i).getSaldo() + saldo);
					System.out.println("Tu saldo ahora es de: " + listaCliente.get(i).getSaldo() + "\n");
					bandera = true;
				}

			}

		}
		if (bandera == false) {
			System.out.println("EL Numero de Tarjeta NO EXISTE \n");
		}

	}

	@Override
	public void retiroNumTarjeta(int numTarjeta, float saldo) {
		boolean bandera = false;
		
		for (int i = 0; i < listaCliente.size(); i++) {
			
			if (listaCliente.get(i).getNumTarjeta() == numTarjeta) {

				if (saldo > listaCliente.get(i).getSaldo() || saldo <= 0 || saldo >= 10000) {
					
					System.out.println("No puedes realizar retiros menores a 0 ni mayor o igual a 10000\n");
					break;
				} else if (saldo > 0 || saldo < 10000) {
					listaCliente.get(i).setSaldo(listaCliente.get(i).getSaldo() - saldo);
					System.out.println("Tu saldo ahora es de: " + listaCliente.get(i).getSaldo() + "\n");
					bandera = true;
				}
			}
			if (bandera == false) {
				System.out.println("EL Numero de Tarjeta NO EXISTE \n");
			}
		}

	}

}
