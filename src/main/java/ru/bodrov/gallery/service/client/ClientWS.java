package ru.bodrov.gallery.service.client;

public class ClientWS {
    private static PictureWS service = new PictureWS();
    public static void main(String[] args){
        IPicture port = service.getPictureWS();
        for(PictureDTO picture :port.getListPicture()){
            System.out.println(picture.titlePicture + " - " + picture.valueBalance);
        }
    }
}
