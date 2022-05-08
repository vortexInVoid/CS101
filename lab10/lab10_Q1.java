import java.util.Arrays;

/**
 * lab10_Q1
 */
public class lab10_Q1 {

    public static void main(String[] args) {
            /*
            int arraySize = 50;
            int[][] entries = new int[arraySize][arraySize];
            */

            int[][] entries = {
                {5,4,9,4,9,5},
                {4,2,4,5,5},
                {5,4,5,4,1},
                {5,4,1},
                {1,1,1},
                {4,5},
            };

            testAdjacent(entries);
        }

        private static void testAdjacent(int[][] subject)
        {
            for(int i = 0;i<subject.length;i++)
            {
                System.out.println("Original: " + Arrays.toString(subject[i])+ " Result: " +  Arrays.toString(makeAdjacent(subject[i])));
            }
        }

        private static int[] makeAdjacent(int[] subject)
        {
            int sizeOfControl = subject.length;
            int wantedFour = howManyTimes(subject, 4);
            int wantedFive = howManyTimes(subject, 5);
            int conjugate = (int) wantedFour - Math.abs(wantedFive-wantedFour);

            //System.out.println("Conjugate is " + conjugate + " Wanted four is " + wantedFour);

            int[] result = new int[sizeOfControl];

            int i = 0;
            int k = 0;

            while(i<subject.length)
            {
                //System.out.println("PHASE: "+i+ " AND " + Arrays.toString(result));
                if (conjugate >= 0 && subject[i] == 4)
                {
                    result[k] = 4;
                    result[k+1] = 5;
                    k=k+2;
                    //conjugate--;
                }
                else
                {
                    if (conjugate > 0 && subject[i] == 5)
                    {
                        conjugate--;
                    }
                    else{
                        result[k] = subject[i];
                        k++;
                    }
                }
                i++;
            }
            return result;
        }

        private static int howManyTimes(int [] subject,int wanted)
        {
            int wantedFound = 0;
            for(int element:subject)
            {
                if (element == wanted)
                {
                    wantedFound++;
                }
            }
            return wantedFound;
        }
    }