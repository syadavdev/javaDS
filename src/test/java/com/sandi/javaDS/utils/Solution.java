/*
debts = ['Alex Blake 2', 'Blake Alex 2', 'Casey Alex 5', 'Blake Casey 7', 'Alex Blake 4', 'Alex Casey 4']



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    */
/*
     * Complete the 'smallestNegativeBalance' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts 2D_STRING_ARRAY debts as parameter.
     *//*


    public static List<String> smallestNegativeBalance(List<List<String>> debts) {

        List<String> members = new ArrayList<>();

        Map<String, Integer> memberWithBalance = new HashMap<>();

        members = debts.stream().map(d -> {

            memberWithBalance.put(d.get(0), Integer.parseInt(d.get(2)));
            memberWithBalance.put(d.get(1), Integer.parseInt(d.get(2)));

            return null;
        }).collect(toList());


        return members;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int debtsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int debtsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> debts = new ArrayList<>();

        IntStream.range(0, debtsRows).forEach(i -> {
            try {
                debts.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<String> result = Result.smallestNegativeBalance(debts);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/
