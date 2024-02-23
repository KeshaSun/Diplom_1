# Юнит-тесты для программы заказа бургеров в Stellar Burgers

## Введение

Этот проект предусматривает написание юнит-тестов для программы, помогающей делать заказы бургеров в Stellar Burgers. Задача заключается в покрытии программы юнит-тестами. Вы можете использовать моки, стабы и параметризацию там, где это необходимо для достижения цели по покрытию.

## Обзор задания

- Склонируйте репозиторий с предоставленным начальным кодом.
- Настройте следующие библиотеки: Jacoco, Mockito и JUnit 4.
- Напишите тесты для классов `Bun`, `Burger`, `Ingredient` и `IngredientType`.
- Используйте моки, стабы и параметризацию по мере необходимости.
- Достигните покрытия тестами не менее 70%.

## Инструкции

1. **Клонирование репозитория:**
   Склонируйте репозиторий с начальным кодом на свой локальный компьютер.

2. **Установка библиотек:**
   Добавьте зависимости Jacoco, Mockito и JUnit 4 в раздел зависимостей вашего проекта.

3. **Написание юнит-тестов:**
   Создайте юнит-тесты для классов `Bun`, `Burger`, `Ingredient` и `IngredientType`. Используйте моки для зависимостей, стабы для фиксированных данных и параметризованные тесты для покрытия различных сценариев.

4. **Отчет о покрытии:**
   Убедитесь, что ваши юнит-тесты покрывают не менее 70% кодовой базы. Сгенерируйте отчет о покрытии при помощи Jacoco.

5. **Пуш в GitHub:**
   Загрузите ваш код с тестами на GitHub и создайте пулл-реквест.

## Критерии оценки

- Названия тестов и переменных должны быть правильными и следовать конвенциям, рассмотренным в курсе.
- Все тесты должны выполняться и проходить без сбоев.
- В тестах должно использоваться мокирование и параметризация.
- Должен быть сгенерирован отчет Jacoco и включен в пулл-реквест, показывающий покрытие тестами не менее 70%.
- Тесты не должны быть избыточными и должны быть разумными по числу.
- Тесты должны располагаться в директории `test/java`.
- Файл `pom.xml` должен быть свободен от лишних элементов.

## Настройка проекта

### Зависимости

Добавьте зависимости для JUnit 4, Mockito и Jacoco в ваш `pom.xml` как в примерах ниже:

```xml
<!-- pom.xml -->

<dependencies>
  <!-- Зависимость JUnit 4 -->
  <dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
  </dependency>

  <!-- Зависимость Mockito -->
  <dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>3.9.0</version>
    <scope>test</scope>
  </dependency>

  <!-- Плагин JaCoCo -->
  <dependency>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.8.7</version>
  </dependency>
</dependencies>
