package brickproject;

/**
 *
 * @author apulus8050
 */
public class Wall {
    private double _h;
    private double _w;
    
    public Wall() {
        _h = 0;
        _w = 0;
    }
    
    public Wall(double height, double width) {
        _h = height;
        _w = width;
    }
    
    public void setHeight(double height) {
        _h = height;
    }
    public double getHeight() {
        return _h;
    }
    
    public void setWidth(double width) {
        _w = width;
    }
    public double getWidth() {
        return _w;
    }
    
    public double getArea() {
        return _w * _h;
    }
    
}
