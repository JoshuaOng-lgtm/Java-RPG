import arc.*;
import java.awt.*;
import java.awt.image.*;

public class RPGMethods{
  
  // PAUSE METHOD
  
  public static void pause(int intMS) {
    try{
      Thread.sleep(intMS);
    }catch(InterruptedException e) {
    }
  }
  
  // Instructions Method
  
  public static void Instructions(Console con){
    BufferedImage Instructions = con.loadImage("Instruction Screen.png"); // Loading the instructions screen
    con.drawImage(Instructions, 0,0);
    con.repaint();
  }
  
  // Game Over Screen 1 Method
  public static void GameOver(Console con){
    BufferedImage GameOver = con.loadImage("Game Over Screen.png"); // Loading the Game Over Screen
    con.drawImage(GameOver, 0, 0);
    con.repaint();
  }
  public static void GameOver2(Console battle){
    BufferedImage GameOver2 = battle.loadImage("Game Over Screen 2.png"); // Loading the Game Over Screen
    battle.drawImage(GameOver2, 0, 0);
    battle.repaint();
  }
  // HUD Drawing Method
  public static void HUDDisplay(String strName, int intHP, int intTotalHP, int intAttack, int intDefense, Console con){
    BufferedImage Menu = con.loadImage("Menu.png"); // Loading the menu into the map screen.
    con.drawImage(Menu, 0, 600);
    Font FFVII = con.loadFont("Final_Fantasy_I_PSX_-_Part_B.ttf", 50);
    con.setDrawFont(FFVII);
    con.setTextFont(FFVII);
    con.setTextColor(Color.WHITE);
    con.setDrawColor(Color.WHITE);
    con.drawString("Name: "+strName, 25,630);
    con.drawString("HP: "+intHP+"/"+intTotalHP, 25, 700);
    con.drawString("Attack: "+intAttack, 25, 770);
    con.drawString("Defense: "+intDefense, 25, 840);
    con.repaint();
  }
  
  // Drawing the Battle HUD for Enemy 1
  
  public static void BattleHUDEn1(String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, Console battle){
    BufferedImage PlayerMenu = battle.loadImage("Battle Menu.png"); // Loading the menu into the map screen.
    BufferedImage Enemy1 = battle.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    
    battle.drawImage(PlayerMenu, 0, 400);
    battle.drawImage(PlayerMenu, 410, 400);
    Font FFVII = battle.loadFont("Final_Fantasy_I_PSX_-_Part_B.ttf", 42);
    battle.setDrawFont(FFVII);
    battle.setTextFont(FFVII);
    battle.setTextColor(Color.WHITE);
    battle.setDrawColor(Color.WHITE);
    battle.drawString("Name: "+strName, 417,422);
    battle.drawString("HP: "+intHP+"/"+intTotalHP, 422, 460);
    battle.drawString("Attack: "+intAttack, 422, 520);
    battle.drawString("Defense: "+intDefense,422, 580);
    battle.drawString("Attack", 672, 462);
    battle.drawString("Guard", 672, 512);
    battle.drawString("Flee", 672, 562);
    battle.drawString("Enemy: Slicer Beetle", 7, 422);
    battle.drawString("HP: "+intEnHP+"/"+intEnTotalHP, 12, 460); // 50
    battle.drawString("Attack: "+intEnAttack, 12, 520); // 15
    battle.drawString("Defense: "+intEnDefense, 12, 580); // 0
    battle.repaint();
  }
  // Drawing the Battle HUD for Enemy 2
  
  public static void BattleHUDEn2(String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, Console battle){
    BufferedImage PlayerMenu = battle.loadImage("Battle Menu.png"); // Loading the menu into the map screen.
    BufferedImage Enemy2 = battle.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable
    
    battle.drawImage(PlayerMenu, 0, 400);
    battle.drawImage(PlayerMenu, 410, 400);
    Font FFVII = battle.loadFont("Final_Fantasy_I_PSX_-_Part_B.ttf", 42);
    battle.setDrawFont(FFVII);
    battle.setTextFont(FFVII);
    battle.setTextColor(Color.WHITE);
    battle.setDrawColor(Color.WHITE);
    battle.drawString("Name: "+strName, 417,422);
    battle.drawString("HP: "+intHP+"/"+intTotalHP, 422, 460);
    battle.drawString("Attack: "+intAttack, 422, 520);
    battle.drawString("Defense: "+intDefense,422, 580);
    battle.drawString("Attack", 672, 462);
    battle.drawString("Guard", 672, 512);
    battle.drawString("Flee", 672, 562);
    battle.drawString("Enemy: Sharp Sheller", 7, 422);
    battle.drawString("HP: "+intEnHP+"/"+intEnTotalHP, 12, 460); // 85
    battle.drawString("Attack: "+intEnAttack, 12, 520); // 15
    battle.drawString("Defense: "+intEnDefense, 12, 580); // 3
    battle.repaint();
  }
  // Drawing the Battle HUD for Midboss 1
  
  public static void BattleHUDMid1(String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, Console battle){
    BufferedImage PlayerMenu = battle.loadImage("Battle Menu.png"); // Loading the menu into the map screen.
    BufferedImage MidBoss1 = battle.loadImage("MidBoss1.png"); // Loading the first midboss into a MidBoss1 variable
    
    battle.drawImage(PlayerMenu, 0, 400);
    battle.drawImage(PlayerMenu, 410, 400);
    Font FFVII = battle.loadFont("Final_Fantasy_I_PSX_-_Part_B.ttf", 42);
    battle.setDrawFont(FFVII);
    battle.setTextFont(FFVII);
    battle.setTextColor(Color.WHITE);
    battle.setDrawColor(Color.WHITE);
    battle.drawString("Name: "+strName, 417,422);
    battle.drawString("HP: "+intHP+"/"+intTotalHP, 422, 460);
    battle.drawString("Attack: "+intAttack, 422, 520);
    battle.drawString("Defense: "+intDefense,422, 580);
    battle.drawString("Attack", 672, 462);
    battle.drawString("Guard", 672, 512);
    battle.drawString("Flee", 672, 562);
    battle.drawString("Midboss: Evil Knight", 7, 422);
    battle.drawString("HP: "+intEnHP+"/"+intEnTotalHP, 12, 460);; // 200
    battle.drawString("Attack: "+intEnAttack, 12, 520); // 30
    battle.drawString("Defense: "+intEnDefense, 12, 580); // 10
    battle.repaint();
  }
  
