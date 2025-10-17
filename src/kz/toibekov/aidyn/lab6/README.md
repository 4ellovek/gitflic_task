## Общее:
```
- создать ветку lab6/ваша_фамилия_имя
- создать package kz.ektu.ваша_фамилия.имя.lab6
- по окончании работы создать **Запрос на слияние**
```

---
# 🧪 Вариант 1
## Задача 1: Система управления заказами
Создайте систему управления заказами с возможностью фильтрации по различным критериям.

Создайте класс Order с полями:

private String orderId;
private String customerName;
private double amount;
private String status;
private LocalDate orderDate;
Создайте интерфейс OrderService с методами:

// Метод для поиска заказов по диапазону сумм
List<Order> findOrdersByAmountRange(List<Order> orders, double minAmount, double maxAmount);
// Метод для поиска заказов по статусу
List<Order> findOrdersByStatus(List<Order> orders, String status);
// Метод для поиска заказов с суммой выше средней
List<Order> findHighValueOrders(List<Order> orders);
Требования:

Создайте класс Order с конструктором, геттерами и сеттерами
Создайте класс OrderServiceImpl для реализации интерфейса OrderService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по дате в порядке убывания
## Задача 2: Система управления сотрудниками
Создайте систему управления сотрудниками с обработкой ошибок и валидацией данных.

Создайте класс Employee с полями:

private String employeeId;
private String name;
private String department;
private double salary;
private int experienceYears;
private boolean isActive;
Создайте интерфейс EmployeeService с методами:

// Добавление сотрудника в компанию (проверяет уникальность ID)
boolean addEmployee(Employee employee) throws IllegalArgumentException;
// Увольнение сотрудника (если сотрудник существует)
boolean fireEmployee(String employeeId) throws Exception;
// Поиск сотрудников по отделу
List<Employee> searchByDepartment(String department);
// Получение статистики по зарплатам (средняя, максимальная, минимальная)
Map<String, Double> getSalaryStatistics();
// Фильтрация сотрудников по стажу
List<Employee> filterEmployeesByExperience(int minExperience);
Обработка ошибок:

Если добавляется сотрудник с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь уволить несуществующего сотрудника, бросьте Exception
Требования:

Создайте класс Employee с конструктором, геттерами и сеттерами
Создайте класс EmployeeServiceImpl для реализации интерфейса EmployeeService
Используйте HashMap для хранения сотрудников по ID
Используйте ArrayList для хранения списка сотрудников
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность зарплаты)
Добавьте метод для вывода всех сотрудников в форматированном виде

---
# 🧪 Вариант 2
## Задача 1: Система управления задачами
Создайте систему управления задачами с возможностью фильтрации по различным критериям.

Создайте класс Task с полями:

private String taskId;
private String title;
private String assignee;
private String priority;
private String status;
private LocalDate dueDate;
Создайте интерфейс TaskService с методами:

// Метод для поиска задач по приоритету
List<Task> findTasksByPriority(List<Task> tasks, String priority);
// Метод для поиска задач по статусу
List<Task> findTasksByStatus(List<Task> tasks, String status);
// Метод для поиска просроченных задач
List<Task> findOverdueTasks(List<Task> tasks);
Требования:

Создайте класс Task с конструктором, геттерами и сеттерами
Создайте класс TaskServiceImpl для реализации интерфейса TaskService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по дате окончания в порядке возрастания
## Задача 2: Система управления медиа-файлами
Создайте систему управления медиа-файлами с обработкой ошибок и валидацией данных.

Создайте класс MediaFile с полями:

private String fileId;
private String fileName;
private String fileType;
private long fileSize;
private String owner;
private boolean isPublic;
private LocalDateTime uploadDate;
Создайте интерфейс MediaService с методами:

// Добавление файла в систему (проверяет уникальность ID)
boolean addFile(MediaFile file) throws IllegalArgumentException;
// Удаление файла (если файл существует)
boolean deleteFile(String fileId) throws Exception;
// Поиск файлов по типу
List<MediaFile> searchByFileType(String fileType);
// Получение статистики по размерам файлов
Map<String, Long> getFileSizeStatistics();
// Фильтрация файлов по дате загрузки
List<MediaFile> filterFilesByDate(LocalDate fromDate, LocalDate toDate);
Обработка ошибок:

