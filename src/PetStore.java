/**
 * Created by allen on 11/8/15.
 */
public class PetStore {
    public static void main(String[] args) {
        String dogName = Puppy.name;
        String dogKind = Puppy.type;
        String dogColor = Puppy.color;
        System.out.println("I have a smart " + dogKind +
                " dog, he's name is " + dogName +
                ", he's color is " + dogColor + ".");
        System.out.print("he help me everyday ");
        String dogSkill = Puppy.skill2();
        System.out.println(dogSkill);
        Puppy.skill2();

    }
}
