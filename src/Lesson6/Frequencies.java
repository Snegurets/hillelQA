package Lesson6;

public class Frequencies {
    public static void main(String[] args) {
        String str = "Hello word";
        System.out.println(countFrequencies(str));

    }
    public static String countFrequencies(String str){
        int[] freq = new int[str.length()];
        int i, j;
        String result = "";

        char[] string = str.toCharArray();

        for(i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        System.out.println("Characters and corresponding frequency");
        for(i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                result += (string[i] + "-" + freq[i] + " ");
        }
        return result;
    }
}

