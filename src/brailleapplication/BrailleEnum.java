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
    A("100000"), B("101000"), C("110000"), D("110100"), E("100100"),
    F("111000"), G("111100"), H("101100"), I("011000"), J("011100"),
    K("100010"), L("101010"), M("110010"), N("110110"), O("100110"),
    P("111010"), Q("111110"), R("101110"), S("011010"), T("011110"),
    U("100011"), V("101011"), W("011101"), X("110011"), Y("110111"),
    Z("100111"), ESPACIO("000000");
    
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
