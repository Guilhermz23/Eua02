import java.util.Scanner;

class Produto{
    String marca;
    String fabricante;
    String cod_barras;
    float preco;

    Produto(){

    }

    Produto(String m, String f, String c, float p){
        marca = m;
        fabricante = f;
        cod_barras = c;
        preco = p;
    }


}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Marca: ");
        produto.marca = in.nextLine();
        System.out.println("Fabricante: ");
        produto.fabricante = in.nextLine();
        System.out.println("Código de barras: ");
        produto.cod_barras = in.nextLine();
        System.out.println("Preço: ");
        produto.preco = in.nextFloat();

        System.out.println("Marca: "+ produto.marca);
        System.out.println("Fabricante: "+ produto.fabricante);
        System.out.println("Código de barras: "+ produto.cod_barras);
        System.out.println("Preço: "+ produto.preco);

       
        System.out.println("Marca: ");
        String marca = in.nextLine();
        System.out.println("Fabricante: ");
        String fabricante = in.nextLine();
        System.out.println("Código de barras: ");
        String cod_barras = in.nextLine();
        System.out.println("Preço: ");
        float preco = in.nextFloat();

        Produto produto2 = new Produto(marca, fabricante, cod_barras, preco);

        System.out.println("Marca: "+ produto2.marca);
        System.out.println("Fabricante: "+ produto2.fabricante);
        System.out.println("Código de barras: "+ produto2.cod_barras);
        System.out.println("Preço: "+ produto2.preco);

        in.close();
    }
}
