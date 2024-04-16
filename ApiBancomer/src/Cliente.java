
public class Cliente {
	private int numTarjeta;
	private String nombre;
	private String app;
	private String apm;
	private long celular;
	private float saldo;

	public Cliente() {
	}

	public Cliente(int numTarjeta, String nombre, String app, String apm, long celular, float saldo) {
		this.numTarjeta = numTarjeta;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.celular = celular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [numTarjeta=" + numTarjeta + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm
				+ ", celular=" + celular + ", saldo=" + saldo + "]\n";
	}

	public int getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	
}
