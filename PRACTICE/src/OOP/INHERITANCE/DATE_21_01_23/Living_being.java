package OOP.INHERITANCE.DATE_21_01_23;

public class Living_being {
    boolean single_cell;
    boolean multiple_cellular;
    Living_being(){
        System.out.println("all the living beings are breathing");
    }
    Living_being(boolean sc,boolean mc){
        this.single_cell=sc;
        this.multiple_cellular=mc;
    }
}
