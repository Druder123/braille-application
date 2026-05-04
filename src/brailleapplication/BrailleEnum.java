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
    K("101000"), L("111000"), M("101100"), N("101110"), O("101010"),
    P("111100"), Q("111110"), R("111010"), S("011100"), T("011110"),
    U("101001"), V("111001"), W("010111"), X("101101"), Y("101111"),
    Z("101011"), ESPACIO("000000");

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
            if(braille.name().charAt(0) == letter) {
                patron = braille.getPatron();
                break;
            }
        }
        return patron;
    }
}
