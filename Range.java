package binary_search;

public class Range {
    private final long[][] array;
    private final int columns;

    private int lowRow;
    private int lowColumn;

    private int highRow;
    private int highColumn;

    public Range (long[][] array,int rows,int columns){
    this.array = array;
    this.columns = columns;

    this.lowColumn = 0;
    this.lowRow = 0;

    this.highColumn = columns - 1;
    this.highRow = rows - 1;
    }

    public int size() {
        return (columns - lowColumn)+((highRow - lowRow - 1) * columns)+(highColumn + 1);
    }

    public long getMiddleValue(){
    int[] index = getMiddleIndex();
    int row = index[0];
    int column = index[1];
    return array[row][column];
    }

    public int[] getMiddleIndex(){
    int halfsize = size()/2;
    int middleRow = lowRow;
    int middleColumn = lowColumn;
    middleColumn += halfsize;
     //middleColumn不是合法下标情况
        while(middleColumn >= columns){
            middleRow++;
            middleColumn -=columns;
        }
        return new int[] {middleRow, middleColumn};
    }

    public void discardRightPart(){
    //让high往左走，不包括middle位置
        int[] index = getMiddleIndex();
        int row = index[0];
        int column = index[1];
        highRow = row;
        highColumn = column - 1;
        if (highColumn<0){
            highRow--;
            highColumn = columns - 1;
        }
    }

    public void discardLeftPart(){
    //让low往左走，不包括middle位置
        int[] index = getMiddleIndex();
        int row = index[0];
        int column = index[1];
        lowRow = row;
        lowColumn = column + 1;
        if (lowColumn >= columns){
            lowRow++;
            lowColumn = 0;
        }
    }
}
