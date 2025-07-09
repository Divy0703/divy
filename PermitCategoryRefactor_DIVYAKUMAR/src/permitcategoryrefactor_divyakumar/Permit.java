/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permitcategoryrefactor_divyakumar;

/**
 *
 * @author divy5
 */
public class Permit {
    
private String holderName;
    private PermitCategory category;

    public Permit(String holderName, PermitCategory category) {
        this.holderName = holderName;
        this.category = category;
    }

    public void displayPermit() {
        System.out.println("Permit Holder: " + holderName);
        System.out.println("Permit Category: " + category);
    }

    public static void main(String[] args) {
        Permit permit1 = new Permit("Divy", PermitCategory.RESIDENTIAL);
        Permit permit2 = new Permit("Patel", PermitCategory.DIVYAKUMAR_CATEGORY);


        permit1.displayPermit();
        System.out.println();
        permit2.displayPermit();
    }
}
