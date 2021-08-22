
package sesion03_mul_a;

public class Cartesiana {

    private float x;
    private float y;
    private float z;

    public Cartesiana(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Cartesiana() {
    }

    public Cartesiana polar_cartesiano(float radio, float angulo) {
        float x = radio * (float)Math.cos(angulo);
        float y = radio * (float)Math.sin(angulo);
        Cartesiana r=new Cartesiana(x, y, z); //esta es la otra forma de hacer
        return r;
        //return new Cartesiana(x, y);  //Esta es una forma corta de hacer
    }
    public Cartesiana polar_cartesiano(Polar p){
      return polar_cartesiano(p.getRadio(), p.getAngulo());
      }
    
    public Polar cartesiano_polar(float x, float y) { //reciba un carteciano y retorne un polar
        float radio = (float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)); 
        float angulo = (float)Math.tan(y/x);  
        return new Polar(radio, angulo);
    }
    public Polar cartesiano_polar(Cartesiana c){
        return cartesiano_polar(c.getX(), c.getY());
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }
public float getZ() {
        return z;
    }
    public void setX(float x) {
        this.x = x;
    }

}

