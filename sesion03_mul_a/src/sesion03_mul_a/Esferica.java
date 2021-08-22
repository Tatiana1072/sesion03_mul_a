
package sesion03_mul_a;

public class Esferica {
    private float radio, angulo1, angulo2;

    public Esferica(float radio, float angulo1, float angulo2) {
        this.radio = radio;//distancia del origen a un punto
        this.angulo1 = angulo1;//angulo con respecto a x de la proyeccion a un punto sobre el plano x, y
        this.angulo2 = angulo2;//angulo del vector formado por el punto y el origen con respecto a eje z
    }
    
    public Cartesiana cartesiana_esferica(float radio, float angulo1, float angulo2){
        float x= radio*(float)Math.sin(angulo2)*(float)Math.cos(angulo1) ;
        float y= radio*(float)Math.sin(angulo2)*(float)Math.sin(angulo1);
        float z=radio*(float)Math.cos(angulo2) ;
        return new Cartesiana (x, y, z);
    }
    public Cartesiana cartesiana_esferica(Esferica e){
        return cartesiana_esferica(e.radio, e.angulo1, e.angulo2);
    }
    
    public Esferica esferica_cartesiana(float x, float y, float z){
        float radio=(float)Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2)+ Math.pow(z, 2));
        float angulo1=(float)Math.acos(z/radio);
        float angulo2=(float)Math.atan(y/x);
        return new Esferica(radio, angulo1, angulo2); 
    }
    public Esferica esferica_cartesiana(Cartesiana c){
        return esferica_cartesiana(c.getX(), c.getY(), c.getZ());
    }
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAngulo1() {
        return angulo1;
    }

    public void setAngulo1(float angulo1) {
        this.angulo1 = angulo1;
    }

    public float getAngulo2() {
        return angulo2;
    }

    public void setAngulo2(float angulo2) {
        this.angulo2 = angulo2;
    }
    
}
