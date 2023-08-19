
public class Circulo {
    private double radio=5;
    private String color="azul";
    
    public Circulo() {
        this.color=color;
        this.radio=radio;
    }

    public Circulo(double radio) {
        this.radio=radio;
    }
    

    public double getRadio() {
        return radio;
    }
    
    public double getArea(){
        double radius= radio;
        return radius*radius*Math.PI;
    }
    //i
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
}

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
}