Если добавляется файл с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь удалить несуществующий файл, бросьте Exception
Требования:

Создайте класс MediaFile с конструктором, геттерами и сеттерами
Создайте класс MediaServiceImpl для реализации интерфейса MediaService
Используйте HashMap для хранения файлов по ID
Используйте ArrayList для хранения списка файлов
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность размера файла)
Добавьте метод для вывода всех файлов в форматированном виде
---
# 🧪 Вариант 3
## Задача 1: Система управления клиентами
Создайте систему управления клиентами с возможностью фильтрации по различным критериям.

Создайте класс Customer с полями:

private String customerId;
private String fullName;
private String email;
private String phoneNumber;
private String city;
private double totalSpent;
Создайте интерфейс CustomerService с методами:

// Метод для поиска клиентов по городу
List<Customer> findCustomersByCity(List<Customer> customers, String city);
// Метод для поиска клиентов по диапазону трат
List<Customer> findCustomersBySpendingRange(List<Customer> customers, double minSpent, double maxSpent);
// Метод для поиска активных клиентов
List<Customer> findActiveCustomers(List<Customer> customers);
Требования:

Создайте класс Customer с конструктором, геттерами и сеттерами
Создайте класс CustomerServiceImpl для реализации интерфейса CustomerService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по сумме потраченных денег в порядке убывания
## Задача 2: Система управления маршрутами
Создайте систему управления маршрутами с обработкой ошибок и валидацией данных.

Создайте класс Route с полями:

private String routeId;
private String origin;
private String destination;
private double distance;
private String transportType;
private int estimatedTimeMinutes;
private boolean isActive;
Создайте интерфейс RouteService с методами:

// Добавление маршрута в систему (проверяет уникальность ID)
boolean addRoute(Route route) throws IllegalArgumentException;
// Деактивация маршрута (если маршрут существует)
boolean deactivateRoute(String routeId) throws Exception;
// Поиск маршрутов по типу транспорта
List<Route> searchByTransportType(String transportType);
// Получение статистики по дистанциям
Map<String, Double> getDistanceStatistics();
// Фильтрация маршрутов по времени
List<Route> filterRoutesByTime(int maxTimeMinutes);
Обработка ошибок:

Если добавляется маршрут с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь деактивировать несуществующий маршрут, бросьте Exception
Требования:

Создайте класс Route с конструктором, геттерами и сеттерами
Создайте класс RouteServiceImpl для реализации интерфейса RouteService
Используйте HashMap для хранения маршрутов по ID
Используйте ArrayList для хранения списка маршрутов
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность расстояния)
Добавьте метод для вывода всех маршрутов в форматированном виде
---
# 🧪 Вариант 4
## Задача 1: Система управления фильмами
Создайте систему управления фильмами с возможностью фильтрации по различным критериям.

Создайте класс Movie с полями:

private String movieId;
private String title;
private String director;
private int releaseYear;
private double rating;
private String genre;
private boolean isAvailable;
Создайте интерфейс MovieService с методами:

// Метод для поиска фильмов по жанру
List<Movie> findMoviesByGenre(List<Movie> movies, String genre);
// Метод для поиска фильмов по рейтингу
List<Movie> findMoviesByRating(List<Movie> movies, double minRating);
// Метод для поиска доступных фильмов
List<Movie> findAvailableMovies(List<Movie> movies);
Требования:

Создайте класс Movie с конструктором, геттерами и сеттерами
Создайте класс MovieServiceImpl для реализации интерфейса MovieService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по рейтингу в порядке убывания
## Задача 2: Система управления инвентарем
Создайте систему управления инвентарем с обработкой ошибок и валидацией данных.

Создайте класс InventoryItem с полями:

private String itemId;
private String itemName;
private int quantity;
private double unitPrice;
private String category;
private String supplier;
private boolean isInStock;
Создайте интерфейс InventoryService с методами:

// Добавление товара в инвентарь (проверяет уникальность ID)
boolean addItem(InventoryItem item) throws IllegalArgumentException;
// Обновление количества товара (если товар существует)
boolean updateStock(String itemId, int newQuantity) throws Exception;
// Поиск товаров по категории
List<InventoryItem> searchByCategory(String category);
// Получение статистики по ценам
Map<String, Double> getPriceStatistics();
// Фильтрация товаров по количеству
List<InventoryItem> filterItemsByQuantity(int minQuantity);
Обработка ошибок:

