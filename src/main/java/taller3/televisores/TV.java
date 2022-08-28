package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if (this.estado) {
			if (volumen >= 0 && volumen <= 7) {
				this.volumen = volumen;
			}
		}
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (this.estado) {
			if (canal >= 1 && canal <= 120) {
				this.canal = canal;
			}
		}
	}

	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (this.estado) {
			if ((getCanal() + 1) >= 1 && (getCanal() + 1) <= 120) {
				this.canal++;
			}
		}	
	}
	
	public void canalDown() {
		if (this.estado) {
			if ((getCanal() - 1) >= 1 && (getCanal() - 1) <= 120) {
				this.canal--;
			}
		}	
	}
	
	public void volumenUp() {
		if (this.estado) {
			if ((getVolumen() + 1) >= 0 && (getVolumen() + 1) <= 7) {
				this.volumen++;
			}
		}	
	}
	
	public void volumenDown() {
		if (this.estado) {
			if ((getVolumen() - 1) >= 0 && (getVolumen() - 1) <= 7) {
				this.volumen--;
			}
		}	
	}

}