  // Drawing the Battle HUD for Midboss 2
  
  public static void BattleHUDMid2(String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, Console battle){
    BufferedImage PlayerMenu = battle.loadImage("Battle Menu.png"); // Loading the menu into the map screen.
    BufferedImage MidBoss2 = battle.loadImage("MidBoss2.png"); // Loading the second midboss into a MidBoss2 variable
    
    battle.drawImage(PlayerMenu, 0, 400);
    battle.drawImage(PlayerMenu, 410, 400);
    Font FFVII = battle.loadFont("Final_Fantasy_I_PSX_-_Part_B.ttf", 42);
    battle.setDrawFont(FFVII);
    battle.setTextFont(FFVII);
    battle.setTextColor(Color.WHITE);
    battle.setDrawColor(Color.WHITE);
    battle.drawString("Name: "+strName, 417,422);
    battle.drawString("HP: "+intHP+"/"+intTotalHP, 422, 460);
    battle.drawString("Attack: "+intAttack, 422, 520);
    battle.drawString("Defense: "+intDefense,422, 580);
    battle.drawString("Attack", 672, 462);
    battle.drawString("Guard", 672, 512);
    battle.drawString("Flee", 672, 562);
    battle.drawString("Midboss: Dual-Head Cerberus", 7, 422);
    battle.drawString("HP: "+intEnHP+"/"+intEnTotalHP, 12, 460); // 230
    battle.drawString("Attack: "+intEnAttack, 12, 520); // 40
    battle.drawString("Defense: "+intEnDefense, 12, 580); // 8
    battle.repaint();
  }
  // Drawing the Battle HUD for Boss
  
  public static void BattleHUDBoss(String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, Console battle){
    BufferedImage PlayerMenu = battle.loadImage("Battle Menu.png"); // Loading the menu into the map screen.
    BufferedImage Boss = battle.loadImage("Boss.png"); // Loading the boss into a Boss variable
    
    battle.drawImage(PlayerMenu, 0, 400);
    battle.drawImage(PlayerMenu, 410, 400);
    Font FFVII = battle.loadFont("Final_Fantasy_I_PSX_-_Part_B.ttf", 42);
    battle.setDrawFont(FFVII);
    battle.setTextFont(FFVII);
    battle.setTextColor(Color.WHITE);
    battle.setDrawColor(Color.WHITE);
    battle.drawString("Name: "+strName, 417,422);
    battle.drawString("HP: "+intHP+"/"+intTotalHP, 422, 460);
    battle.drawString("Attack: "+intAttack, 422, 520);
    battle.drawString("Defense: "+intDefense,422, 580);
    battle.drawString("Attack", 672, 462);
    battle.drawString("Guard", 672, 512);
    battle.drawString("Flee", 672, 562);
    battle.drawString("Boss: Behemoth King", 7, 422);
    battle.drawString("HP: "+intEnHP+"/"+intEnTotalHP, 12, 460); // 500
    battle.drawString("Attack: "+intEnAttack, 12, 520); // 75
    battle.drawString("Defense: "+intEnDefense, 12, 580); // 15
    battle.repaint();
  }
  // Drawing the first RPG map
  
  public static String[][] loadRPGMap(String strFile){
    
    String strRPGMap[][] = new String[20][20];
    
    String strMapLine; // Reading each line of the first map the .csv file
    int intLineCount = 0;
    
    
    
    TextInputFile Map = new TextInputFile(strFile); // Opening the first map file for reading
    while(Map.eof() == false){ // While loop that reads to the end of the file
      strMapLine = Map.readLine(); // Using a variable to store each line
      strRPGMap[intLineCount] = strMapLine.split(","); // Splitting the line into different columns separated by commas.
      intLineCount++;
    }
    return strRPGMap;
  }
  
  // Enemy Checker
  
  public static int EnemyCount(String strMap[][]){
    int intCount1;
    int intCount2;
    int intCountEnemy = 0;
    
    for(intCount1 = 0; intCount1 <20; intCount1++){
      for(intCount2 = 0; intCount2<20; intCount2++){
        if(strMap[intCount1][intCount2].equals("enemy1") || strMap[intCount1][intCount2].equals("enemy2")||  strMap[intCount1][intCount2].equals("midboss1") ||  strMap[intCount1][intCount2].equals("midboss2")){   
          intCountEnemy++;
        }
      }
    }
    return intCountEnemy;
  }
  
  // -------------------------------------MAP 1: FOREST--------------------------------------------------------------------------------------------------------------------
  
  
  // Printing the first RPG map   
  
