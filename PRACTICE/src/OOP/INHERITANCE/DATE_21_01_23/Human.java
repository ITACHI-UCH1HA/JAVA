package OOP.INHERITANCE.DATE_21_01_23;

public class Human extends Living_being{
    int eyes=2;
    int limbs=4;


    public Human(int eyes, int limbs) {
        this.eyes = eyes;
        this.limbs = limbs;
    }

    public Human(boolean sc, boolean mc, int eyes, int limbs) {
        super(sc, mc);
        this.eyes = eyes;
        this.limbs = limbs;
    }
    //    Human(int eyes,int limbs){
//        this.eyes=eyes;
//    }
}
