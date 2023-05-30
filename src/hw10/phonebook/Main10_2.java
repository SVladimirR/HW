package hw10.phonebook;

import java.util.List;

public class Main10_2 {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Record record = new Record("anna", "2222");
        Record record2 = new Record("ben", "7777");
        Record record3 = new Record("tom", "5555");
        Record record4 = new Record("anna", "1111");
        phonebook.addRecord(record);
        phonebook.addRecord(record2);
        phonebook.addRecord(record3);
        phonebook.addRecord(record4);

        List<Record> eeee = phonebook.getAll();

        for (Record ddd : eeee) {
            System.out.println("Name: " + ddd.getName() + ", phone: " + ddd.getPhone());
        }

        Record ddd = phonebook.find("tom");

        if (ddd != null) {
            System.out.println("Contact search:");
            System.out.println("Name: " + ddd.getName() + ", phone: " + ddd.getPhone());
        } else {
            System.out.println("Record not found.");
        }



        List<Record> contactSearch = phonebook.findAll("anna");

        if (contactSearch != null) {
            System.out.println("Contact search: " + contactSearch.size());

            for (Record s : contactSearch) {
                System.out.println("Name: " + s.getName() + ", phone: " + s.getPhone());
            }
        } else {
            System.out.println("Record not found.");
        }
    }
}