  public static void printRPGMap1(String strMap[][], Console con){
    
    BufferedImage Tree = con.loadImage("Tree.png"); // Loading the tree tile into a Tree variable
    BufferedImage ShallowWater = con.loadImage("ShallowWater.png"); // Loading the Shallow Water tile into a ShallowWater variable
    BufferedImage Grass = con.loadImage("Grass.png"); // Loading the grass tile into a Grass variable
    BufferedImage WeakEnemySprite = con.loadImage("WeakEnemySprite.png"); // Loading the Weak Enemy Map Sprite into a WeakEnemySprite variable
    BufferedImage MidBossSprite = con.loadImage("MidBossSprite.png"); // Loading the MidBoss Map Sprite into a MidBoss variable
    BufferedImage Enemy1 = con.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    BufferedImage Enemy2 = con.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable
    BufferedImage MidBoss1 = con.loadImage("MidBoss1.png"); // Loading the first midboss into a MidBoss1 variable
    BufferedImage MidBoss2 = con.loadImage("MidBoss2.png"); // Loading the second midboss into a MidBoss2 variable
    BufferedImage DeepWater = con.loadImage("DeepWater.png"); // Loading the Deep Water tile for the second map into a DeepWater variable
    BufferedImage Cliff = con.loadImage("Cliff.png"); // Loading the cliff tile into a Cliff variable
    BufferedImage BossSprite = con.loadImage("BossSprite.png"); // Loading the Boss Map Sprite into a BossSprite variable
    BufferedImage Boss = con.loadImage("Boss.png"); // Loading the boss into a Boss variable
    BufferedImage Sword = con.loadImage("Sword.png"); // Loading Sword powerup into the map
    BufferedImage Shield = con.loadImage("Shield.png"); // Loading Shield powerup into the map
    BufferedImage Stairs = con.loadImage("Stairs.png"); // Loading stairs into the map
    
    int intCount1 = 0;
    int intCount2 = 0;
    int intMapX = 0;
    int intMapY = 0;
    
    for(intCount1 = 0; intCount1 < 20; intCount1++){
      intMapX = 0;
      for(intCount2 = 0; intCount2 < 20; intCount2++){
        if(strMap[intCount1][intCount2].equals("SHwater")){
          con.drawImage(ShallowWater, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("grass")){    
          con.drawImage(Grass, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("tree")){
          con.drawImage(Tree, intMapX, intMapY); 
        }else if(strMap[intCount1][intCount2].equals("enemy1")){   
          con.drawImage(Grass, intMapX, intMapY);
          con.drawImage(WeakEnemySprite, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("enemy2")){   
          con.drawImage(Grass, intMapX, intMapY);
          con.drawImage(WeakEnemySprite, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("midboss1")){  
          con.drawImage(Grass, intMapX, intMapY);
          con.drawImage(MidBossSprite, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("midboss2")){   
          con.drawImage(Grass, intMapX, intMapY);
          con.drawImage(MidBossSprite, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("Dwater")){
          con.drawImage(DeepWater, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("cliff")){   
          con.drawImage(Cliff, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("boss")){   
          con.drawImage(BossSprite, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("sword")){   
          con.drawImage(Grass, intMapX, intMapY);
          con.drawImage(Sword, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("shield")){   
          con.drawImage(Grass, intMapX, intMapY);
          con.drawImage(Shield, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("stairs")){   
          con.drawImage(Stairs, intMapX, intMapY);
        }
        intMapX = intMapX + 30;
        
      }
      intMapY = intMapY + 30;
    }
    con.repaint();
  }
  
  
// Reading the position of the character and loading the battle screen accordingly
  
  public static void printBattle(Console battle, int intPosX, int intPosY){
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage Enemy1 = battle.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    BufferedImage Enemy2 = battle.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable
    BufferedImage MidBoss1 = battle.loadImage("MidBoss1.png"); // Loading the first midboss into a MidBoss1 variable
    BufferedImage MidBoss2 = battle.loadImage("MidBoss2.png"); // Loading the second midboss into a MidBoss2 variable
    BufferedImage Boss = battle.loadImage("Boss.png"); // Loading the boss into a Boss variable
    BufferedImage IdlePlayer = battle.loadImage("Male Idle Sprite.png"); // Loading the player's idle sprite
    
    String strMapArray[][];
    
    int intX = 800;
    
    strMapArray = RPGMethods.loadRPGMap("RPGmap1.csv");
    
    if(strMapArray[intPosY/30][intPosX/30].equals("enemy1")){
      while(intX > 500){
        battle.drawImage(ForestBackground,0,0);
        battle.drawImage(Enemy1, 100, 300);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("enemy2")){
      while(intX > 500){
        battle.drawImage(ForestBackground,0,0);
        battle.drawImage(Enemy2, 100, 270);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("midboss1")){
      while(intX > 500){
        battle.drawImage(ForestBackground,0,0);
        battle.drawImage(MidBoss1, 100, 220);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("midboss2")){
      while(intX > 500){
        battle.drawImage(ForestBackground,0,0);
        battle.drawImage(MidBoss2, 50, 170);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("boss")){
      while(intX > 500){
        battle.drawImage(ForestBackground,0,0);
        battle.drawImage(Boss, 100, 300);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
      
    }
    battle.repaint();
  }
  
  // Fleeing Animation
  
  public static void FleeBattle(Console battle, int intPosX, int intPosY){
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage Enemy1 = battle.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    BufferedImage Enemy2 = battle.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable
    BufferedImage MidBoss1 = battle.loadImage("MidBoss1.png"); // Loading the first midboss into a MidBoss1 variable
    BufferedImage MidBoss2 = battle.loadImage("MidBoss2.png"); // Loading the second midboss into a MidBoss2 variable
    BufferedImage Boss = battle.loadImage("Boss.png"); // Loading the boss into a Boss variable
    BufferedImage IdlePlayer = battle.loadImage("Male Idle Sprite.png"); // Loading the player's idle sprite
    
    String strMapArray[][];
    
    int intX = 500;
    
    strMapArray = RPGMethods.loadRPGMap("RPGmap1.csv");
    
    if(strMapArray[intPosY/30][intPosX/30].equals("enemy1")){
      while(intX < 800){
        battle.drawImage(ForestBackground,0,0);
        battle.drawImage(Enemy1, 100, 300);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX + 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("enemy2")){
      while(intX < 800){
        battle.drawImage(ForestBackground,0,0);
        battle.drawImage(Enemy2, 100, 270);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX + 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("midboss1")){
      while(intX < 800){
        battle.drawImage(ForestBackground,0,0);
        battle.drawImage(MidBoss1, 100, 220);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX + 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("midboss2")){
      while(intX < 800){
        battle.drawImage(ForestBackground,0,0);
        battle.drawImage(MidBoss2, 50, 170);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX + 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("boss")){
      while(intX < 800){
        battle.drawImage(ForestBackground,0,0);
        battle.drawImage(Boss, 100, 300);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX + 5;
      }
      
    }
    battle.repaint();
  }
  
// Loading the animation frames of the player into an array.
  
  public static BufferedImage[][] loadBattleFrames(Console battle){
    
    BufferedImage[][] strBattle= new BufferedImage[1][5];    
    BufferedImage IdlePlayer = battle.loadImage("Male Idle Sprite.png"); // Loading the player's idle sprite
    BufferedImage Battle1M = battle.loadImage("Male Battle1 Sprite.png"); // Loading the first battle animation.
    BufferedImage Battle2M = battle.loadImage("Male Battle2 Sprite.png"); // Loading the second battle animation.
    BufferedImage Battle3M = battle.loadImage("Male Battle3 Sprite.png"); // Loading the third battle animation.
    BufferedImage Guard = battle.loadImage("Male Guard Sprite.png"); // Guard Sprite
    
    strBattle[0][0] = IdlePlayer;
    strBattle[0][1] = Battle1M;
    strBattle[0][2] = Battle2M;
    strBattle[0][3] = Battle3M;
    strBattle[0][4] = Guard;
    
    return strBattle;
    
  }
  
// Damage Calculation for Player
  
  public static int DmgCalc(int intAtk, int intEnDef){
    
    int intMinDmg = intAtk-intEnDef - 1; // Minimum damage based on Player Attack and Enemy Defense
    int intRandom = (int)(Math.random()*3)+intMinDmg; // Damage calculations
    
    if(intMinDmg <=0){
      intRandom = 0;
      
    }else{
      
        }
      return intRandom;
  }
// Damage Calculation for Enemy 
  
  public static int EnDmgCalc(int intEnAtk, int intDef){
    
    int intMinDmg = intEnAtk-intDef - 1; // Minimum damage based on Player Attack and Enemy Defense
    int intRandom = (int)(Math.random()*3)+intMinDmg; // Damage calculations
    
    
    if(intMinDmg <=0){
      intRandom = 0;
            
    }else{
      
      }
    return intRandom;
  }
  
// Guard Animation Player vs Enemy1
  
  public static int GuardEn1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage Enemy1 = battle.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    
    int intX = 100;
    
    while(intX >=100 && intX <= 500){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500,300);
      RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy1, intX, 300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - (intEnRandom/2); // Adjusts Player health
    while(intX >100){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500, 300);
      RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy1, intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    battle.drawImage(ForestBackground, 0, 0);
    battle.drawImage(strBattle[0][0], 500, 300);
    RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
    battle.drawImage(Enemy1, intX,300);
    battle.repaint();
    return intHP;
  }
  
  
//Drawing the player fight animation vs. Enemy1
  
  public static int BattleAnimationFightEn1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage Enemy1 = battle.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    
    int intCount1 = 0;
    int intX = 500;
    
    
    for(intCount1 = 0; intCount1 < 75; intCount1++){
      if(intX <=500 && intX >= 400){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(Enemy1, 100, 300);
        RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][0], intX,300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 400 && intX >= 300){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(Enemy1, 100, 300);
        RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][1], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 300 && intX >= 140){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(Enemy1, 100, 300);
        RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][2], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 140 && intX >= 95){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(Enemy1, 100, 300);
        RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][3], intX,    270);
        battle.repaint();
        battle.sleep(1000/400);
        intX = intX - 5;
        
      }
    }
    battle.sleep(50);
    intEnHP = intEnHP - intRandom; // Adjusts Enemy health
    while(intX < 500){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(Enemy1, 100, 300);
      RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(strBattle[0][0], intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    return intEnHP;
  }
// Enemy 1 Animation
  
  public static int BattleAnimationEn1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage Enemy1 = battle.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    
    int intX = 100;
    
    while(intX >=100 && intX <= 500){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500,300);
      RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy1, intX, 300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - intEnRandom; // Adjusts Player health
    while(intX > 100){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500, 300);
      RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy1, intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    return intHP;
  }
// Guard Animation Player vs Enemy2
  
  public static int GuardEn2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage Enemy2 = battle.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable
    
    int intCount1 = 0;
    int intX = 100;
    
    while(intX >=100 && intX <= 475){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500,300);
      RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy2, intX, 270);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - (intEnRandom/2); // Adjusts Player health
    while(intX > 100){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500, 300);
      RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy2, intX, 270);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    battle.drawImage(ForestBackground, 0, 0);
    battle.drawImage(strBattle[0][0], 500, 300);
    RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
    battle.drawImage(Enemy2, intX, 270);
    battle.repaint();
    return intHP;
  }
  
  
//Drawing the player fight animation vs. Enemy2
  
  public static int BattleAnimationFightEn2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage Enemy2 = battle.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable 
    
    int intX = 500;
    int intCount1 = 0;
    
    
    
    for(intCount1 = 0; intCount1 < 75; intCount1++){
      if(intX <=500 && intX >= 400){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(Enemy2, 100, 270);
        RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][0], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 400 && intX >= 300){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(Enemy2, 100, 270);
        RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][1], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 300 && intX >= 140){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(Enemy2, 100, 270);
        RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][2], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 140 && intX >= 95){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(Enemy2, 100, 270);
        RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][3], intX, 270);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
    }
    battle.sleep(50);
    intEnHP = intEnHP -  intRandom;
    while(intX < 500){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(Enemy2, 100, 270);
      RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(strBattle[0][0], intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    return intEnHP;
  }
// Enemy 2 Animation
  
  public static int BattleAnimationEn2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage Enemy2 = battle.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable
    
    int intX = 100;
    
    while(intX >=100 && intX <= 475){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500,300);
      RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy2, intX, 270);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - intEnRandom; // Adjusts Player health
    while(intX > 100){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500, 300);
      RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy2, intX, 270);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    return intHP;
  }
  
// Guard Animation Player vs MidBoss1
  
  public static int GuardMid1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage MidBoss1 = battle.loadImage("MidBoss1.png"); // Loading the first midboss into an MidBoss1 variable
    
    int intX = 100;
    
    while(intX >=100 && intX <= 420){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500,300);
      RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss1, intX, 220);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - (intEnRandom/2); // Adjusts Player health
    while(intX > 100){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500, 300);
      RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss1, intX,220);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    battle.drawImage(ForestBackground, 0, 0);
    battle.drawImage(strBattle[0][0], 500, 300);
    RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
    battle.drawImage(MidBoss1, intX,220);
    battle.repaint();
    return intHP;
  }
  
  
//Drawing the player fight animation vs. MidBoss1
  
  public static int BattleAnimationFightMid1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage MidBoss1 = battle.loadImage("MidBoss1.png"); //Loading the first midboss into an MidBoss1 variable
    int intCount1 = 0;
    int intX = 500;
    
    
    
    for(intCount1 = 0; intCount1 < 75; intCount1++){
      if(intX <=500 && intX >= 400){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(MidBoss1, 100, 220);
        RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][0], intX,300);
//        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 400 && intX >= 300){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(MidBoss1, 100, 220);
        RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][1], intX, 300);
//        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 300 && intX >= 140){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(MidBoss1, 100, 220);
        RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][2], intX, 300);
