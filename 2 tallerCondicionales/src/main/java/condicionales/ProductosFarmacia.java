package condicionales;

public class ProductosFarmacia {
    private String codigo;
    private String producto;
    private double precio;

    public ProductosFarmacia(String codigo, String producto, double precio) {
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }
}
