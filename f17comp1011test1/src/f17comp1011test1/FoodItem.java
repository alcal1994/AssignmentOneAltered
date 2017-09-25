/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17comp1011test1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author albert
 */
public class FoodItem extends Application {
    
    private String foodName;
    private int calories, fat, servingSize, sugar, protein;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
     public FoodItem(String foodName, int calories, int fat, int servingSize, int sugar, int protein)
    {
        this.foodName = foodName;
        this.calories = calories;
        this.fat = fat;
        this.servingSize = servingSize;
        this.sugar = sugar;
        this.protein = protein;
      
         
    /** End of Person Constructor
     * 
     */ 
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    /*
    Getters and Setters
    */
    public String getFoodName(){
        return foodName;
    }
    
     public void setFoodName(String foodName){
        this.foodName = foodName;
    }
    
    public int getCalories(){
        return calories;
    }
    /*
    validates if calories is equal to or greater than zero
    */
    public void setCalories(int calories){
          if(calories>=0){
       this.calories = calories;
        }else{
            throw new IllegalArgumentException("Calories must be greater than or equal to 0");
        }
    }
        
    public int getFat(){
        return fat;
    }
    /*
    validates if fat is equal to or greater than zero
    */
    public void setFat(int fat){
        if(fat>=0){
       this.fat = fat;
        }else{
            throw new IllegalArgumentException("Fat must be greater than or equal to 0");
        }
    }
    
    public int getServingSize(){
        return servingSize;
    }
        /*
    validates if servingSize is equal to or greater than zero
    */
    public void setServingSize(int servingSize){
       if(servingSize>=0){
       this.servingSize = servingSize;
        }else{
            throw new IllegalArgumentException("Serving Size must be greater than or equal to 0");
        }
    }
    
    public int getSugar(){
       return sugar; 
    }
        /*
    validates if sugar is equal to or greater than zero
    */
    public void setSugar(int sugar){
        if(sugar>=0){
       this.sugar = sugar;
        }else{
            throw new IllegalArgumentException("Sugar must be greater than or equal to 0");
        }
    }
    
    public int getProtein(){
        return protein;
    }
        /*
    validates if protein is equal to or greater than zero
    */
    public void setProtein(int protein){ 
       if(protein>=0){
       this.protein = protein;
        }else{
            throw new IllegalArgumentException("Protein must be greater than or equal to 0");
        }
      
        
    }
}