//        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 140 && intX >= 95){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(MidBoss1, 100, 220);
        RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][3], intX, 270);
//        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
      battle.repaint();
    }
    battle.sleep(50);
    intEnHP = intEnHP - intRandom; // Adjusts Enemy health
    while(intX < 500){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(MidBoss1,100, 220);
      RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(strBattle[0][0], intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    return intEnHP;
  }
  
// Midboss 1 Animation
  
  public static int BattleAnimationMid1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage MidBoss1 = battle.loadImage("MidBoss1.png"); // Loading the first midboss into an MidBoss1 variable
    
    int intX = 100;
    
    while(intX >=100 && intX <= 420){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500,300);
      RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss1, intX, 220);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - intEnRandom; // Adjusts Player health
    while(intX > 100){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500, 300);
      RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss1, intX,220);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    return intHP;
  }
// Guard Animation Player vs MidBoss2
  
  public static int GuardMid2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage MidBoss2 = battle.loadImage("MidBoss2.png"); // Loading the seond midboss into an MidBoss2 variable
    
    int intX = 50;
    
    while(intX >=50 && intX <= 340){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500,300);
      RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss2, intX,170);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - (intEnRandom/2); // Adjusts Player health
    while(intX > 50){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500, 300);
      RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss2, intX, 170);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    battle.drawImage(ForestBackground, 0, 0);
    battle.drawImage(strBattle[0][0], 500, 300);
    RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
    battle.drawImage(MidBoss2, intX, 170);
    battle.repaint();
    return intHP;
  }
  
  
