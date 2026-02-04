package Annotations;
class LegacyAPI{
    @Deprecated
    void oldfeature(){

        System.out.println("oldfeature");
    }

    void newfeature(){
        System.out.println("newfeature");
    }
}

public class DeprecatedAnnotation {
    public static void main(String[] args) {
        LegacyAPI legacyAPI = new LegacyAPI();
        legacyAPI.oldfeature();
        legacyAPI.newfeature();
    }
}
