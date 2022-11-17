class GrandParent{
    String grandFathername;
    String grandMothername;

    public GrandParent(String grandFathername, String grandMothername) {
        this.grandFathername = grandFathername;
        this.grandMothername = grandMothername;
        System.out.println("Grandfather name: "+grandFathername+" Grandmother name: "+grandMothername);
    }
}

class Parent extends GrandParent{
    String fatherName;
    String motherName;

    public Parent(String fatherName, String motherName, String grandFathername, String grandMothername){
        this(grandFathername, grandMothername);
        this.fatherName=fatherName;
        this.motherName=motherName;
        System.out.println("Father name: "+fatherName+" Mother name: "+motherName);
    }

    public Parent(String grandFathername, String grandMothername) {
        super(grandFathername, grandMothername);
    }
}

class Child extends Parent {

    public Child(String fatherName, String motherName, String grandFathername, String grandMothername) {
        super(fatherName, motherName, grandFathername, grandMothername);
    }

    public static void main(String[] args) {
        Child child1 = new Child("father1", "mother1", "gradnfather1", "grandmother1");
    }
}
