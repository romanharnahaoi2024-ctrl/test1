public class Main {

    public static void main(String[] args) {
        abiturient a1 = new abiturient("Роман", "Гарнага", 1);
        abiturient a2 = new abiturient("Іван", "Коваль", 2);
        abiturient[] list = {a1, a2};

        System.out.println(a1.getSurname());

        findByFirstLetter(list, 'Р');
    }
    public static void findByFirstLetter(abiturient[] list, char letter) {
        System.out.println("Абітурієнти, що починаються на '" + letter + "':");
        for (abiturient a : list) {
            if (Character.toLowerCase(a.getName().charAt(0)) == Character.toLowerCase(letter)) {
                a.displayInfo();
            }
        }
    }
}
