package lesson5_7.Immutable;

public class TestClass {

    public static void main(String[] args) {

//        StringBuilder sb = new StringBuilder("инициализируем");
//        NotImmutableSb problem = new NotImmutableSb(sb);
//        sb.append(" добавим текст");
//        StringBuilder gotBuilder = problem.getBuilder();
//        gotBuilder.append(" добавим больше текста");
//        System.out.println(problem.getBuilder());

        StringBuilder sb2 = new StringBuilder("инициализируем");
        ImmutableSb notProblem = new ImmutableSb(sb2);
        sb2.append(" добавим текст");
//        StringBuilder gotBuilder2 = notProblem.getBuilder();
        String gotBuilder2 = notProblem.getBuilder();
//        gotBuilder2.append(" добавим больше текста");
        gotBuilder2.concat(" добавим больше текста");
        System.out.println(notProblem.getBuilder());
    }
}
