package inheritance;

public class base {
    double w;
    double l;
    double h;


    base(){
        this.w = -1;
        this.l = -1;
        this.h = -1;
    }

    base (double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    base (double h, double l, double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    base (base old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
