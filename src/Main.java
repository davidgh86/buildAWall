public class Main {

    public static final int NUMBER_MAXIMUM_OF_BRICKS = 1000;

    public static void main(String[] args) {
        buildAWall(99, 10);
    }

    private static void buildAWall(int numberOfRows, int numberOfBricksPerRow){
        if(invalidParameters(numberOfRows, numberOfBricksPerRow)){
            System.out.println("Invalid Parameters");
        }else if (tooMuchBricksNeeded(numberOfRows, numberOfBricksPerRow)){
            System.out.println("Naah, too much...here's my resignation");
        }else {
            printWall(numberOfRows, numberOfBricksPerRow);
        }
    }

    private static void printWall(int numberOfRows, int numberOfBricksPerRow) {
        for (int i=numberOfRows; i>0; i--){
            if (isOdd(i)){
                printFullBricksRow(numberOfBricksPerRow);
            }
            else {
                printRowWithHalfBricks(numberOfBricksPerRow);
            }
        }
    }

    private static boolean invalidParameters(int numberOfRows, int numberOfBricksPerRow){
        return (numberOfRows<1 || numberOfBricksPerRow<1);
    }

    private static boolean tooMuchBricksNeeded(int numberOfRows, int numberOfBricksPerRow){
        return ((numberOfRows * numberOfBricksPerRow) > NUMBER_MAXIMUM_OF_BRICKS);
    }

    private static void printRowWithHalfBricks(int numberOfBricksPerRow) {
        System.out.println(generateBrickRowWithHalfBricks(numberOfBricksPerRow));
    }

    private static void printFullBricksRow(int numberOfBricksPerRow) {
        System.out.println(generateBrickRowWithOnlyFullBricks(numberOfBricksPerRow));
    }

    private static String generateBrickRowWithOnlyFullBricks(int numberOfBricksPerRow) {
        String briksRow = "";
        for(int i=numberOfBricksPerRow; i>1; i-- ){
            briksRow += "■■|";
        }
        briksRow += "■■";
        return briksRow;
    }

    private static String generateBrickRowWithHalfBricks(int numberOfBricksPerRow) {
        return "■|" +  generateBrickRowWithOnlyFullBricks(numberOfBricksPerRow -1 ) + "|■";
    }

    private static boolean isOdd(int number) {
        return ((number%2)==1);
    }
    
}
