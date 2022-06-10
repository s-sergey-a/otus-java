package homework;


import java.util.*;

public class CustomerService {

    private final NavigableMap<Customer, String> services = new TreeMap<>(Comparator.comparingLong(Customer::getScores));

    private static Map.Entry<Customer, String> cloneEntry(Map.Entry<Customer, String> entry) {
        return Optional
                .ofNullable(entry)
                .map(source -> Map.entry(source.getKey().clone(), source.getValue()))
                .orElse(null);
    }

    public Map.Entry<Customer, String> getSmallest() {
        return cloneEntry(services.firstEntry());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        return cloneEntry(services.higherEntry(customer));
    }

    public void add(Customer customer, String data) {
        services.put(customer, data);
    }
}
