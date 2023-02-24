/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author cody
 */
public class TestUserProfile {
    
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String inputName = kb.next();
        
        System.out.println("Please type your favourite genre");
        System.out.println("Comedy, Drama, Action, or Mystery");
        String inputGenre = kb.next();
        
        UserProfile test1 = new UserProfile(inputName, inputGenre);
        
        System.out.println("Profile created\nName: " + inputName + "\nFavourite Genre: " + inputGenre);

    }
}
