public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Лёха";
        post.passport = "7777 №777777";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-777-77-77";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 16;
        post.birthday.month = 7;
        post.birthday.year = 1997;
    }
}
