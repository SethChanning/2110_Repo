public class Piece {
    private String name;
    private String color;
    private int Position;


    ///constructor
    public Piece(){
        this.name=" -";
        this.color="- ";
    }
    public Piece(String name, String color, int Position) {
        this.name=name;
        this.color=color;
        this.Position=Position;

    }
    ///setters
    public void setName(String name){this.name = name;
    }
    public void setColor(String color){this.color = color;
    }
    public void setPos(int Position){this.Position = Position;}

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
        return this.name+this.color;
    }
}
