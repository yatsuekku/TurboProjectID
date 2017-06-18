package MainMenu;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jacek on 2017-06-17.
 */
public class MainMenu {
    private Scanner scn = new Scanner(System.in);
    public void StartMenu(MenuSetting settings){
        System.out.printf("Hello %s and wilkommen in IDProject train service\n",settings.getUser() == null ? "unknown adventurer" : settings.getUser());
        System.out.println("Would you like to...");
        if(settings.getUser() != null){
            System.out.println("1. Buy a fahrkarte?");
            System.out.println("2. See timetable?");
            System.out.println("3. Get app info?");
            System.out.println("4. Log out?");
            System.out.println("x Exit?");
        }else{
            System.out.println("1. Log in?");
            System.out.println("2. See timetable?");
            System.out.println("3. Get app info?");
            System.out.println("4. Make an account?");
            System.out.println("x Exit?");
        }
    }
}
