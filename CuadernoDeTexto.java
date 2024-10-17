public class CuadernoDeTexto {

    private String nombreFabricante;
    private int numeroHojas;
    private boolean hojasCuadriculadas;
    
    public CuadernoDeTexto(String nombreDelFabricante, int numeroDeHojas) {
        nombreFabricante = nombreDelFabricante;
        numeroHojas = numeroDeHojas;
        hojasCuadriculadas = true;
    }
    
    public String getFabricante() {
        return nombreFabricante;
    }
    
    public int getNumeroHojas() {
        return numeroHojas;
    }
    
    public boolean getCuadricula() {
        return hojasCuadriculadas;
    }
    
    public void setFabricante(String nombreDelFabricante) {
        nombreFabricante = nombreDelFabricante;
    }
    
    public void añadirHojas(int hojasAñadidas) {
        numeroHojas = numeroHojas + hojasAñadidas;
    }
    
    public void alterarCuadricula() {
        if (hojasCuadriculadas == true) {
            hojasCuadriculadas = false;
        }
        else {
            hojasCuadriculadas = true;
        }
    }
    
    
    
}