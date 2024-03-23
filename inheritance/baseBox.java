package inheritance;

public class baseBox extends Box{
    double blah;

    baseBox (){
        this.blah = 0;
    }

    public baseBox(double l, double h, double w, double weight) {
        super(l, h, w, weight);
        this.blah = blah;
    }

//    baseBox(double l, double w, double h, double weight){
//        super(l,w,h,weight);
//        this.blah = -1;
//    }
}