Если добавляется товар с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь обновить несуществующий товар, бросьте Exception
Требования:

Создайте класс InventoryItem с конструктором, геттерами и сеттерами
Создайте класс InventoryServiceImpl для реализации интерфейса InventoryService
Используйте HashMap для хранения товаров по ID
Используйте ArrayList для хранения списка товаров
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность цены)
Добавьте метод для вывода всех товаров в форматированном виде
---
# 🧪 Вариант 5
## Задача 1: Система управления проектами
Создайте систему управления проектами с возможностью фильтрации по различным критериям.

Создайте класс Project с полями:

private String projectId;
private String projectName;
private String manager;
private String status;
private int teamSize;
private LocalDate startDate;
private double budget;
Создайте интерфейс ProjectService с методами:

// Метод для поиска проектов по статусу
List<Project> findProjectsByStatus(List<Project> projects, String status);
// Метод для поиска проектов по размеру команды
List<Project> findProjectsByTeamSize(List<Project> projects, int minTeamSize);
// Метод для поиска проектов с бюджетом выше среднего
List<Project> findHighBudgetProjects(List<Project> projects);
Требования:

Создайте класс Project с конструктором, геттерами и сеттерами
Создайте класс ProjectServiceImpl для реализации интерфейса ProjectService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по дате начала в порядке возрастания
## Задача 2: Система управления ресурсами
Создайте систему управления ресурсами с обработкой ошибок и валидацией данных.

Создайте класс Resource с полями:

private String resourceId;
private String resourceName;
private String resourceType;
private int capacity;
private String location;
private boolean isAvailable;
private LocalDateTime lastUpdated;
Создайте интерфейс ResourceService с методами:

// Добавление ресурса в систему (проверяет уникальность ID)
boolean addResource(Resource resource) throws IllegalArgumentException;
// Бронирование ресурса (если ресурс доступен)
boolean bookResource(String resourceId) throws Exception;
// Поиск ресурсов по типу
List<Resource> searchByResourceType(String resourceType);
// Получение статистики по вместимости
Map<String, Integer> getCapacityStatistics();
// Фильтрация ресурсов по местоположению
List<Resource> filterResourcesByLocation(String location);
Обработка ошибок:

Если добавляется ресурс с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь забронировать несуществующий ресурс, бросьте Exception
Требования:

Создайте класс Resource с конструктором, геттерами и сеттерами
Создайте класс ResourceServiceImpl для реализации интерфейса ResourceService
Используйте HashMap для хранения ресурсов по ID
Используйте ArrayList для хранения списка ресурсов
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность вместимости)
Добавьте метод для вывода всех ресурсов в форматированном виде
---
# 🧪 Вариант 6
## Задача 1: Система управления книгами
Создайте систему управления книгами с возможностью фильтрации по различным критериям.

Создайте класс Book с полями:

private String isbn;
private String title;
private String author;
private String genre;
private int publicationYear;
private double price;
private boolean isAvailable;
Создайте интерфейс BookService с методами:

// Метод для поиска книг по автору
List<Book> findBooksByAuthor(List<Book> books, String author);
// Метод для поиска книг по году публикации
List<Book> findBooksByYear(List<Book> books, int minYear, int maxYear);
// Метод для поиска доступных книг
List<Book> findAvailableBooks(List<Book> books);
Требования:

Создайте класс Book с конструктором, геттерами и сеттерами
Создайте класс BookServiceImpl для реализации интерфейса BookService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по цене в порядке возрастания
## Задача 2: Система управления медицинскими записями
Создайте систему управления медицинскими записями с обработкой ошибок и валидацией данных.

Создайте класс MedicalRecord с полями:

private String recordId;
private String patientName;
private String doctorName;
private String diagnosis;
private LocalDate appointmentDate;
private double consultationFee;
private boolean isCompleted;
Создайте интерфейс MedicalRecordService с методами:

// Добавление записи в систему (проверяет уникальность ID)
boolean addRecord(MedicalRecord record) throws IllegalArgumentException;
// Завершение записи (если запись существует)
boolean completeRecord(String recordId) throws Exception;
// Поиск записей по диагнозу
List<MedicalRecord> searchByDiagnosis(String diagnosis);
// Получение статистики по стоимости консультаций
Map<String, Double> getConsultationStatistics();
// Фильтрация записей по дате приема
List<MedicalRecord> filterRecordsByDate(LocalDate fromDate, LocalDate toDate);
Обработка ошибок:

