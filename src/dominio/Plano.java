package dominio;

public class Plano {
    private int x;
    private int y;

    public Plano(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setArriba(int valor){
        y+=valor;
    }
    public void setAbajo(int valor){
        y-=valor;
    }
    public void setIzquierda(int valor){
        x-=valor;
    }
    public void setDerecha(int valor){
        x+=valor;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
