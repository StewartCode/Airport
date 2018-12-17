public enum Type {
    BOEING747(400),
    AIRBUSA380(800),
    BOEING777(200),
    AIRBUSA340(600),
    AIRBUSA350(900),
    AIRBUSA330(500);

    private final int value;

    Type(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}


