package menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu implements Runnable {
    private static int height = 100, width = 120, scale = 4;
    private JFrame frame;
    private JPanel panel;

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.tela();
        new Thread(menu).start();
    }

    public void tela() {
        frame = new JFrame("System_animator.exe");
        frame.setPreferredSize(new Dimension(width * scale, height * scale));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel() {//superfice organizadora de componentes
            private static final long serialVersionUID = 1L;

            @Override//metodo nativo do java
            public void paintComponent(Graphics g) {//cria um painel encima do frame para utilização de graficos
                super.paintComponent(g);
                render(g);
            }
        };

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
         //   System.out.println("Calling the loop");
            tick();
            frame.repaint();//refaz o processo de pintura do panel
            try { // 60 fps
                Thread.sleep(1000 / 60);
            } catch (Exception e) {
                continue;
            }
        }
    }

    public void tick() {
        // Add your code for updating game logic here
    }

    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width * scale, height * scale);
        // Add your code for rendering graphics here
    }
    
}

