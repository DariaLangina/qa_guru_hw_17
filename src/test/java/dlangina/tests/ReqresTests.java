package dlangina.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReqresTests extends Api {

  @BeforeAll
  public static void ensurePrecondition() {
    setUpRestAssured();
  }

  @Test
  @DisplayName("Запрос информации о пользователе по id")
  void getUserInfo() {
    System.out.println("Информация о пользователе id:1 : " + getInformationOfUserById(1));
  }

  @Test
  @DisplayName("Запрос кол-ва страниц с пользователями")
  void getAmountPagesWithUsers() {
    System.out.println("Кол-во страниц: " + getTotal());
  }

  @Test
  @DisplayName("Добавление нового пользователя по API")
  void createUserForTests() {
    createUser("Daria", "R-vision");
  }

  @Test
  @DisplayName("Изменение имени и места работы пользователю")
  void changingNameAndJob() {
    updateUser(2, "morpheus", "zion resident");
  }

  @Test
  @DisplayName("Проверка выполнения регистрации пользователя по API")
  void registration() {
    registrationByApi();
  }
}