//Drawing the player fight animation vs. MidBoss2
  
  public static int BattleAnimationFightMid2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage MidBoss2 = battle.loadImage("MidBoss2.png"); //Loading the second midboss into an MidBoss2 variable
    int intCount1 = 0;
    int intX = 500;
    
    
    for(intCount1 = 0; intCount1 < 75; intCount1++){
      if(intX <=500 && intX >= 400){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(MidBoss2,  50, 170);
        RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][0], intX,300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 400 && intX >= 300){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(MidBoss2,  50, 170);
        RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][1], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 300 && intX >= 140){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(MidBoss2,  50, 170);
        RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][2], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 140 && intX >= 95){
        battle.drawImage(ForestBackground, 0, 0);
        battle.drawImage(MidBoss2,  50, 170);
        RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][3], intX, 270);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
    }
    battle.sleep(50);
    intEnHP = intEnHP - intRandom; // Adjusts Enemy health
    while(intX < 500){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(MidBoss2,  50, 170);
      RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(strBattle[0][0], intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    return intEnHP;
  }
// Midboss2 Animation
  
  public static int BattleAnimationMid2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage ForestBackground = battle.loadImage("Forest Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage MidBoss2 = battle.loadImage("MidBoss2.png"); // Loading the seond midboss into an MidBoss2 variable
    
    int intX = 50;
    
    while(intX >=50 && intX <= 340){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500,300);
      RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss2, intX, 170);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - intEnRandom; // Adjusts Player health
    while(intX > 50){
      battle.drawImage(ForestBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500, 300);
      RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss2, intX, 170);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    return intHP;
  }
  
