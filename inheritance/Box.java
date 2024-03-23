package inheritance;

public class Box extends base{
    double weight;

//    Box (){
//        this.weight = -1;
//    }
//
//    Box (double l, double h, double w, double weight){
//        super(l,h,w);
//        this.weight = -1;
//
//    }

    Box (){
        this.weight = -1;
    }

    public Box(double h, double l, double w, double weight) {
        super(h, l, w);
        this.weight = weight;
    }
}
