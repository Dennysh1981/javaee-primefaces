package com.tecsup.jsfprime.bean;

import javax.faces.bean.ManagedBean;
import org.primefaces.model.map.Circle;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@ManagedBean
public class MapaBean {

    private MapModel modelo = new DefaultMapModel();

    public MapaBean() {
        Circle circle = new Circle(new LatLng(-12.043729, -76.953144), 200d);
        circle.setFillColor("red");
        circle.setFillOpacity(0.2d);
        modelo.addOverlay(circle);

        modelo.addOverlay(new Marker(new LatLng(-12.043729, -76.953144), "Tecsup"));
        modelo.addOverlay(new Marker(new LatLng(-12.0421367, -76.9501667), "BCP X Mercado Productores"));
    }

    public MapModel getModelo() {
        return this.modelo;
    }

}