//-----------------------------------------MAP 2: CLIFFTOPS----------------------------------------------------------------------------------------------------
  
  public static void printRPGMap2(String strMap[][], Console con){
    
    BufferedImage Rock = con.loadImage("Rock.png"); // Loading the rock tile into a Rock variable
    BufferedImage ShallowWater = con.loadImage("ShallowWater.png"); // Loading the Shallow Water tile into a ShallowWater variable
    BufferedImage Grass = con.loadImage("Grass.png"); // Loading the grass tile into a Grass variable
    BufferedImage WeakEnemySprite = con.loadImage("WeakEnemySprite.png"); // Loading the Weak Enemy Map Sprite into a WeakEnemySprite variable
    BufferedImage MidBossSprite = con.loadImage("MidBossSprite.png"); // Loading the MidBoss Map Sprite into a MidBoss variable
    BufferedImage Enemy1 = con.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    BufferedImage Enemy2 = con.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable
    BufferedImage MidBoss1 = con.loadImage("MidBoss1.png"); // Loading the first midboss into a MidBoss1 variable
    BufferedImage MidBoss2 = con.loadImage("MidBoss2.png"); // Loading the second midboss into a MidBoss2 variable
    BufferedImage DeepWater = con.loadImage("DeepWater.png"); // Loading the Deep Water tile for the second map into a DeepWater variable
    BufferedImage Cliff = con.loadImage("Cliff.png"); // Loading the cliff tile into a Cliff variable
    BufferedImage BossSprite = con.loadImage("BossSprite.png"); // Loading the Boss Map Sprite into a BossSprite variable
    BufferedImage Boss = con.loadImage("Boss.png"); // Loading the boss into a Boss variable
    BufferedImage Sword = con.loadImage("Sword.png"); // Loading Sword powerup into the map
    BufferedImage Shield = con.loadImage("Shield.png"); // Loading Shield powerup into the map
    BufferedImage Stairs = con.loadImage("Stairs.png"); // Loading stairs into the map
    
    int intCount1 = 0;
    int intCount2 = 0;
    int intMapX = 0;
    int intMapY = 0;
    
    for(intCount1 = 0; intCount1 < 20; intCount1++){
      intMapX = 0;
      for(intCount2 = 0; intCount2 < 20; intCount2++){
        if(strMap[intCount1][intCount2].equals("SHwater")){
          con.drawImage(ShallowWater, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("grass")){    
          con.drawImage(Grass, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("rock")){
          con.drawImage(Cliff, intMapX, intMapY);
          con.drawImage(Rock, intMapX, intMapY); 
        }else if(strMap[intCount1][intCount2].equals("enemy1")){   
          con.drawImage(Cliff, intMapX, intMapY);
          con.drawImage(WeakEnemySprite, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("enemy2")){   
          con.drawImage(Cliff, intMapX, intMapY);
          con.drawImage(WeakEnemySprite, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("midboss1")){  
          con.drawImage(Cliff, intMapX, intMapY);
          con.drawImage(MidBossSprite, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("midboss2")){   
          con.drawImage(Cliff, intMapX, intMapY);
          con.drawImage(MidBossSprite, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("Dwater")){
          con.drawImage(DeepWater, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("cliff")){   
          con.drawImage(Cliff, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("boss")){   
          con.drawImage(Cliff, intMapX, intMapY);
          con.drawImage(BossSprite, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("sword")){   
          con.drawImage(Cliff, intMapX, intMapY);
          con.drawImage(Sword, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("shield")){   
          con.drawImage(Cliff, intMapX, intMapY);
          con.drawImage(Shield, intMapX, intMapY);
        }else if(strMap[intCount1][intCount2].equals("stairs")){   
          con.drawImage(Stairs, intMapX, intMapY);
        }
        intMapX = intMapX + 30;
        
      }
      intMapY = intMapY + 30;
    }
    con.repaint();
  }
  
  
  public static void printBattle2(Console battle, int intPosX, int intPosY){
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage Enemy1 = battle.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    BufferedImage Enemy2 = battle.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable
    BufferedImage MidBoss1 = battle.loadImage("MidBoss1.png"); // Loading the first midboss into a MidBoss1 variable
    BufferedImage MidBoss2 = battle.loadImage("MidBoss2.png"); // Loading the second midboss into a MidBoss2 variable
    BufferedImage Boss = battle.loadImage("Boss.png"); // Loading the boss into a Boss variable
    BufferedImage IdlePlayer = battle.loadImage("Male Idle Sprite.png"); // Loading the player's idle sprite
    
    String strMapArray[][];
    
    int intX = 800;
    
    strMapArray = RPGMethods.loadRPGMap("RPGmap2.csv");
    
    if(strMapArray[intPosY/30][intPosX/30].equals("enemy1")){
      while(intX > 500){
        battle.drawImage(CliffBackground,0,0);
        battle.drawImage(Enemy1, 100, 300);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("enemy2")){
      while(intX > 500){
        battle.drawImage(CliffBackground,0,0);
        battle.drawImage(Enemy2, 100, 270);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("midboss1")){
      while(intX > 500){
        battle.drawImage(CliffBackground,0,0);
        battle.drawImage(MidBoss1, 100, 220);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("midboss2")){
      while(intX > 500){
        battle.drawImage(CliffBackground,0,0);
        battle.drawImage(MidBoss2, 50, 170);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("boss")){
      while(intX > 500){
        battle.drawImage(CliffBackground,0,0);
        battle.drawImage(Boss, 50, 260);
        battle.drawImage(IdlePlayer, intX, 230);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
      
    }
    battle.repaint();
  }
  
  // Fleeing Animation
  
  public static void FleeBattle2(Console battle, int intPosX, int intPosY){
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the first map into a console window.
    BufferedImage Enemy1 = battle.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    BufferedImage Enemy2 = battle.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable
    BufferedImage MidBoss1 = battle.loadImage("MidBoss1.png"); // Loading the first midboss into a MidBoss1 variable
    BufferedImage MidBoss2 = battle.loadImage("MidBoss2.png"); // Loading the second midboss into a MidBoss2 variable
    BufferedImage Boss = battle.loadImage("Boss.png"); // Loading the boss into a Boss variable
    BufferedImage IdlePlayer = battle.loadImage("Male Idle Sprite.png"); // Loading the player's idle sprite
    
    String strMapArray[][];
    
    int intX = 500;
    
    strMapArray = RPGMethods.loadRPGMap("RPGmap2.csv");
    
    if(strMapArray[intPosY/30][intPosX/30].equals("enemy1")){
      while(intX < 800){
        battle.drawImage(CliffBackground,0,0);
        battle.drawImage(Enemy1, 100, 300);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/300);
        intX = intX + 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("enemy2")){
      while(intX < 800){
        battle.drawImage(CliffBackground,0,0);
        battle.drawImage(Enemy2, 100, 270);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX + 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("midboss1")){
      while(intX < 800){
        battle.drawImage(CliffBackground,0,0);
        battle.drawImage(MidBoss1, 100, 220);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX + 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("midboss2")){
      while(intX < 800){
        battle.drawImage(CliffBackground,0,0);
        battle.drawImage(MidBoss2, 50, 170);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX + 5;
      }
      
    }else if(strMapArray[intPosY/30][intPosX/30].equals("boss")){
      while(intX < 800){
        battle.drawImage(CliffBackground,0,0);
        battle.drawImage(Boss, 100, 300);
        battle.drawImage(IdlePlayer, intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX + 5;
      }
    }
    battle.repaint();
  }
  
// Guard Animation Player vs Enemy1
  
  public static int Guard2En1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage Enemy1 = battle.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    
    int intX = 100;
    
    while(intX >=100 && intX <= 500){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500,300);
      RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy1, intX, 300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - (intEnRandom/2); // Adjusts Player health
    while(intX > 100){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500, 300);
      RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy1, intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    battle.drawImage(CliffBackground, 0, 0);
    battle.drawImage(strBattle[0][0], 500, 300);
    RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
    battle.drawImage(Enemy1, intX,300);
    battle.repaint();
    return intHP;
  }
  
  
//Drawing the player fight animation vs. Enemy1
  
  public static int BattleAnimation2FightEn1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage Enemy1 = battle.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    
    int intCount1 = 0;
    int intX = 500;
    
    
    for(intCount1 = 0; intCount1 < 75; intCount1++){
      if(intX <=500 && intX >= 400){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Enemy1, 100, 300);
        RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][0], intX,300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 400 && intX >= 300){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Enemy1, 100, 300);
        RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][1], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 300 && intX >= 140){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Enemy1, 100, 300);
        RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][2], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 140 && intX >= 95){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Enemy1, 100, 300);
        RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][3], intX, 270);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
        
      }
    }
    battle.sleep(50);
    intEnHP = intEnHP - intRandom; // Adjusts Enemy health
    while(intX < 500){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(Enemy1, 100, 300);
      RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(strBattle[0][0], intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    return intEnHP;
  }
// Enemy 1 Animation
  
  public static int BattleAnimation2En1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage Enemy1 = battle.loadImage("Enemy1.png"); // Loading the first enemy into an Enemy1 variable
    
    int intX = 100;
    
    while(intX >=100 && intX <= 500){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500,300);
      RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy1, intX, 300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - intEnRandom; // Adjusts Player health
    while(intX > 100){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500, 300);
      RPGMethods.BattleHUDEn1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy1, intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    return intHP;
  }
// Guard Animation Player vs Enemy2
  
  public static int Guard2En2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage Enemy2 = battle.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable
    
    int intX = 100;
    
    while(intX >=100 && intX <= 475){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500,300);
      RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy2, intX, 270);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - (intEnRandom/2); // Adjusts Player health
    while(intX > 100){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500, 300);
      RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy2, intX, 270);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    battle.drawImage(CliffBackground, 0, 0);
    battle.drawImage(strBattle[0][0], 500, 300);
    RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
    battle.drawImage(Enemy2, intX, 270);
    battle.repaint();
    return intHP;
  }
  
  
//Drawing the player fight animation vs. Enemy2
  
  public static int BattleAnimation2FightEn2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage Enemy2 = battle.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable 
    int intCount1 = 0;
    int intX = 500;
    
    
    
    for(intCount1 = 0; intCount1 < 75; intCount1++){
      if(intX <=500 && intX >= 400){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Enemy2, 100, 270);
        RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][0], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 400 && intX >= 300){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Enemy2, 100, 270);
        RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][1], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 300 && intX >= 140){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Enemy2, 100, 270);
        RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][2], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 140 && intX >= 95){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Enemy2, 100, 270);
        RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][3], intX, 270);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
    }
    battle.sleep(50);
    intEnHP = intEnHP -  intRandom;
    while(intX < 500){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(Enemy2, 100, 270);
      RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(strBattle[0][0], intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    return intEnHP;
  }
// Enemy 2 Animation
  
  public static int BattleAnimation2En2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage Enemy2 = battle.loadImage("Enemy2.png"); // Loading the second enemy into an Enemy2 variable
    
    int intX = 100;
    
    while(intX >=100 && intX <= 475){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500,300);
      RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy2, intX, 270);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - intEnRandom; // Adjusts Player health
    while(intX > 100){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500, 300);
      RPGMethods.BattleHUDEn2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Enemy2, intX, 270);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    return intHP;
  }
  
