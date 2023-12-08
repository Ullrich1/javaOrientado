public class Main1
{
    public static void main(String args[]){
        StockKeeper johnDoe = new StockKeeper("John Doe");
        
        //o gerenciador de estoque cria um album e atribui valores negativos
        //para o preço e o numero de cópias disponíveis 
        
        johnDoe.manageAlbum(new Album(), "Slippery When Wet", "Bon Jovi", -1000.00, -50);
    }
}
