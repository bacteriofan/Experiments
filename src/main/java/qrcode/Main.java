package qrcode;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void readBarcode(String fileName) throws NotFoundException {
        File f = new File(fileName);
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(f);
        } catch (IOException e) {
            e.printStackTrace();
        }

        LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
        String result = new MultiFormatReader().decode(binaryBitmap).getText();
        System.out.println(result);
    }

    public static void writeBarcode(String fileName, String content) throws WriterException, IOException {
        Path path = Paths.get(fileName);
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.AZTEC, 60, 60);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);

    }

    public static void main(String[] args) throws NotFoundException, IOException, WriterException {
        writeBarcode("myfile.png", "My name is Kseniia");
        readBarcode("myfile.png");
    }

}
