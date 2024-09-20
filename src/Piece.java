public class Piece {
    private String name;
    private String color;
    private int Position;


    ///constructor
    public Piece() {
        this.name=" - ";
    }
    ///setters
    public void setName(){this.name = name;
    }
    public void setColor(){this.color = color;
    }
    public void setPos(){this.Position = Position;}

    ///getters
     public String getName(){
        return this.name;
     }
    public String getColor(){
         return this.color;
    }
    public int getPos(){
         return this.Position;
    }


    public String toString(){
        return this.name;
    }
}
