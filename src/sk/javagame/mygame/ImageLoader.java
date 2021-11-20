package sk.javagame.mygame;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    public static BufferedImage loadImage(String pathUrl){
        File path;
        try {
            path = new File(ImageLoader.class.getResource(pathUrl).getPath());
            return ImageIO.read(path);
        }catch (IOException e){
            System.err.println("error image reading: " + e);
        }
        return null;
    }
}
