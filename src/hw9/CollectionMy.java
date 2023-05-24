package hw9;

public interface CollectionMy {

        boolean add(String value);
        boolean add(int index, String value);
        boolean delete (String value);
        String get(int index);
        boolean contain(String value);
        boolean equals (CollectionMy str);
        boolean clear();
        int size();
    }


