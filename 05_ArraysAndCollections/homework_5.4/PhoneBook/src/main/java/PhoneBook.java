import java.util.*;

public class PhoneBook {
    TreeMap<String, String> contact = new TreeMap<>();
    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        boolean phoneIsCorrect = phone.matches("[0-9]{11}");
        boolean nameIsCorrect = name.matches("[а-яА-Я-ё]+");
        if (phoneIsCorrect && nameIsCorrect) {

            if (contact.containsValue(phone)) {
                contact.clear();
                contact.put(name, phone);
            } else {
                contact.put(name, phone);
            }

        } else {
            System.out.println("Неверный формат ввода");
        }

    }

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        String phoneSet = "";
        for (Map.Entry<String, String> map : contact.entrySet()) {
            if (map.getValue().equals(phone)) {
                phoneSet = map.getKey() + " - " + map.getValue();
                if (contact.containsKey(phone)) {
                    phoneSet += "," + map.getValue();
                }
            }
        }
        return phoneSet;
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        Set<String> nameSet = new TreeSet<>();
        for (Map.Entry<String, String> map : contact.entrySet()) {
            if (map.getKey().equals(name)) {
                nameSet.add(name + " - " + map.getValue());
            }

        }
        return new TreeSet<>(nameSet);
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        Set<String> allContacts = new TreeSet<>();
        for (Map.Entry<String, String> people : contact.entrySet()) {
            allContacts.add(people.getKey() + " - " + people.getValue());
        }
        return new TreeSet<>(allContacts);
    }

}