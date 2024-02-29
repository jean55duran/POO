package People;

public class Character {
        
        String name;
        int age;
        char gender;
        String Phrase;
        
        public Character(String name, int age, char gender, String Phrase) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.Phrase = Phrase;
    }
        
        public void saySomething(){
            System.out.println(this.Phrase);
        }
        
        public Character(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhrase() {
        return Phrase;
    }

    public void setPhrase(String Phrase) {
        this.Phrase = Phrase;
    }
        
        
    }

