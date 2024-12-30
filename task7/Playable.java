package myfirstprogram;

//Define an interface called Playable
interface Playable {
 void play();
 void connect(String wire);
 void football();
 void volleyball();
 void basketball();
}

//Class Game implements Playable
class Game implements Playable {
 @Override
 public void play() {
     System.out.println("Playing game...");
 }

 @Override
 public void connect(String wire) {
     System.out.println("Connecting game with " + wire + "...");
 }

 @Override
 public void football() {
     System.out.println("Playing football...");
 }

 @Override
 public void volleyball() {
     System.out.println("Playing volleyball...");
 }

 @Override
 public void basketball() {
     System.out.println("Playing basketball...");
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     // Create an instance of Game
     Game game = new Game();

     // Call methods
     game.play();
     game.connect("Wire 1");
     game.football();
     game.volleyball();
     game.basketball();
 }
}