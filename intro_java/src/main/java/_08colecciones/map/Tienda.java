package _08colecciones.map;

import java.util.HashMap;
import java.util.Map;

public class Tienda {
    Map<String, Articulo> articulos;

    public Tienda() {
        articulos = new HashMap<>();
    }

    public Map<String, Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Map<String, Articulo> articulos) {
        this.articulos = articulos;
    }

    public void agregarArticulo(Articulo a) {
        articulos.put(a.getNombre(), a);
    }

    public void eliminarArticulo(String nombre) {
        articulos.remove(nombre);
    }

    public void comprarArticulo(String nombreArticulo) {
        Articulo a = articulos.get(nombreArticulo);
        if (a != null) {
            a.setCantidad(a.getCantidad() - 1);
        } else {
            System.out.println("El artículo no existe en la tienda.");
        }
    }

}
