public class Piece {
    protected String name;
    protected String color;
    protected int Position;
    protected String Type;
    ///constructor
    public Piece(){
        this.name=" - ";
        this.color="";
        this.Type="";
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
    public void setType(String Type){this.Type=Type;}
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
        return this.name+this.color+this.Type;
    }
    public Board move(String Direction, int Spaces, Board placeHolder, int xpos, int ypos){
        return null;
    }
}
