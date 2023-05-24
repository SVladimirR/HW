package hw9;


public class Main09 {
    public static void main(String[] args) {
        CollectionMyImpl myArr = new CollectionMyImpl();

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
        String element = myArr.get(5);
        System.out.println(element);

        myArr.delete("kkk");

        for (int i = 0; i < myArr.size(); i++) {
            String item = myArr.get(i);
            System.out.print(item + ", ");
        }
        myArr.contain("bbb");
        CollectionMyImpl myArr2 = new CollectionMyImpl();
        myArr2.add("kkk");

    }
}
