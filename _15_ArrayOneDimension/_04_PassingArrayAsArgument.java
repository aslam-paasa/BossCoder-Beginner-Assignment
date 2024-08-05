package _15_ArrayOneDimension;

public class _04_PassingArrayAsArgument {

    public static void update(int marks[]) {
        /**
         * Traverse each element of the array and update marks
         * */ 
        for(int i=0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
    /**
     * Ek function m kisi v variable ko pass krne k 2 tarike hote hai:
     * (a) Pass by Value : Function k changes main() function m reflect krte
     * (b) Pass by Reference : Function k andr ki changes to main() function m v reflect krnge
     * Note: Array is Pass by Reference.
    */
        int marks[] = {97, 98, 99};
        
        update(marks); 

        /**
         * Print our marks
        */
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    
    }

}
