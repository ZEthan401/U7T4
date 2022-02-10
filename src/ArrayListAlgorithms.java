import java.util.ArrayList;

public class ArrayListAlgorithms
{
    public static boolean containsTarget(ArrayList<String> stringList, String target)
    {
        for (String str : stringList)
        {
            if (str.indexOf(target) != -1)
            {
                return true;
            }
        }
        return false;
    }
    public static int belowAverage(ArrayList<Integer> intList)
    {
        int sum = 0;
        for (Integer num : intList)
        {
            sum += num;
        }
        double average = (double) sum / intList.size();

        int belowCount = 0;
        for (Integer num : intList)
        {
            if (num < average)
            {
                belowCount++;
            }
        }
        return belowCount;
    }
    public static void replaceWithCaps(ArrayList<String> wordList)
    {
        for (int i = 0; i < wordList.size(); i++)
        {
            String currentWord = wordList.get(i);
            String lastCharOfWord = currentWord.substring(currentWord.length() - 1);

            if (lastCharOfWord.equals("s"))
            {
                String upper = currentWord.toUpperCase();
                wordList.set(i, upper);
            }
        }
    }
    public static int indexOfMinimum(ArrayList<Integer> intList)
    {
        int min = intList.get(0);
        int minIndex = 0;

        for (int i = 0; i < intList.size(); i++)
        {
            if (intList.get(i) < min)
            {
                min = intList.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2)
    {
        for (int i = 0; i < numList1.size(); i++)
        {
            int num1 = numList1.get(i);
            int num2 = numList2.get(i);
            if (num1 != num2)
            {
                return false;
            }
        }
        return true;
    }
    public static void removeOdds(ArrayList<Integer> numList)
    {
        for (int i - 0; i < numList.size(); i++)
        {
            if (numList.get(i) % 2 == 1)
            {
                numList.remove(i);
                i--;
            }
        }
    }
}
