// package hexlet.hw.pr4;

// /*
//  * User class example for 4-th lesson demo.
//  */
// class User {
//     static String classNameRus = "Пользователь";
//     long id;
//     String username;
//     String email;
//     int age;

//     /*
//      * Метод определяет, является ли User совершеннолетним.
//      * Если да, то возвращаеся значение - true.
//      * Если нет, то возвращается значение - false.
//      */
//     boolean isAdult() {
//         return age >= 18;
//     }

//     /*
//      * Серия getter-ов.
//      */
//     long getId() {
//         return id;
//     }

//     String getUsername() {
//         return username;
//     }

//     String getEmail() {
//         return email;
//     }

//     int getAge() {
//         return age;
//     }

//     /*
//      * Метод приводит к единому формату username. Как правило аналогичная логика
//      * используется для проверки, не существует ли у нас в системе пользователя с подобным именем.
//      */
//     static String formatUsername(String username) {
//         return username.trim().toLowerCase();
//     }
// }