// Guard Animation Player vs MidBoss1
  
  public static int Guard2Mid1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage MidBoss1 = battle.loadImage("MidBoss1.png"); // Loading the first midboss into a MidBoss1 variable
    
    int intX = 100;
    
    while(intX >=100 && intX <= 420){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500,300);
      RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss1, intX, 220);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - (intEnRandom/2); // Adjusts Player health
    while(intX > 100){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500, 300);
      RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss1, intX,220);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    battle.drawImage(CliffBackground, 0, 0);
    battle.drawImage(strBattle[0][0], 500, 300);
    RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
    battle.drawImage(MidBoss1, intX,220);
    battle.repaint();
    return intHP;
  }
  
  
//Drawing the player fight animation vs. MidBoss1
  
  public static int BattleAnimation2FightMid1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage MidBoss1 = battle.loadImage("MidBoss1.png"); //Loading the first midboss into an MidBoss1 variable
    int intCount1 = 0;
    int intX = 500;
    
    
    
      for(intCount1 = 0; intCount1 < 75; intCount1++){
      if(intX <=500 && intX >= 400){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(MidBoss1, 100, 220);
        RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][0], intX,300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 400 && intX >= 300){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(MidBoss1, 100, 220);
        RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][1], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 300 && intX >= 140){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(MidBoss1, 100, 220);
        RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][2], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 140 && intX >= 95){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(MidBoss1, 100, 220);
        RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][3], intX, 270);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
    }
    battle.sleep(50);
    intEnHP = intEnHP - intRandom; // Adjusts Enemy health
    while(intX < 500){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(MidBoss1, 100, 220);
      RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(strBattle[0][0], intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    return intEnHP;
  }
// Midboss 1 Animation
  
  public static int BattleAnimation2Mid1(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage MidBoss1 = battle.loadImage("MidBoss1.png"); // Loading the first midboss into a MidBoss1 variable
    
    int intX = 100;
    
    while(intX >=100 && intX <= 420){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500,300);
      RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss1, intX, 220);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - intEnRandom; // Adjusts Player health
    while(intX > 100){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500, 300);
      RPGMethods.BattleHUDMid1(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss1, intX,220);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    return intHP;
  }
