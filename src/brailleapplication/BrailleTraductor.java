/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brailleapplication;

import java.util.ArrayList;

/**
 *
 * @author abdir
 */
public class BrailleTraductor {
    private String input = "";

    public void setInput(String input) {
        this.input = input;
    }
    
    public ArrayList<String> getTraduccion() {
        ArrayList<String> letrasBraille = new ArrayList();
        for(char name : input.toCharArray()) {
            letrasBraille.add(BrailleEnum.getPatronFromName(name));
        }
        return letrasBraille;
    }
}
