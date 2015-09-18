package br.com.projetolab3gui.utils;

import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.Toolkit;  
import javax.swing.JDesktopPane;  
  
public class PreenchimentoFundo extends JDesktopPane {  
  
   private static final long serialVersionUID = 1L;  
   Image imagem;  
  
   public PreenchimentoFundo(String caminho) {  
      imagem = Toolkit.getDefaultToolkit().getImage(getClass().getResource(caminho));
   }  
  
    @Override
   public void paintComponent(Graphics g) {  
      super.paintComponent(g);  
      if(imagem != null)   {  
         g.drawImage(imagem, 0, 0, this.getWidth(), this.getHeight(), this);   
      }  
   }  
}
