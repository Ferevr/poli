package POL;
public class Factura implements PorPagar{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;
    
    //Se crea constructor
    public Factura (String pieza, String descripcion, int cuenta, double precio){
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        // se llaman los metodos 
        setCantidad(cuenta);
        setPrecioPorArticulo (precio);
       
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if(cantidad>=0){
            this.cantidad = cantidad;
        } else {
            throw new IllegalArgumentException ("La cantidad debe de ser mayor a 0");
        }
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precio) {
        if (precio >0){
            precioPorArticulo = precio;
        } else {
            throw new IllegalArgumentException ("El precio debe de ser mayor a 0");
        }
    }
    
     @Override
     public String toString(){
        return String.format("%s:\n%s:%s(%s)\n%s: %d \n%s: $%,.2f", "Factura", "Numero De Pieza", getNumeroPieza(), getDescripcionPieza(), "Cantidad", getCantidad(), "Precio de articulo", getPrecioPorArticulo());
     }
     
     @Override
     public double ObtenerMontoPago(){ // Se calcula el costo total
         return getCantidad()*getPrecioPorArticulo();
     }
    
}
