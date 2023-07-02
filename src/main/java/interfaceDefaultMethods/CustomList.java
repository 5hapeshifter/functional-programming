package interfaceDefaultMethods;

import java.util.function.Consumer;

public interface CustomList {

    void add(int item);
    int size();
    int get(int index);

    // metodos default devem ter implementacoes e nao sao sobrescritos
    default void forEach(Consumer<Integer> consumer){
        for (int i = 0; i < size(); i++) {
            consumer.accept(get(i));
        }
    }

}
