package hw10.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private final List<Record> record;


    public Phonebook() {
        record = new ArrayList<>();
    }

    public void addRecord(Record rec) {
        record.add(rec);
    }

    public List<Record> getAll() {
        return record;
    }

    public Record find(String name) {
        for (Record rec : record) {
            if (rec.getName().equals(name)) {
                return rec;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> contactSearch = new ArrayList<>();

        for (Record rec : record) {
            if (rec.getName().equals(name)) {
                contactSearch.add(rec);
            }
        }

        if (contactSearch.isEmpty()) {
            return null;
        }

        return contactSearch;
    }
}