Если добавляется запись с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь завершить несуществующую запись, бросьте Exception
Требования:

Создайте класс MedicalRecord с конструктором, геттерами и сеттерами
Создайте класс MedicalRecordServiceImpl для реализации интерфейса MedicalRecordService
Используйте HashMap для хранения записей по ID
Используйте ArrayList для хранения списка записей
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность стоимости)
Добавьте метод для вывода всех записей в форматированном виде
---
# 🧪 Вариант 7
## Задача 1: Система управления покупками
Создайте систему управления покупками с возможностью фильтрации по различным критериям.

Создайте класс Purchase с полями:

private String purchaseId;
private String customerName;
private String productName;
private double price;
private int quantity;
private String paymentMethod;
private LocalDate purchaseDate;
private String status;
Создайте интерфейс PurchaseService с методами:

// Метод для поиска покупок по методу оплаты
List<Purchase> findPurchasesByPaymentMethod(List<Purchase> purchases, String paymentMethod);
// Метод для поиска покупок по дате
List<Purchase> findPurchasesByDate(List<Purchase> purchases, LocalDate fromDate, LocalDate toDate);
// Метод для поиска покупок с высокой стоимостью
List<Purchase> findHighValuePurchases(List<Purchase> purchases, double minAmount);
Требования:

Создайте класс Purchase с конструктором, геттерами и сеттерами
Создайте класс PurchaseServiceImpl для реализации интерфейса PurchaseService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по дате покупки в порядке убывания
## Задача 2: Система управления курсами
Создайте систему управления курсами с обработкой ошибок и валидацией данных.

Создайте класс Course с полями:

private String courseId;
private String courseName;
private String instructor;
private int durationHours;
private double fee;
private String category;
private boolean isEnrolled;
private LocalDate startDate;
Создайте интерфейс CourseService с методами:

// Добавление курса в систему (проверяет уникальность ID)
boolean addCourse(Course course) throws IllegalArgumentException;
// Запись на курс (если курс доступен)
boolean enrollInCourse(String courseId) throws Exception;
// Поиск курсов по категории
List<Course> searchByCategory(String category);
// Получение статистики по длительности курсов
Map<String, Integer> getDurationStatistics();
// Фильтрация курсов по дате начала
List<Course> filterCoursesByStartDate(LocalDate fromDate, LocalDate toDate);
Обработка ошибок:

Если добавляется курс с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь записаться на несуществующий курс, бросьте Exception
Требования:

Создайте класс Course с конструктором, геттерами и сеттерами
Создайте класс CourseServiceImpl для реализации интерфейса CourseService
Используйте HashMap для хранения курсов по ID
Используйте ArrayList для хранения списка курсов
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность стоимости)
Добавьте метод для вывода всех курсов в форматированном виде
---
# 🧪 Вариант 8
## Задача 1: Система управления заказами
Создайте систему управления заказами с возможностью фильтрации по различным критериям.

Создайте класс Order с полями:

private String orderId;
private String customerName;
private String productName;
private double totalPrice;
int quantity;
private String orderStatus;
private LocalDate orderDate;
private String shippingAddress;
Создайте интерфейс OrderService с методами:

// Метод для поиска заказов по статусу
List<Order> findOrdersByStatus(List<Order> orders, String status);
// Метод для поиска заказов по дате
List<Order> findOrdersByDate(List<Order> orders, LocalDate fromDate, LocalDate toDate);
// Метод для поиска заказов с высокой стоимостью
List<Order> findHighValueOrders(List<Order> orders, double minAmount);
Требования:

Создайте класс Order с конструктором, геттерами и сеттерами
Создайте класс OrderServiceImpl для реализации интерфейса OrderService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по дате заказа в порядке убывания
## Задача 2: Система управления банковскими операциями
Создайте систему управления банковскими операциями с обработкой ошибок и валидацией данных.

Создайте класс BankTransaction с полями:

private String transactionId;
private String accountNumber;
private String transactionType;
private double amount;
private LocalDate transactionDate;
private String description;
private boolean isCompleted;
Создайте интерфейс BankTransactionService с методами:

