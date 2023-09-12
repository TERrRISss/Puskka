public class Gun {
    private int ammo; //Пэтрики
    private int hit; //попадание
    private int endurance;//прочность
    private String type; //тип
    private String color; // цвет (Добавил Савчук В.)
    public Gun(int ammo, int hit, int endurance, String type, String color){
        this.ammo = ammo;
        this.hit = hit;
        this.endurance = endurance;
        this.type = type;
        this.color = color;
    }
    public String getColor() {
        return color;

    }
    public void setColor(String color){
        this.color = color;
    }
    public int getAmmo() {
        return ammo;

    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getHit() {
        return hit;
    }
    

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    void color(){
        System.out.println("Цвет оружия: " + this.getColor());
    }
    void ammo(){
        System.out.println("Кол-во патрон: " + this.getAmmo());
    }
    void  hit(){
        System.out.println("");
    }
    void endurance() {
        System.out.println("Ваше оружие сломано на" + this.getEndurance() + "процентов");
    }
    void type() {
        System.out.println("Вы выбрали" + this.getType() + "оружие");
    }
}

