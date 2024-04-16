
public interface Metodos {
	
	public void guardar(Cliente clientes);

	public Cliente buscar(int indice);
	
	public void mostraNumTarjeta(int numTarjeta);
	
	public void depoNumTarjeta(int numTarjeta, float saldo);
	
	public void retiroNumTarjeta(int numTarjeta, float saldo);


}
