
package practica_figuras;

public class Rectangulo {
    
    private Double base;
    private Double altura;
    private Double area;
    
    public void setBase(Double base){
        this.base = base;
    }
    
    public Double getBase(){
        return this.base;
    }
    
    public void setAltura(Double altura){
        this.altura = altura;
    }
    
    public Double getAltura(){
        return this.altura;
    }
    
    public void Calcular(){
        this.area = this.base * this.altura;
    }
    
    public Double getCalcular(){
        return this.area;
    }
    
}
