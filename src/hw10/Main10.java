package hw10;

public class Main10 {


    public static void main(String[] args) {
        System.out.println("Word list: " + WordList.createList());
        System.out.println("Coincidences: " + MethodsHW10_1.countOccurance(WordList.createList(), "aaa"));
        System.out.println("Word list: " + MethodsHW10_1.toList(WordList.createList()));
        System.out.println("List of values: " + WordList.value);
        System.out.println("Unique list of values: " + MethodsHW10_1.findUnique(WordList.value));
        MethodsHW10_1.calcOccurance(WordList.createList());

    }
}
