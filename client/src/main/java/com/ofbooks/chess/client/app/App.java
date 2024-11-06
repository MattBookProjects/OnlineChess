package com.ofbooks.chess.client;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Hello world!
 */
public class App {

     private JFrame gui;
     private JPanel currentViewPanel;
     private Settings settings;
     private ViewFactory viewFactory;
   
     public App(Settings settings){
          this.settings = settings;
          this.gui = new JFrame();
          this.gui.setSize(settings.getWindowWidth(), settings.getWindowHeight());
          this.gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.viewFactory = new ViewFactory(
               this,
               settings.getWindowWidth(),
               settings.getWindowHeight(),
               settings.getLargeButtonWidth(),
               settings.getLargeButtonHeight(),
               settings.getSmallButtonWidth(),
               settings.getSmallButtonHeight(),
               settings.getColorPallette()
          );

     }

     public void run(){
          this.mainMenu();
          this.gui.setVisible(true);
     }

     public void mainMenu(){
          this.render(this.viewFactory.createMainMenuView());
     }

     public void play(){
          this.render(this.viewFactory.createPlayMenuView());
     }

     public void gameHistory(){

     }

     public void playVsComputer(){

     }

     public void playOnline(){

     }

     public void render(View view){
          if(this.currentViewPanel != null){
               this.gui.remove(this.currentViewPanel);
          } 
          this.currentViewPanel = view.toJPanel();
          this.gui.add(this.currentViewPanel);
          this.gui.repaint();
     }
}
