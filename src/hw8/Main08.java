package hw8;


public class Main08 {

    public static void main(String[] args) {

        CollectionMy myArr = new CollectionMy();

        myArr.add(0, "aaa");
        myArr.add(1, "bbb");
        myArr.add(2, "ccc");
        myArr.add(3, "ddd");
        myArr.add(4, "eee");
        myArr.add(5, "fff");
        myArr.add(6, "iii");
        myArr.add(7, "jjj");

        myArr.add("kkk");
        myArr.add("lll");
        for (int i = 0; i < myArr.size(); i++) {
            String item = myArr.get(i);
            System.out.print(item + ", ");
        }

        System.out.println();
        String par = myArr.get(5);
        System.out.println(par);

        myArr.delete(2);
        myArr.delete("kkk");

        for (int i = 0; i < myArr.size(); i++) {
            String item = myArr.get(i);
            System.out.print(item + ", ");
        }

    }
}
