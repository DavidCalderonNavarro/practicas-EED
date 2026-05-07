package ejemplo;

public class Rectangle {

	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// Constante extraída
	private static final int TWO = 2;

	// Método renombrado: area → surface
	public int surface() {

		if (!isValid()) {
			return getInvalidValue();
		}

		return width * height;
	}

	// Método renombrado: perimetro → perimeter
	public int perimeter() {

		if (!isValid()) {
			return getInvalidValue();
		}

		return TWO * width + TWO * height;
	}

	// Extracción de validación
	private boolean isValid() {
		return width > 0 && height > 0;
	}

	// Regla de valores inválidos
	private int getInvalidValue() {
		if (width < 0 || height < 0) {
			return -1;
		}
		return 0;
	}
}