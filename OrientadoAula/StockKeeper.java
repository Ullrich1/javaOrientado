public class StockKeeper
{
        private String name;
        StockKeeper(String name){
            setName(name);
        }
        
        public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies){
            
            //Definindo os estados e comportamentos do album
            album.setName(name);
            album.setArtist(artist);
            album.setPrice(price);
            album.setNumberOfCopies(numberOfCopies);
            
            //imprimindo detalhes do album
            System.out.println("Album gerenciado por:"+getName());
            System.out.println("detalhes do album::::::::::");
            System.out.println("Nome do album: "+album.getName());
            System.out.println("Artista do album: "+album.getArtist());
            System.out.println("Preço do album: "+album.getPrice());
            System.out.println("Número de cópias do album: "+album.getNumberOfCopies());
            }
            
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        }
