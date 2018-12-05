package es.estech.acantero;

public class Square extends Shape implements Drawable{

    public Square(int size, char pencil) {
        super(4, size, pencil);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sides=" + sides +
                ", size=" + size +
                ", pencil=" + pencil +
                '}';
    }

    @Override
    public void draw() {
        for (int i = 0; i < size; i++){
            String line = "";
            if (i == 0 || i == size-1){
                for (int j = 0; j < size; j++){
                    line += this.pencil + " ";
                }

            } else {
                for (int j = 0; j < size; j++){
                    if (j == 0 || j == size -1){
                        line += this.pencil + " ";
                    } else {
                        line += "  ";
                    }
                }
            }
            System.out.println(line);

        }
    }
}