// Добавление транзакции в систему (проверяет уникальность ID)
boolean addTransaction(BankTransaction transaction) throws IllegalArgumentException;
// Отмена транзакции (если транзакция существует)
boolean cancelTransaction(String transactionId) throws Exception;
// Поиск транзакций по типу
List<BankTransaction> searchByTransactionType(String transactionType);
// Получение статистики по суммам транзакций
Map<String, Double> getAmountStatistics();
// Фильтрация транзакций по дате
List<BankTransaction> filterTransactionsByDate(LocalDate fromDate, LocalDate toDate);
Обработка ошибок:

Если добавляется транзакция с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь отменить несуществующую транзакцию, бросьте Exception
Требования:

Создайте класс BankTransaction с конструктором, геттерами и сеттерами
Создайте класс BankTransactionServiceImpl для реализации интерфейса BankTransactionService
Используйте HashMap для хранения транзакций по ID
Используйте ArrayList для хранения списка транзакций
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность суммы)
Добавьте метод для вывода всех транзакций в форматированном виде
---
# 🧪 Вариант 9
## Задача 1: Система управления услугами
Создайте систему управления услугами с возможностью фильтрации по различным критериям.

Создайте класс Service с полями:

private String serviceId;
private String serviceName;
private String provider;
private double price;
private int durationMinutes;
private String category;
private boolean isAvailable;
Создайте интерфейс ServiceService с методами:

// Метод для поиска услуг по категории
List<Service> findServicesByCategory(List<Service> services, String category);
// Метод для поиска услуг по цене
List<Service> findServicesByPrice(List<Service> services, double minPrice, double maxPrice);
// Метод для поиска доступных услуг
List<Service> findAvailableServices(List<Service> services);
Требования:

Создайте класс Service с конструктором, геттерами и сеттерами
Создайте класс ServiceServiceImpl для реализации интерфейса ServiceService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по цене в порядке возрастания
## Задача 2: Система управления отелями
Создайте систему управления отелями с обработкой ошибок и валидацией данных.

Создайте класс Hotel с полями:

private String hotelId;
private String hotelName;
private String location;
private int starRating;
private double averagePricePerNight;
private String amenities;
private boolean isAvailable;
private LocalDate checkInDate;
Создайте интерфейс HotelService с методами:

// Добавление отеля в систему (проверяет уникальность ID)
boolean addHotel(Hotel hotel) throws IllegalArgumentException;
// Бронирование отеля (если отель доступен)
boolean bookHotel(String hotelId) throws Exception;
// Поиск отелей по местоположению
List<Hotel> searchByLocation(String location);
// Получение статистики по рейтингу отелей
Map<String, Integer> getRatingStatistics();
// Фильтрация отелей по дате заселения
List<Hotel> filterHotelsByCheckInDate(LocalDate fromDate, LocalDate toDate);
Обработка ошибок:

Если добавляется отель с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь забронировать несуществующий отель, бросьте Exception
Требования:

Создайте класс Hotel с конструктором, геттерами и сеттерами
Создайте класс HotelServiceImpl для реализации интерфейса HotelService
Используйте HashMap для хранения отелей по ID
Используйте ArrayList для хранения списка отелей
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность цены)
Добавьте метод для вывода всех отелей в форматированном виде
---
# 🧪 Вариант 10
## Задача 1: Система управления вакансиями
Создайте систему управления вакансиями с возможностью фильтрации по различным критериям.

Создайте класс Job с полями:

private String jobId;
private String jobTitle;
private String company;
private String location;
private double salary;
private String jobType;
private int experienceYears;
private LocalDate postedDate;
Создайте интерфейс JobService с методами:

// Метод для поиска вакансий по типу работы
List<Job> findJobsByType(List<Job> jobs, String jobType);
// Метод для поиска вакансий по зарплате
List<Job> findJobsBySalary(List<Job> jobs, double minSalary, double maxSalary);
// Метод для поиска вакансий по опыту
List<Job> findJobsByExperience(List<Job> jobs, int minExperience);
Требования:

Создайте класс Job с конструктором, геттерами и сеттерами
Создайте класс JobServiceImpl для реализации интерфейса JobService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по дате размещения в порядке убывания
## Задача 2: Система управления мероприятиями
Создайте систему управления мероприятиями с обработкой ошибок и валидацией данных.

Создайте класс Event с полями:

