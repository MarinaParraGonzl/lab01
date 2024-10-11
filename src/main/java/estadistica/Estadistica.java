package estadistica;

public class Estadistica {

    private int numElementos;
    private double sumaX;
    private double sumaX2;

    /// Agerga el dato d a la serie
    ///
    /// @param d: valor.
    public void agrega (double d){
        numElementos+=1;
        sumaX += d;
        sumaX2 += d*d;
    }

    /// Agrega el dato d un numero n veces a la serie
    ///
    /// @param d: valor.
    /// @param n: repeticiones.

    public void agrega (double d, int n){
        numElementos+=n;
        sumaX += n*d;
        sumaX2 += n*d*d;
    }
    /// Devuelve la media de la serie
    public double media(){
        return sumaX/numElementos;
    }
    /// Devuelve la varianza de la serie
    public double varianza(){
        return (sumaX2/numElementos) - Math.pow(media(),2);
    }
    /// Devuelve la desviacion tipica de la serie
    public double desviacionTipica(){
        return Math.sqrt(varianza());
    }
}