// Guard Animation Player vs MidBoss2
  
  public static int Guard2Mid2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage MidBoss2 = battle.loadImage("MidBoss2.png"); // // Loading the second midboss into an MidBoss2 variable
    
    int intX = 50;
    
    while(intX >=50 && intX <= 390){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500,300);
      RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss2, intX,170);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - (intEnRandom/2); // Adjusts Player health
    while(intX > 50){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500, 300);
      RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss2, intX, 170);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    battle.drawImage(CliffBackground, 0, 0);
    battle.drawImage(strBattle[0][0], 500, 300);
    RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
    battle.drawImage(MidBoss2, intX, 170);
    battle.repaint();
    return intHP;
  }
  
  
//Drawing the player fight animation vs. MidBoss2
  
  public static int BattleAnimation2FightMid2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage MidBoss2 = battle.loadImage("MidBoss2.png"); //Loading the second midboss into an MidBoss2 variable
    int intCount1 = 0;
    int intX = 500;
    
    
    for(intCount1 = 0; intCount1 < 75; intCount1++){
      if(intX <=500 && intX >= 400){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(MidBoss2,  50, 170);
        RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][0], intX,300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 400 && intX >= 300){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(MidBoss2,  50, 170);
        RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][1], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 300 && intX >= 140){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(MidBoss2,  50, 170);
        RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][2], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 140 && intX >= 95){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(MidBoss2,  50, 170);
        RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][3], intX, 270);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
    }
    battle.sleep(50);
    intEnHP = intEnHP - intRandom; // Adjusts Enemy health
    while(intX < 500){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(MidBoss2,  50, 170);
      RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(strBattle[0][0], intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    return intEnHP;
  }
// Midboss2 Animation
  
  public static int BattleAnimation2Mid2(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage MidBoss2 = battle.loadImage("MidBoss2.png"); // Loading the second midboss into an MidBoss2 variable
    
    int intX = 50;
    
    while(intX >=50 && intX <= 390){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500,300);
      RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss2, intX, 170);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - intEnRandom; // Adjusts Player health
    while(intX > 50){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500, 300);
      RPGMethods.BattleHUDMid2(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(MidBoss2, intX, 170);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    return intHP;
  }
// Guard Animation Player vs Boss
  
  public static int GuardBoss(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage Boss = battle.loadImage("Boss.png"); // Loading the boss into a boss variable
    
    int intX = 50;
    
    while(intX >=50 && intX <= 390){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500,300);
      RPGMethods.BattleHUDBoss(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Boss, intX,230);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - (intEnRandom/2); // Adjusts Player health
    while(intX > 50){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][4], 500, 300);
      RPGMethods.BattleHUDBoss(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Boss, intX, 230);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    battle.drawImage(CliffBackground, 0, 0);
    battle.drawImage(strBattle[0][0], 500, 300);
    RPGMethods.BattleHUDBoss(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
    battle.drawImage(Boss, intX, 230);
    battle.repaint();
    return intHP;
  }
  
  
//Drawing the player fight animation vs. Boss
  
  public static int BattleAnimationFightBoss(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage Boss = battle.loadImage("Boss.png"); // Loading the boss into a boss variable
    int intCount1 = 0;
    int intX = 500;
    
    
    for(intCount1 = 0; intCount1 < 75; intCount1++){
      if(intX <=500 && intX >= 400){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Boss,  50, 230);
        RPGMethods.BattleHUDBoss(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][0], intX,300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 400 && intX >= 300){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Boss,  50, 230);
        RPGMethods.BattleHUDBoss(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][1], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 300 && intX >= 140){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Boss,  50, 230);
        RPGMethods.BattleHUDBoss(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][2], intX, 300);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }else if(intX < 140 && intX >= 95){
        battle.drawImage(CliffBackground, 0, 0);
        battle.drawImage(Boss,  50, 230);
        RPGMethods.BattleHUDBoss(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
        battle.drawImage(strBattle[0][3], intX, 270);
        battle.repaint();
        battle.sleep(1000/200);
        intX = intX - 5;
      }
    }
    battle.sleep(50);
    intEnHP = intEnHP - intRandom; // Adjusts Enemy health
    while(intX < 500){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(Boss,  50, 230);
      RPGMethods.BattleHUDBoss(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(strBattle[0][0], intX,300);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    return intEnHP;
  }
// Boss Animation
  
  public static int BattleAnimationBoss(BufferedImage strBattle[][], String strName, int intHP, int intTotalHP, int intAttack, int intDefense, int intEnHP, int intEnTotalHP, int intEnAttack, int intEnDefense, int intEnRandom, Console battle){
    
    BufferedImage CliffBackground = battle.loadImage("Cliff Background.png"); // Loading the battle screen of the second map into a console window.
    BufferedImage Boss = battle.loadImage("Boss.png"); // Loading the boss into a boss variable
    
    int intX = 50;
    
    while(intX >=50 && intX <= 390){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500,300);
      RPGMethods.BattleHUDBoss(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Boss, intX, 230);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX + 5;
    }
    battle.sleep(50);
    intHP = intHP - intEnRandom; // Adjusts Player health
    while(intX > 50){
      battle.drawImage(CliffBackground, 0, 0);
      battle.drawImage(strBattle[0][0], 500, 300);
      RPGMethods.BattleHUDBoss(strName, intHP, intTotalHP, intAttack, intDefense, intEnHP, intEnTotalHP, intEnAttack, intEnDefense, battle);
      battle.drawImage(Boss, intX, 230);
      battle.repaint();
      battle.sleep(1000/200);
      intX = intX - 5;
    }
    return intHP;
  }
}