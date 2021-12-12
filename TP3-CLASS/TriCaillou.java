/***************************************************************
* L2INFO | G1 TP3 Java | TriCaillou                            *        
* Par Loïc Cozdenmat | loic.cozdenmat@edu.univ-eiffel.fr       *
*                                                              *
* Crée le               : 10/10/2021 13:47                     *
****************************************************************/
import java.util.Arrays;
public class TriCaillou {

    /* Swap the value inside the array of index1 and index2 */
    private static void swap(int[] array,int index1,int index2){
        var tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }


    public static void main(String[] args) {

        int[] test1 = new int[]{2,1,9,1991,0,-1,3,2};
        var builder = new StringBuilder();

        sort(test1);
        for (var el: test1){
            builder.append(el).append(" ");
        }
        System.out.println(builder.toString());


    }

    /* Give the position of the lesser value inside the array between index1 and index2 */
    private static int indexOfMin(int[] array, int index1, int index2){
        var res = index1;
        if (index1 < 0 || index2 > array.length)
            throw new IllegalArgumentException("error with index");
        for (int i = index1 + 1; i < index2; i++){
            if (array[i] < array[res])
                res = i;
        }
        return res;

    }

    /* Sort the array */
    private static void sort(int[] array){
        var posOfMin = 0;
        for (int i = 0; i < array.length; i++){
            posOfMin = indexOfMin(array, i, array.length);
            if (i != posOfMin){
                swap(array, i, posOfMin);
            }
        }
    }
}