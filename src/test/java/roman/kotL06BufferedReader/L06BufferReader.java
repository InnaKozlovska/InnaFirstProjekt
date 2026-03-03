package roman.kotL06BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
🧠 BufferedReader
BufferedReader — це клас із пакету java.io, який призначений для швидкого зчитування текстових даних (рядків або символів) із будь-якого джерела вводу: консолі, файлу, мережевого потоку тощо.
🔍 Основна ідея
Він зчитує цілі рядки або символи з потоку, використовуючи буфер пам’яті (звідси назва Buffered — "з буфером").
Це робить зчитування набагато швидшим, ніж пряме читання з InputStream.

⚙️ Основні особливості:
Характеристика	Пояснення
📦 Пакет	java.io
🧾 Тип даних	Читає рядки або символи (String, char[])
⚡ Швидкодія	Дуже висока, бо використовує буфер (зазвичай 8192 байти)
🧰 Методи	readLine() — читає один рядок
read() — читає один символ або масив символів
🔠 Парсинг	Не парсить автоматично типи (усе читає як String)
🔐 Обробка винятків	Потрібно обробляти IOException
💬 Зручність	Менш зручний — потрібно вручну конвертувати рядки в числа (Integer.parseInt())
📚 Використання	Ідеально підходить для великих файлів, великих обсягів тексту або швидких алгоритмів введення

🧩 Приклад:
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String line = reader.readLine();          // читає цілий рядок
int number = Integer.parseInt(reader.readLine()); // потрібно вручну перетворити
 */

/*
🧠 Scanner
Scanner — це клас із пакету java.util, створений для зручного введення і парсингу даних різних типів (рядки, числа, логічні значення тощо).
🔍 Основна ідея
Scanner розділяє введений текст на токени (слова, числа), використовуючи пробіли або інші роздільники.
Він може автоматично розпізнавати тип даних і повертати готове значення (наприклад, int, double, boolean).

⚙️ Основні особливості:
Характеристика	Пояснення
📦 Пакет	java.util
🧾 Тип даних	Підтримує різні типи: String, int, double, boolean тощо
⚡ Швидкодія	Повільніший за BufferedReader, бо виконує розділення і парсинг
🧰 Методи	next(), nextLine(), nextInt(), nextDouble(), hasNext()
🔠 Парсинг	Автоматично визначає тип і перетворює
🔐 Обробка винятків	Не потребує IOException, але може кинути InputMismatchException
💬 Зручність	Дуже зручний у використанні, особливо для користувацького вводу
📚 Використання	Ідеальний для програм, які запитують дані в користувача або читають нескладні файли

🧩 Приклад:
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();  // читає рядок
int age = scanner.nextInt();       // автоматично читає число
 */

public class L06BufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //ввели і вивели СТР або ІНТ
        System.out.println("Введіть ІНТ або СТР");
        String input = reader.readLine();
        System.out.println(input);

        //ввели ІНТ , помножили на 2 і вивели
        System.out.println("Введіть ІНТ, щоб помножити на 2");
        int input2 = Integer.parseInt(reader.readLine());
        System.out.println(input2 * 2);

    }
}
