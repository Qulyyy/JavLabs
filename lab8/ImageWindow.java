package lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel(BufferedImage image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}

public class ImageWindow {
    private static final String imagePath = "C:/Users/khomy/Downloads/msg-1001717781253-15732.jpg";

    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Image Viewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(image.getWidth(), image.getHeight());
                frame.add(new ImagePanel(image));
                frame.setVisible(true);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






