package lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AnimationPanel extends JPanel {
    private ImageIcon[] frames;
    private int currentFrame;

    public AnimationPanel(ImageIcon[] frames) {
        this.frames = frames;
        this.currentFrame = 0;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        frames[currentFrame].paintIcon(this, g, 0, 0);
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(int frame) {
        if (frame >= 0 && frame < frames.length) {
            currentFrame = frame;
        }
    }
}

public class AnimationWindow {
    public static void main(String[] args) {
        ImageIcon[] frames = new ImageIcon[4];
        frames[0] = new ImageIcon("C:/Users/khomy/Downloads/msg-1001717781253-15732.jpg");
        frames[1] = new ImageIcon("C:/Users/khomy/Downloads/msg-1001717781253-15733.jpg");
        frames[2] = new ImageIcon("C:/Users/khomy/Downloads/msg-1001717781253-15734.jpg");
        frames[3] = new ImageIcon("C:/Users/khomy/Downloads/msg-1001717781253-15735.jpg");

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Просмотр анимации");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(frames[0].getIconWidth(), frames[0].getIconHeight());

            AnimationPanel animationPanel = new AnimationPanel(frames);
            frame.add(animationPanel);
            frame.setVisible(true);

            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    animationPanel.repaint();
                    int nextFrame = (animationPanel.getCurrentFrame() + 1) % frames.length;
                    animationPanel.setCurrentFrame(nextFrame);
                }
            });
            timer.start();
        });
    }
}
