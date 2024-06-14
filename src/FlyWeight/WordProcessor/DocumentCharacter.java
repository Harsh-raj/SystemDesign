package FlyWeight.WordProcessor;

public class DocumentCharacter implements ILetter{

    private char character;
    private String fontType;
    private int size;

    DocumentCharacter(char character, String fontType, int size){
        this.character = character;
        this.fontType = fontType;
        this.size = size;

    }

    //only getter methods
    char getCharacter(){
        return this.character;
    }

    @Override
    public void display(int row, int column) {

    //display the character of particular font and size
        //at given location
        for(int i=0;i<row;++i){
            System.out.println();
        }
        for(int j=0;j<column;++j){
            System.out.print(" ");
        }
        System.out.println(getCharacter());
    }
}
