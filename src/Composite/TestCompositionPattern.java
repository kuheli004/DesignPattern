package Composite;

import javax.security.auth.callback.TextInputCallback;

public class TestCompositionPattern {

    public static void main(String args[]){
        Shape tri=new Triangle();
        Shape tri1=new Triangle();
        Shape cir=new Circle();

        Drawing drawing=new Drawing();
        drawing.add(tri);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("green");

    }
}
