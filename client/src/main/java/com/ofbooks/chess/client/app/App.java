package com.ofbooks.chess.client;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Hello world!
 */
public class App {

     private JFrame gui;
     private JPanel currentView;
     private Settings settings;
   
     public App(Settings settings){
          this.settings = settings;
          this.gui = new JFrame();
          this.gui.setSize(settings.getWindowWidth(), settings.getWindowHeight());
          this.gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     public void run(){
          this.currentView = new MainMenuView(
               this,
               this.settings.getWindowWidth(), 
               this.settings.getWindowHeight(), 
               this.settings.getLargeButtonWidth(),
               this.settings.getLargeButtonHeight(),
               this.settings.getColorPallette()
               ).toJPanel();
          gui.add(currentView);
          this.gui.setVisible(true);
     }


     public void play(){

     }

     public void gameHistory(){

     }
}
