package zadanie10.domowe4.ExcAndEnum;

public enum Options {
   TURN_OFF (0,"Wyłącz komputer"),
    SPEED_UP_PROC(1,"Przyspiesz procesor"),
    SLOW_DOWN_PROC (2,"Zwolnij procesor"),
    SPEED_UP_RAM (3,"Przyspiesz RAM"),
    SLOW_DOWN_RAM (4,"Zwolnij RAM"),
    CHECK_STATUS(5,"Sprawdź status RAMu i procesora"),
   CHECK_FULL_STATUS(6,"Zobacz wszystkie informacje na temat komputera");
   private String description;
   private int value;
   Options(int val, String desc){
       value = val;
       description = desc;
   }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
