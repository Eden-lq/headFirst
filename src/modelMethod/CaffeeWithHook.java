package modelMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");

    }

    @Override
    boolean customerWantsCondiments() {
        String anwser = getUserInput();
        if(anwser.toLowerCase().startsWith("y")){
            return true;
        }
        else
            return false;
    }
    private String getUserInput (){

        String anwser = null;
        System.out.println("Would you like milk and sugar with you coffee(y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            anwser = in.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        if(anwser == null){
            return "no";
        }
        return  anwser;
    }
}
