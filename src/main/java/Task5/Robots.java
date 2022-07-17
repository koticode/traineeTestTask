package Task5;

//Абстракция
//При ООП, в этом классе, и в его наследниках, реализуется принцип абстракции.
// Т.е. я выделяю только главные свойства робота в рамках задачи 5.
// А это назначение+профильный навык+вид оружия(для боевых роботов), тип топлива+критерии момента заправки, способ перемещения. Нам не важен, например, материал изготовления робота, его производитель и т.п.
//Способ перемещения по условию задачи не конкретизирован, поэтому все роботы будут с общим описанием способа перемещения "Я могу перемещаться(ходить, ездить или летать)".
// Классы по способу передвижения я выделять не стал, т.к. по условию задачи конкретизация здесь не нужна(требуется создать 9 объектов со всеми комбинациями назначение+вид топлива). Классы создаются для их практического применения, для способа перемещения я их не увидел.
// Но каждый робот "знает", что он может ходить, ездить или летать. Перемещение отражено в суперклассе, и этого достаточно в рамках задачи.
public abstract class Robots extends Object { // Наследование. Указывать наследование от Object не обязательно, любой класс по умолчанию наследуется от него. Просто показал, что это так.
    public String movementType;
    public String purposeType;
    public String fuelType;
    public String getPurposeType() {
        return purposeType;
    }
    public String getFuelType() {
        return fuelType;
    }
    public Robots(String purpose, String fuel) { // Конструктор, по которому будем создавать объекты-роботов по условию задачи (2 обязательных конкретных значения, а перемещение всем объектам будет устанавливаться по умолчанию)
        purposeType = purpose; // Назначение будет задаваться в конструкторе при создании объектов из наследующих классов.
        fuelType = fuel; // Тип топлива будет задаваться в конструкторе при создании объектов из наследующих классов.
        movementType = "Я могу перемещаться(ходить, ездить или летать)"; //в рамках этой задачи всем роботам способ передвижения устанавливается по умолчанию обобщенно-"Я могу перемещаться(ходить, ездить или летать" . Т.е. каждый созданный объект удовлетворяет этому тезису.
        // Значение movementType можно переопределять для уже созданного объекта, и таким образом задать способ перемещения конкретнее(например, "ходит")
    }
    public void aboutMe() { // вспомогательный метод, который сообщает исчерпывающую информацию о роботе
        Purpose(); // Робот сообщает свое назначение
        Skill(); // демонстрирует свою работу
        Fuel(); // сообщает вид топлива
        Movement(); // сообщает способ перемещения
        AskFuel();
    }
    // Каждый робот умеет перемещаться одним из 3-х способов(ходить, ездить или летать). Поэтому добавлен метод Movement, но не конкретизирован.
    // При желании, каждому из созданных роботов можно будет переопределить этот метод, изменив значение movementType на конкретное "ходить", к примеру.
    public void Movement() {
        System.out.println(movementType);
    }
    //В этом классе метод содержит общую информацию о том, что у представителя класса есть назначение. Конкретизироваться назначение будет через переопределение метода Purpose в наследующих классах.
    public void Purpose() {
        System.out.println("У меня есть назначение");
    }
    // Каждый робот умеет как-то работать, в зависимости от назначения(стрелять, сваривать детали или варить)
    // В каждом выделенном по назначению классе(FightRobot,WadleRobot,CookRobot) метод будет переопределяться на конкретное умение.
    public void Skill() {
        System.out.println("У каждого робота есть профильный навык(для каждого назначения свой)");
    }
    // Каждый робот имеет тип топлива(атомное, бензин+дизель=горючее или электрическое)
    // В каждом выделенном по типу топлива классе(название таких классов заканчивается на _Nuclear,_Combustion,_Electric) метод будет переопределяться на конкретный вид топлива.
    public void Fuel() { // !!!!!!!!!!!!!!!!!для каждого класса этот метод будет конкретезироваться
        System.out.println("У меня есть тип топлива");
    }

    // Робот может запрашивать топливо, когда наступает момент для заправки. Для демонстрации заправки каждого робота критерии заданы равными
    int timePassed = 50; // 50 лет проходит, и робот на атомном типе топлива попросит заправку
    int volumeLeft=0; // робот на горючем топливе попросит заправку при опустошении бака
    int chargePercentage=20; // робот на электричестве попросить подзарядку, когда заряд достигнет 20%
    public String needFuel; // когда поле примет значение "Заправьте меня, пожалуйста", робот попросит заправку

    public String getNeedfuel() {
        return needFuel;
    } // Getter для обращения из класса Main

    //Робот при необходимости запрашивает заправку. Он определяет, настал ли момент для заправки, и делает запрос с помощью метода AskFuel.
    public void AskFuel() {
        if ((getFuelType().equals("атомное")  && timePassed == 50) | (getFuelType().equals("горючее")  && volumeLeft == 0) | (getFuelType().equals("электрическое")  && chargePercentage<=20)) {
            needFuel = "Заправьте меня, пожалуйста";
            System.out.println(needFuel);
        }
        else needFuel="Заправка не нужна";
    }
}










