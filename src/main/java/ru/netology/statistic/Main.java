import ru.netology.statistic.FormDate;
import ru.netology.statistic.Post;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 №44444444";
        post.patronymic = "Иванович";
        post.phone = "+7(950)9999999";
        post.surname = "Иванов";
        post.subscription = true;
        post.bithday = new FormDate();
        post.bithday.day = 04;
        post.bithday.month = 11;
        post.bithday.year = 1987;
    }
}