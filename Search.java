package binary_search;



public class Search {
    public  static int[] search(long[][] array,int rows,int columns,long target){
        Range range = new Range(array, rows, columns);
        while(range.size() > 0){
            long middleValue =  range.getMiddleValue();
            if (target == middleValue){
                return range.getMiddleIndex();
            }
            else if (target < middleValue){
                range.discardRightPart();
            }
            else {
                range.discardLeftPart();
            }
        }
        return new int[] {-1,-1};
    }
}
