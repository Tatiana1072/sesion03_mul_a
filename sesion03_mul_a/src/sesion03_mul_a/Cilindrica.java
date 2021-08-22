package sesion03_mul_a;

public class Cilindrica {
private float radio, angulo, z;
    public Cilindrica(float radio, float angulo, float z) {
        this.radio = radio;//radio de la base cilindrica
        this.angulo = angulo;
        this.z = z;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Cilindrica() {
        
    }
     public Cartesiana cilindrico_cartesiano(float radio, float angulo, float z) {
        float x = radio * (float)Math.cos(angulo);
        float y = radio * (float)Math.sin(angulo);
        return new Cartesiana(x, y, z);
     }
     public Cartesiana cilindrico_cartesiano(Cilindrica c){
      return cilindrico_cartesiano(c.getRadio(), c.getAngulo(), c.getZ());
      }
     public Cilindrica cartesiano_cilindrico(float x, float y, float z) { //reciba un carteciano y retorne un polar
        float radio = (float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)); 
        float angulo = (float)Math.atan(y/x);  
        return new Cilindrica(radio, angulo, z);
    }
    public Cilindrica cartesiano_cilindrico(Cartesiana c){
        return cartesiano_cilindrico(c.getX(), c.getY(), c.getZ());
    }
}