private String eventId;
private String eventName;
private String eventType;
private LocalDate eventDate;
private String location;
private int maxParticipants;
private double entryFee;
private boolean isCancelled;
Создайте интерфейс EventService с методами:

// Добавление мероприятия в систему (проверяет уникальность ID)
boolean addEvent(Event event) throws IllegalArgumentException;
// Отмена мероприятия (если мероприятие существует)
boolean cancelEvent(String eventId) throws Exception;
// Поиск мероприятий по типу
List<Event> searchByEventType(String eventType);
// Получение статистики по количеству участников
Map<String, Integer> getParticipantStatistics();
// Фильтрация мероприятий по дате
List<Event> filterEventsByDate(LocalDate fromDate, LocalDate toDate);
Обработка ошибок:

Если добавляется мероприятие с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь отменить несуществующее мероприятие, бросьте Exception
Требования:

Создайте класс Event с конструктором, геттерами и сеттерами
Создайте класс EventServiceImpl для реализации интерфейса EventService
Используйте HashMap для хранения мероприятий по ID
Используйте ArrayList для хранения списка мероприятий
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность стоимости)
Добавьте метод для вывода всех мероприятий в форматированном виде
---
# 🧪 Вариант 11
## Задача 1: Система управления клиентами
Создайте систему управления клиентами с возможностью фильтрации по различным критериям.

Создайте класс Customer с полями:

private String customerId;
private String customerName;
private String email;
private String phone;
private String address;
private String customerType;
private double totalSpent;
private LocalDate registrationDate;
Создайте интерфейс CustomerService с методами:

// Метод для поиска клиентов по типу
List<Customer> findCustomersByType(List<Customer> customers, String customerType);
// Метод для поиска клиентов по тратам
List<Customer> findCustomersBySpending(List<Customer> customers, double minSpent);
// Метод для поиска клиентов по дате регистрации
List<Customer> findCustomersByRegistrationDate(List<Customer> customers, LocalDate fromDate, LocalDate toDate);
Требования:

Создайте класс Customer с конструктором, геттерами и сеттерами
Создайте класс CustomerServiceImpl для реализации интерфейса CustomerService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по тратам в порядке убывания
## Задача 2: Система управления продуктами
Создайте систему управления продуктами с обработкой ошибок и валидацией данных.

Создайте класс Product с полями:

private String productId;
private String productName;
private String category;
private double price;
private int stockQuantity;
private String supplier;
private boolean isAvailable;
Создайте интерфейс ProductService с методами:

// Добавление продукта в систему (проверяет уникальность ID)
boolean addProduct(Product product) throws IllegalArgumentException;
// Обновление количества на складе (если продукт существует)
boolean updateStock(String productId, int newQuantity) throws Exception;
// Поиск продуктов по категории
List<Product> searchByCategory(String category);
// Получение статистики по ценам продуктов
Map<String, Double> getPriceStatistics();
// Фильтрация продуктов по наличию
List<Product> filterProductsByAvailability(boolean isAvailable);
Обработка ошибок:

Если добавляется продукт с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь обновить несуществующий продукт, бросьте Exception
Требования:

Создайте класс Product с конструктором, геттерами и сеттерами
Создайте класс ProductServiceImpl для реализации интерфейса ProductService
Используйте HashMap для хранения продуктов по ID
Используйте ArrayList для хранения списка продуктов
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность цены)
Добавьте метод для вывода всех продуктов в форматированном виде
---
# 🧪 Вариант 12
## Задача 1: Система управления проектами
Создайте систему управления проектами с возможностью фильтрации по различным критериям.

Создайте класс Project с полями:

private String projectId;
private String projectName;
private String manager;
private String status;
private LocalDate startDate;
private LocalDate endDate;
private double budget;
private String department;
Создайте интерфейс ProjectService с методами:

// Метод для поиска проектов по статусу
List<Project> findProjectsByStatus(List<Project> projects, String status);
// Метод для поиска проектов по бюджету
List<Project> findProjectsByBudget(List<Project> projects, double minBudget, double maxBudget);
// Метод для поиска проектов по дате начала
List<Project> findProjectsByStartDate(List<Project> projects, LocalDate fromDate, LocalDate toDate);
Требования:

Создайте класс Project с конструктором, геттерами и сеттерами
Создайте класс ProjectServiceImpl для реализации интерфейса ProjectService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по дате начала в порядке возрастания
## Задача 3: Система управления задачами
Создайте систему управления задачами с обработкой ошибок и валидацией данных.

