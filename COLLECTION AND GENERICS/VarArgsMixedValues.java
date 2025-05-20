
 class MixedVarargs {
    public static void process(String label, Object... values) {
        System.out.println(label + ":");
        for (Object value : values) {
            System.out.println(value + " (" + value.getClass().getSimpleName() + ")");
        }
        System.out.println();
    }

    public class VarArgsMixedValues{
    public static void main(String... args) {
        try {
             process("Mixed Data", 10, "hello", 3.14, true);
             process("More Mixed Data", 'A', new int[]{1, 2, 3});
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Fix the code\n" + e.getMessage());
        }
       
    }
}
 }