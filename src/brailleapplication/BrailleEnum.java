/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package brailleapplication;

/**
 *
 * @author abdir
 */
public enum BrailleEnum {
    A("100000"), B("110000"), C("100100"), D("100110"), E("100010"),
    F("110100"), G("110110"), H("110010"), I("010100"), J("010110"),
    ESPACIO("000000");

    private final String patron;

    private BrailleEnum(String patron) {
        this.patron = patron;
    }

    public String getPatron() { 
        return this.patron; 
    }
    
    public static String getPatronFromName(char letter) {
        String patron = "No existe";
        for(BrailleEnum braille : BrailleEnum.values()) {
            if(braille.name().equals(letter)) {
                patron = braille.getPatron();
                break;
            }
        }
        return patron;
    }
}