Создайте класс Task с полями:

private String taskId;
private String taskName;
private String assignee;
private String status;
private LocalDate dueDate;
private String priority;
private String project;
private boolean isCompleted;
Создайте интерфейс TaskService с методами:

// Добавление задачи в систему (проверяет уникальность ID)
boolean addTask(Task task) throws IllegalArgumentException;
// Обновление статуса задачи (если ## Задача существует)
boolean updateTaskStatus(String taskId, String newStatus) throws Exception;
// Поиск задач по приоритету
List<Task> searchByPriority(String priority);
// Получение статистики по статусам задач
Map<String, Integer> getStatusStatistics();
// Фильтрация задач по статусу завершения
List<Task> filterTasksByCompletion(boolean isCompleted);
Обработка ошибок:

Если добавляется ## Задача с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь обновить несуществующую задачу, бросьте Exception
Требования:

Создайте класс Task с конструктором, геттерами и сеттерами
Создайте класс TaskServiceImpl для реализации интерфейса TaskService
Используйте HashMap для хранения задач по ID
Используйте ArrayList для хранения списка задач
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность даты)
Добавьте метод для вывода всех задач в форматированном виде
---
# 🧪 Вариант 13
## Задача 1: Система управления библиотекой
Создайте систему управления библиотекой с возможностью фильтрации по различным критериям.

Создайте класс Book с полями:

private String isbn;
private String title;
private String author;
private String genre;
private int publicationYear;
private String publisher;
private boolean isAvailable;
private LocalDate dueDate;
Создайте интерфейс BookService с методами:

// Метод для поиска книг по автору
List<Book> findBooksByAuthor(List<Book> books, String author);
// Метод для поиска книг по жанру
List<Book> findBooksByGenre(List<Book> books, String genre);
// Метод для поиска книг по году публикации
List<Book> findBooksByYear(List<Book> books, int minYear, int maxYear);
Требования:

Создайте класс Book с конструктором, геттерами и сеттерами
Создайте класс BookServiceImpl для реализации интерфейса BookService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по году публикации в порядке убывания
## Задача 2: Система управления медиафайлами
Создайте систему управления медиафайлами с обработкой ошибок и валидацией данных.

Создайте класс MediaFile с полями:

private String fileId;
private String fileName;
private String fileType;
private long fileSize;
private LocalDate uploadDate;
private String uploader;
private boolean isPublic;
Создайте интерфейс MediaFileService с методами:

// Добавление медиафайла в систему (проверяет уникальность ID)
boolean addMediaFile(MediaFile mediaFile) throws IllegalArgumentException;
// Обновление доступности файла (если файл существует)
boolean updateFileVisibility(String fileId, boolean isPublic) throws Exception;
// Поиск медиафайлов по типу
List<MediaFile> searchByFileType(String fileType);
// Получение статистики по размерам файлов
Map<String, Long> getFileSizeStatistics();
// Фильтрация файлов по дате загрузки
List<MediaFile> filterFilesByUploadDate(LocalDate fromDate, LocalDate toDate);
Обработка ошибок:

Если добавляется файл с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь обновить несуществующий файл, бросьте Exception
Требования:

Создайте класс MediaFile с конструктором, геттерами и сеттерами
Создайте класс MediaFileServiceImpl для реализации интерфейса MediaFileService
Используйте HashMap для хранения файлов по ID
Используйте ArrayList для хранения списка файлов
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность размера файла)
Добавьте метод для вывода всех файлов в форматированном виде
---
# 🧪 Вариант 14
## Задача 1: Система управления обучением
Создайте систему управления обучением с возможностью фильтрации по различным критериям.

Создайте класс Course с полями:

private String courseId;
private String courseName;
private String instructor;
private String category;
private int durationHours;
private double price;
private String level;
private boolean isActive;
Создайте интерфейс CourseService с методами:

// Метод для поиска курсов по категории
List<Course> findCoursesByCategory(List<Course> courses, String category);
// Метод для поиска курсов по уровню
List<Course> findCoursesByLevel(List<Course> courses, String level);
// Метод для поиска курсов по продолжительности
List<Course> findCoursesByDuration(List<Course> courses, int minHours, int maxHours);
Требования:

