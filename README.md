Реализовать RESTful приложение "Обмен валют в кассе банка" на Java 8.

Использовать следующие технологии:
1. Java 8 (Collections Framework, Stream, Lambda, JDBC, Servlet API, JSP, JSTL)
2. HTML, JS, CSS
3. Web-сервисы (REST xml и json)
4. Spring и Spring MVC
   [Spring Boot - НЕ использовать!]

Приложение должно состоять из следующих частей:
1. Любая БД SQL на платформе PostgreSQL
2. Web-сервис, принимающий запросы от клиентских программ по протоколу http
3. Web-интерфейс пользователя
4. Web-интерфейс администрирования


Список доступных валют: USD - доллар США, EUR - евро
Сервис курсов валют НБУ: https://bank.gov.ua/ua/open-data/api-dev
<br>Наличный курс ПриватБанка (в отделениях):<br>
● GET XML: https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=5
<br>
● GET JSON: https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5

Параметры ответа:
ccy - Код валюты<br>
base_ccy - Код национальной валюты<br>
buy - Курс покупки<br>
sale - Курс продажи<br>

Требования к компонентам:
1. В БД хранятся справочники и журнал операций покупки/продажи
2. Web-сервис должен обеспечивать все необходимые операции для работы интерфейсов
   администрирования и просмотра. 
<br>RESTful в форматах json и xml: поиск, чтение, добавление, редактирование, удаление.
<br>Dao - слой реализовать на “голом” JDBC, Spring JdbcTemplate