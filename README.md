# **Задание:**
* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
методы. Реализовать в java.
* Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
хранить в Map. 
* Например:
“Введите цифру, соответствующую необходимому критерию:
1. 1 - ОЗУ
2. 2 - Объем ЖД
3. 3 - Операционная система
4. 4 - Цвет …
* Далее нужно запросить минимальные значения для указанных критериев - сохранить
параметры фильтрации можно также в Map.
* Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям

# **Решение:**
1) *  Класс "Laptop" описывает общий класс ноутбуков. Поля описывают характеристики ноутбука, а через методы .get'ыры я получаю значения этих полей по каждому экземпляру данного класса.
    * Переопределенный метод .toString() отвечает за вывод информации.

2) В методе main (класс Shop) создаются экземпляры класса Laptop и реализуются два метода searchLaptopsParameters (осуществляет поиск ноутбуков по 3 параметрам) и searchLaptop (осуществляет поиск ноутбуков по 1 параметру.)

Ввод параметров в обоих методах осуществляется с консоли.