Создайте класс Course с конструктором, геттерами и сеттерами
Создайте класс CourseServiceImpl для реализации интерфейса CourseService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по продолжительности в порядке возрастания
## Задача 2: Система управления ресурсами
Создайте систему управления ресурсами с обработкой ошибок и валидацией данных.

Создайте класс Resource с полями:

private String resourceId;
private String resourceName;
private String resourceType;
private int quantity;
private LocalDate acquisitionDate;
private String vendor;
private boolean isAvailable;
Создайте интерфейс ResourceService с методами:

// Добавление ресурса в систему (проверяет уникальность ID)
boolean addResource(Resource resource) throws IllegalArgumentException;
// Обновление количества ресурсов (если ресурс существует)
boolean updateResourceQuantity(String resourceId, int newQuantity) throws Exception;
// Поиск ресурсов по типу
List<Resource> searchByResourceType(String resourceType);
// Получение статистики по количеству ресурсов
Map<String, Integer> getResourceQuantityStatistics();
// Фильтрация ресурсов по доступности
List<Resource> filterResourcesByAvailability(boolean isAvailable);
Обработка ошибок:

Если добавляется ресурс с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь обновить несуществующий ресурс, бросьте Exception
Требования:

Создайте класс Resource с конструктором, геттерами и сеттерами
Создайте класс ResourceServiceImpl для реализации интерфейса ResourceService
Используйте HashMap для хранения ресурсов по ID
Используйте ArrayList для хранения списка ресурсов
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность количества)
Добавьте метод для вывода всех ресурсов в форматированном виде
---
# 🧪 Вариант 15
## Задача 1: Система управления данными клиентов
Создайте систему управления данными клиентов с возможностью фильтрации по различным критериям.

Создайте класс CustomerData с полями:

private String customerId;
private String fullName;
private String email;
private String phone;
private String address;
private String customerSegment;
private int lifetimeValue;
private LocalDate lastContactDate;
Создайте интерфейс CustomerDataService с методами:

// Метод для поиска клиентов по сегменту
List<CustomerData> findCustomersBySegment(List<CustomerData> customers, String segment);
// Метод для поиска клиентов по стоимости
List<CustomerData> findCustomersByValue(List<CustomerData> customers, int minValue, int maxValue);
// Метод для поиска клиентов по дате последнего контакта
List<CustomerData> findCustomersByLastContact(List<CustomerData> customers, LocalDate fromDate, LocalDate toDate);
Требования:

Создайте класс CustomerData с конструктором, геттерами и сеттерами
Создайте класс CustomerDataServiceImpl для реализации интерфейса CustomerDataService
Используйте ArrayList и List
Все методы должны возвращать новый список без изменения исходных данных
Добавьте проверку на null для входных параметров
Реализуйте сортировку результатов по стоимости в порядке убывания
## Задача 2: Система управления аналитикой
Создайте систему управления аналитикой с обработкой ошибок и валидацией данных.

Создайте класс AnalyticsData с полями:

private String dataId;
private String reportName;
private String dataType;
private LocalDate reportDate;
private double value;
private String category;
private boolean isActive;
Создайте интерфейс AnalyticsDataService с методами:

// Добавление аналитических данных в систему (проверяет уникальность ID)
boolean addAnalyticsData(AnalyticsData analyticsData) throws IllegalArgumentException;
// Обновление значения данных (если данные существуют)
boolean updateAnalyticsValue(String dataId, double newValue) throws Exception;
// Поиск данных по типу
List<AnalyticsData> searchByDataType(String dataType);
// Получение статистики по значениям данных
Map<String, Double> getAggregateValues();
// Фильтрация данных по активности
List<AnalyticsData> filterAnalyticsByActivity(boolean isActive);
Обработка ошибок:

Если добавляются данные с уже существующим ID, бросьте IllegalArgumentException
Если пытаетесь обновить несуществующие данные, бросьте Exception
Требования:

Создайте класс AnalyticsData с конструктором, геттерами и сеттерами
Создайте класс AnalyticsDataServiceImpl для реализации интерфейса AnalyticsDataService
Используйте HashMap для хранения данных по ID
Используйте ArrayList для хранения списка данных
Все методы должны корректно обрабатывать ситуации с пустыми или null значениями
Реализуйте валидацию входных данных (проверка на пустые строки, корректность значений)
Добавьте метод для вывода всех данных в форматированном виде